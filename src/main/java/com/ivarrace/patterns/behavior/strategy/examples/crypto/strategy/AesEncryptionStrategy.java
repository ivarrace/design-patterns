package com.ivarrace.patterns.behavior.strategy.examples.crypto.strategy;

import org.apache.log4j.Logger;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;
import java.util.Optional;

/**
 * Implementación de los métodos de cifrado/descifrado AES
 */
public class AesEncryptionStrategy implements EncryptionStrategy {

    private static final Logger LOGGER = Logger.getLogger(AesEncryptionStrategy.class);

    public SecretKeySpec setKey(String myKey) {
        MessageDigest sha = null;
        try {
            byte[] key = myKey.getBytes(StandardCharsets.UTF_8);
            sha = MessageDigest.getInstance("SHA-1");
            key = sha.digest(key);
            key = Arrays.copyOf(key, 16);
            return new SecretKeySpec(key, "AES");
        } catch (NoSuchAlgorithmException e) {
            LOGGER.error(e);
        }
        return null;
    }

    /**
     * Cifrado AES
     *
     * @param strToEncrypt
     * @param secret
     * @return
     */
    @Override
    public Optional<String> encrypt(String strToEncrypt, String secret) {
        try {
            SecretKeySpec secretKey = setKey(secret);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            return Optional.of(Base64.getEncoder().encodeToString(cipher.doFinal(strToEncrypt.getBytes(StandardCharsets.UTF_8))));
        } catch (Exception e) {
            LOGGER.error("Error while encrypting: " + e.toString());
        }
        return Optional.empty();
    }

    /**
     * Descifrado AES
     *
     * @param strToDecrypt
     * @param secret
     * @return
     */
    @Override
    public Optional<String> decrypt(String strToDecrypt, String secret) {
        try {
            SecretKeySpec secretKey = setKey(secret);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            return Optional.of(new String(cipher.doFinal(Base64.getDecoder().decode(strToDecrypt))));
        } catch (Exception e) {
            LOGGER.error("Error while decrypting: " + e.toString());
        }
        return Optional.empty();
    }

}
