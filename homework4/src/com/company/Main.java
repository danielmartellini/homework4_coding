//Author: Daniel Martellini 2020356
//Homework4 - lecturer: Ken.
package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);//initializing the scanner
        int counter= 0;//using a counter to ger out at the loop in case the input data is valid

        while ( counter != 1){


            System.out.println("Enter your age: ");


            try {// so the code wont crash in case the input is not a int

                int age = reader.nextInt();


                if (age < 0){
                    System.out.println("Wait until you're born to use this program");
                    counter++;}
                else if (age < 18){
                    System.out.println("Too young to vote");
                    counter++;}
                else if (age < 66){
                    System.out.println("Working hard?");
                    counter++;}
                else if (age<100){
                    System.out.println("Enjoy retirement");
                    counter++;}
                else {
                    System.out.println("You are probably one of the oldest people alive");
                    counter++;}


            }
            catch (Exception e) {//in case the input wasnt and integer

                String age = reader.next();//so we can scan what was entered previously and just ignore it and ask for a new input
                System.out.println("Age must be an integer!, you entered : "+age);



            }

        }
        System.out.println("Finished");//just to show you are out of the loop

    }
}









