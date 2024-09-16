package se.oscar.scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Vad heter du? ");
        String temp1 = scan.next();
        System.out.println("Hur gammal är du? ");
        int temp2 = scan.nextInt();
        System.out.println("Vilket yrke har du? ");
        String temp3 = scan.next();

        Person person = new Person(temp1, temp2, temp3);
        person.Introduce();

        System.out.println("Du har bytt yrke, vilket yrke har du nu? ");
        person.setJob(scan.next());

        person.Introduce();
    }
}
