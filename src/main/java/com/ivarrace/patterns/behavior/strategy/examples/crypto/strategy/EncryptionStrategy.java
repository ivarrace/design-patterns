package com.ivarrace.patterns.behavior.strategy.examples.crypto.strategy;

import java.util.Optional;

/**
 * Interfaces que implementarán las clases strategy
 */
public interface EncryptionStrategy {

    /**
     * Método de cifrado.
     *
     * @param plainText
     * @param secret
     * @return Optional String
     */
    Optional<String> encrypt(String plainText, String secret);

    /**
     * Metodo de descifrado
     *
     * @param cryptText
     * @param secret
     * @return Optional String
     */
    Optional<String> decrypt(String cryptText, String secret);
}
