package com.test;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA_test {

    String hashPassword;

    public String encrypt(String text) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(text.getBytes());

        return bytesToHex(md.digest());
    }

    private String bytesToHex(byte[] bytes){
        StringBuilder builder = new StringBuilder();
        for (byte b : bytes){
            builder.append(String.format("%02x",b));
        }
        return builder.toString();
    }

    public String executeHash() throws NoSuchAlgorithmException {
        SHA_test sha_test = new SHA_test();

        String password = "123123";

        hashPassword = sha_test.encrypt(password);

        return hashPassword;
    }

    public static void main(String[] args) throws NoSuchAlgorithmException {
        SHA_test sha = new SHA_test();
        System.out.println(sha.executeHash());
    }
}
