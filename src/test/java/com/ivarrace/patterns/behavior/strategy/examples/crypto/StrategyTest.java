package com.ivarrace.patterns.behavior.strategy.examples.crypto;

import com.ivarrace.patterns.behavior.strategy.examples.crypto.strategy.BlowfishEncryptionStrategy;
import com.ivarrace.patterns.behavior.strategy.examples.crypto.strategy.AesEncryptionStrategy;
import org.junit.Assert;
import org.junit.Test;

public class StrategyTest {

    private static final String PLAIN_TEXT = "Texto a cifrar";
    private static final String SECRET_KEY = "secret!";

    @Test
    public void test_distinct_encrypt() {
        Encryptor aesEncryptor = new Encryptor(new AesEncryptionStrategy());
        Encryptor blowfishEncryptor = new Encryptor(new BlowfishEncryptionStrategy());

        String aesEncrypt = aesEncryptor.encrypt(PLAIN_TEXT, SECRET_KEY);
        String blowfishEncrypt = blowfishEncryptor.encrypt(PLAIN_TEXT, SECRET_KEY);
        //El método encrypt procesa la cadena de forma distinta, en funcion del strategy
        Assert.assertNotEquals("Cifrados distintos en cada strategy", aesEncrypt, blowfishEncrypt);

        String aesDecrypt = aesEncryptor.decrypt(aesEncrypt, SECRET_KEY);
        String blowfishDecrypt = blowfishEncryptor.decrypt(blowfishEncrypt, SECRET_KEY);
        Assert.assertEquals("El cifrado funciona correctamente", aesDecrypt, blowfishDecrypt);
    }

}