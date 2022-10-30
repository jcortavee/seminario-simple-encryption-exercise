package com.umg;


public class Main {
    public static void main(String[] args) {

        final var text = "HKPX";
        System.out.println("Original: %s".formatted(text));

        // Encrypt
        var encryptedText = UMGAlgorithm.encrypt(text);
        System.out.println("Texto encriptado: %s".formatted(encryptedText));

        // Decrypt
        System.out.println("Texto desencriptado: %s".formatted(UMGAlgorithm.decrypt(encryptedText)));

    }
}
