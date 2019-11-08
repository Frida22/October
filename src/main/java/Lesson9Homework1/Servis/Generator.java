package Lesson9Homework1.Servis;

import org.apache.commons.lang3.RandomStringUtils;

public class Generator {

    public String generateRandomMail() {
        StringBuilder builderMail = new StringBuilder();
        String mailFirst = RandomStringUtils.randomAlphabetic(5).toLowerCase();
        String mailThird = RandomStringUtils.randomAlphabetic(4).toLowerCase();
        String mailFive = RandomStringUtils.randomAlphabetic(3).toLowerCase();
        String mailSecond = "@";
        String mailFour = ".";
        builderMail.append(mailFirst).append(mailSecond).append(mailThird).append(mailFour).append(mailFive);
        return builderMail.toString();
    }

    public String generateRandomString() {
        return generateRandomString(5);
    }

    public String generateRandomString(int size) {
        StringBuilder builder = new StringBuilder();
        String nameFirsLetter = RandomStringUtils.randomAlphabetic(1).toUpperCase();
        String name = RandomStringUtils.randomAlphabetic(size).toLowerCase();
        builder.append(nameFirsLetter).append(name);
        return builder.toString();
    }

    public String generateRandomPassword() {
        return RandomStringUtils.randomAlphabetic(5);
    }

    public String generateRandomPostalCode() {
        StringBuilder builder = new StringBuilder();
        int postalCode = 10000 + (int) (Math.random() * 99999);
        builder.append(postalCode);
        return builder.toString();
    }

    public String generateRandomPhone() {
        StringBuilder builder = new StringBuilder();
        int phone = 1000000000 + (int) (Math.random() * 999999999);
        builder.append(phone);
        return builder.toString();
    }
}
