package com.cobo.waas2.auth;

import net.i2p.crypto.eddsa.EdDSAEngine;
import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.Utils;
import net.i2p.crypto.eddsa.spec.EdDSANamedCurveTable;
import net.i2p.crypto.eddsa.spec.EdDSAParameterSpec;
import net.i2p.crypto.eddsa.spec.EdDSAPrivateKeySpec;

import java.io.UnsupportedEncodingException;
import java.security.*;

import static com.cobo.waas2.CryptoUtils.hashTwice;

public class LocalEd25519Signer implements Signer{

    private final String privateKey;

    public LocalEd25519Signer(String privateKey) {
        this.privateKey = privateKey;
    }

    @Override
    public String sign(String message) {

        try {
            byte[] hashedMessage = hashTwice(message);
            EdDSAParameterSpec spec = EdDSANamedCurveTable.getByName(EdDSANamedCurveTable.ED_25519);
            Signature signature = new EdDSAEngine(MessageDigest.getInstance(spec.getHashAlgorithm()));
            EdDSAPrivateKeySpec privKey = new EdDSAPrivateKeySpec(Utils.hexToBytes(privateKey), spec);
            PrivateKey sKey = new EdDSAPrivateKey(privKey);
            signature.initSign(sKey);
            signature.update(hashedMessage);
            return Utils.bytesToHex(signature.sign());
        } catch (InvalidKeyException | SignatureException | NoSuchAlgorithmException | UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getPublicKey() {
        EdDSAParameterSpec spec = EdDSANamedCurveTable.getByName(EdDSANamedCurveTable.ED_25519);
        EdDSAPrivateKeySpec privKey = new EdDSAPrivateKeySpec(Utils.hexToBytes(privateKey), spec);
        return Utils.bytesToHex(privKey.getA().toByteArray());
    }
}
