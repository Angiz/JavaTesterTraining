package com.test.exceptions;
import java.util.Scanner;

public class AgeTest {

    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();


        if (age < 0) {
            try {
                throw new InvalidAgeException("Invalid age value (Age cannot be lower than 0!)");
            } catch (InvalidAgeException e) {
                e.printStackTrace();
            }
        }
        else if (age > 0 && age < 18){
            System.out.println("Your age is proper but still you cannot buy alcohol!");
        }
        else {
            System.out.println("You can buy alcohol!");
        }
    }


}
