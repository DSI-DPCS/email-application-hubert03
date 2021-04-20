package com.drh.lesson;

public class Email {
    private String username;
    private String domain;
    private String passwords;
    private int capacity;


    public Email(String fisrt, String last, int code){
        username = fisrt + "." + last;
        switch (code){
            case 0:
                domain = "CathyBio.com";
            case 1:
                domain = "sales.CathyBio.com";
            case 2:
                domain = "dev.CathyBio.com";
            case 3:
                domain = "acct.CathyBio.com";
        }
        passwords = pswdGenerate(8);
    }

    private String pswdGenerate(int num){
        String all = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String buffer = "";

        for (int i = 0; i < num; i++) {
            buffer = buffer + all.charAt((int)(Math.random() * 62));
        }

        return buffer;
    }

    public void setPasswords(String passwords) {
        this.passwords = passwords;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void getInfo() {
        System.out.println("Name: " + username.split("\\.")[0] + " " + username.split("\\.")[1]);
        System.out.println("Mail: " + username + "@" + domain);
        //System.out.println(passwords);
        System.out.println("Mailbox Capacity: " + String.valueOf(capacity));
    }
}
