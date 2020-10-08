package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input password:");
        String pass = scanner.next();

        if (isValid(pass)) {
            System.out.println("valid");
        } else {
            System.out.println("not valid");
        }
    }

    private static boolean isValid(String s) {
        final int PASSWORD_LENGTH = 10;
        int charCount = 0;
        int numCount = 0;

        if (s.length() < PASSWORD_LENGTH) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (isNum(ch)) {
                numCount++;
            } else if (isLetter(ch)) {
                charCount++;
            } else {
                return false;
            }
        }
        return (charCount >= 2 && numCount >= 2);
    }

    private static boolean isLetter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }

    private static boolean isNum(char ch) {
        return (ch >= '0' && ch <= '9');
    }
}
