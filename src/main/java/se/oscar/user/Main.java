package se.oscar.user;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        User user = new User("Oscar", 1234);

        System.out.println("Whats your username: ");
        String temp1 = scan.next();
        System.out.println("Whats your password: ");
        int temp2 = scan.nextInt();

        if (Objects.equals(temp1, user.getUsername()) && temp2 == user.getPassword()) {
            System.out.println("Welcome " + user.getUsername() + "!");
        } else {
            System.out.println("Wrong password!");
        }
    }
}
