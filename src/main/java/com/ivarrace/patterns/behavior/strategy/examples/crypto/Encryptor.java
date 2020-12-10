package com.ivarrace.patterns.behavior.strategy.examples.crypto;

import com.ivarrace.patterns.behavior.strategy.examples.crypto.strategy.EncryptionStrategy;

/**
 * Esta será la clase principal que utilizará la aplicación. Para el ejemplo se ha decidido utilizar un cifrador, en
 * el que definiremos un metodo de cifrado y otro de descifrado, que se implementarán en distinas clases (Strategy)
 */
public class Encryptor {

    private EncryptionStrategy strategy;

    /**
     * En el constructor se setea el strategy
     *
     * @param strategy
     */
    public Encryptor(EncryptionStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Método para cifrar. Todas las clases que implementen {@link EncryptionStrategy} tienen su propia
     * implementación del método
     *
     * @param plainText
     * @param secretKey
     * @return
     */
    public String encrypt(String plainText, String secretKey) {
        // Si el encrypt no devuelve nada, procesar como proceda
        return strategy.encrypt(plainText, secretKey).orElse("*");
    }

    /**
     * Método para descifrar. Todas las clases que implementen {@link EncryptionStrategy} tienen su propia
     * implementación del método
     *
     * @param plainText
     * @param secretKey
     * @return
     */
    public String decrypt(String plainText, String secretKey) {
        // Si el decrypt no devuelve nada, procesar como proceda
        return strategy.decrypt(plainText, secretKey).orElse("*");
    }
}
