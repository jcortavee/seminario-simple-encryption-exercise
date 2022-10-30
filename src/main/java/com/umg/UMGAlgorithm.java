package com.umg;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UMGAlgorithm {

    public static String encrypt(String s) {
        List<Integer> encryptedString = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            encryptedString.add((int) s.charAt(i));
        }

        encryptedString = encryptedString.stream().map(number -> {
            if (number % 2 == 0) {
                return number + (s.length() * 2);
            } else {
                return number + s.length();
            }
        }).collect(Collectors.toList());

        final var sb = new StringBuilder();

        encryptedString.forEach(e -> {
            sb.append((char) e.intValue());
        });

        return sb.toString();
    }

    public static String decrypt(String s) {
        List<Integer> decryptedString = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            decryptedString.add((int) s.charAt(i));
        }

        decryptedString = decryptedString.stream().map(number -> {
            if (number % 2 == 0) {
                return number - (s.length() * 2);
            } else {
                return number - s.length();
            }
        }).collect(Collectors.toList());

        final var sb = new StringBuilder();

        decryptedString.forEach(e -> {
            sb.append((char) e.intValue());
        });

        return sb.toString();
    }

}
