package Lesson9.Servis;

import org.apache.commons.lang3.RandomStringUtils;

public class Generator {
    String nameFirsLetter;
    String name;
    String mailFirst;
    String mailSecond = "@";
    String mailThird;
    String mailFour = ".";
    String mailFive;
    String password;

    public static void main(String[] args) {
        Generator a = new Generator();
        a.generateRandomString(9);
        a.generateRandomMail();
        a.generateRandomPassword();
        a.generateRandomPhone();

    }

    public StringBuilder generateRandomMail() {
        StringBuilder builderMail = new StringBuilder();
        mailFirst = RandomStringUtils.randomAlphabetic(5).toLowerCase();
        mailThird = RandomStringUtils.randomAlphabetic(4).toLowerCase();
        mailFive = RandomStringUtils.randomAlphabetic(3).toLowerCase();
        builderMail.append(mailFirst).append(mailSecond).append(mailThird).append(mailFour).append(mailFive);
        return(builderMail);

    }

    public StringBuilder generateRandomString(int size) {
        StringBuilder builder = new StringBuilder();
        nameFirsLetter = RandomStringUtils.randomAlphabetic(1).toUpperCase();
        name = RandomStringUtils.randomAlphabetic(size).toLowerCase();
        builder.append(nameFirsLetter).append(name);
        return builder;

    }
    public String generateRandomPassword(){
        password = RandomStringUtils.randomAlphabetic(5);
        return password;

    }
    public StringBuilder generateRandomPhone(){
        StringBuilder builder = new StringBuilder();
        int phone = 1000000000 + (int)(Math.random() * 999999999);
        builder.append(phone);
        return builder;
    }
}
