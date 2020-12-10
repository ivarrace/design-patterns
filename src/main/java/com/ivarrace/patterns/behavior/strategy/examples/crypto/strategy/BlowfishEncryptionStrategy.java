package com.ivarrace.patterns.behavior.strategy.examples.crypto.strategy;

import org.apache.log4j.Logger;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Optional;

/**
 * Implementación de los métodos de cifrado/descifrado Blowfish
 */
public class BlowfishEncryptionStrategy implements EncryptionStrategy {

    private static final Logger LOGGER = Logger.getLogger(BlowfishEncryptionStrategy.class);
    private static final String CIPHER_TYPE = "Blowfish";
    private static final String MESSAGE_DIGEST = "SHA-1";

    /**
     * Cifrado Blowfish
     *
     * @param strToEncrypt
     * @param secret
     * @return
     */
    @Override
    public Optional<String> encrypt(String strToEncrypt, String secret) {
        try {
            byte[] key = secret.getBytes(StandardCharsets.UTF_8);
            MessageDigest sha = MessageDigest.getInstance(MESSAGE_DIGEST);
            key = sha.digest(key);
            key = Arrays.copyOf(key, 16);
            SecretKeySpec secretKey = new SecretKeySpec(key, CIPHER_TYPE);
            Cipher cipher = Cipher.getInstance(CIPHER_TYPE);
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            return Optional.of(Base64.getEncoder().encodeToString(cipher.doFinal(strToEncrypt.getBytes(StandardCharsets.UTF_8))));
        } catch (Exception e) {
            LOGGER.error("Error while encrypting: " + e.toString());
        }
        return Optional.empty();
    }

    /**
     * Descifrado Blowfish
     *
     * @param strToDecrypt
     * @param secret
     * @return
     */
    @Override
    public Optional<String> decrypt(String strToDecrypt, String secret) {
        try {
            byte[] key = secret.getBytes(StandardCharsets.UTF_8);
            MessageDigest sha = MessageDigest.getInstance(MESSAGE_DIGEST);
            key = sha.digest(key);
            key = Arrays.copyOf(key, 16);
            SecretKeySpec secretKey = new SecretKeySpec(key, CIPHER_TYPE);
            Cipher cipher = Cipher.getInstance(CIPHER_TYPE);
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            return Optional.of(new String(cipher.doFinal(Base64.getDecoder().decode(strToDecrypt))));
        } catch (Exception e) {
            LOGGER.error("Error while decrypting: " + e.toString());
        }
        return Optional.empty();
    }

}
