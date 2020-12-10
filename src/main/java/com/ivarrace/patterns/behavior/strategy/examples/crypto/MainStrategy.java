package com.ivarrace.patterns.behavior.strategy.examples.crypto;

import com.ivarrace.patterns.behavior.strategy.examples.crypto.strategy.BlowfishEncryptionStrategy;
import com.ivarrace.patterns.behavior.strategy.examples.crypto.strategy.AesEncryptionStrategy;
import org.apache.log4j.Logger;

/**
 * El patrón estrategia permite mantener un conjunto de algoritmos de entre los cuales el objeto cliente puede elegir
 * aquel que le conviene e intercambiarlo dinámicamente según sus necesidades.
 */
public class MainStrategy {

    private static final Logger LOGGER = Logger.getLogger(MainStrategy.class);
    private static final String SECRET_KEY = "secret!";

    public static void main(String[] args) {
        /*
         * Probamos que el Encryptor procesa los datos de forma distinta en función del strategy con el que se instancie
         */

        // Creamos el cifrador, con su forma de procesar la información (Strategy)
        Encryptor aesEncryptor = new Encryptor(new AesEncryptionStrategy());
        // Probamos el cifrado y descifrado
        String resultEncrypt = aesEncryptor.encrypt("Prueba de cifrado AES", SECRET_KEY);
        String resultDecrypt = aesEncryptor.decrypt(resultEncrypt, SECRET_KEY);
        //Vemos los resultados
        LOGGER.info("Encryptor[AES] -> cadena cifrada: " + resultEncrypt);
        LOGGER.info("Encryptor[AES] -> cadena descifrada: " + resultDecrypt);

        // Creamos el cifrador, con su forma de procesar la información (Strategy)
        Encryptor blowfishEncryptor = new Encryptor(new BlowfishEncryptionStrategy());
        // Probamos el cifrado y descifrado
        resultEncrypt = blowfishEncryptor.encrypt("Prueba de cifrado Blowfish", SECRET_KEY);
        resultDecrypt = blowfishEncryptor.decrypt(resultEncrypt, SECRET_KEY);
        LOGGER.info("Encryptor[Blowfish] -> cadena cifrada: " + resultEncrypt);
        LOGGER.info("Encryptor[Blowfish] -> cadena descifrada: " + resultDecrypt);

    }
}
