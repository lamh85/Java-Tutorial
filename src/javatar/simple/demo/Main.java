package javatar.simple.demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hey! What's your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        int fizz;
        fizz = 5;
        System.out.println("The value of fizz is: " + fizz);
    }

}