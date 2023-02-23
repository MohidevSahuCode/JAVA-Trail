package com.trial.trial;
import java.util.Scanner;
public  class HelloApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your name : ");
        String name = sc.nextLine();

        int number = (int)(Math.random()*100);
        int usernum = 0;
        do{
            System.out.println("Guess the number(1 - 100) : ");
             usernum = sc.nextInt();

            if(usernum == number){
                System.out.println("Hooray you did it "+name);
                break;
            }
            else if (usernum < number) {
                System.out.println("Your number is less please increase it.");
            }
            else
                System.out.println("Your number is greater please decrease it.");

        }while(usernum >=0);

        System.out.println("The correct number is "+number);

    }
}