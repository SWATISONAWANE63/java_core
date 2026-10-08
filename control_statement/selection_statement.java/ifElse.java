// package control_statement.selection_statement.java;

import java.text.ListFormat.Style;

public class ifElse {
    public static void main(String[] args) {
        // int age=3;
        // if(age>=18){
        // System.out.println("Adult");
        // System.out.println("You can vote!!!!!!!");

        // }else{
        // System.out.println("minor");
        // }
        // int marks = 10;
        // if (marks >= 90) {
        // System.out.println("Grade A");
        // } else if (marks >= 75) {
        // System.out.println("Grade B");
        // } else if (marks >= 65) {
        // System.out.println("Grade C");
        // } else if (marks >= 55) {
        // System.out.println("Grade E");
        // } else {
        // System.out.println("Grade F");
        // }
        // }
        // int age = 23;
        // String result = (age >= 18) ? "adult" : "minor";
        // System.out.println(result);
        int day = 1;
        switch (day) {
            case 1:
                System.out.println("Sunday");

                break;
            case 2:
                System.out.println("Monday");

                break;
            case 3:
                System.out.println("Tuesday");

                break;
            case 4:
                System.out.println("wednesday");
            case 5:
                System.out.println("thurday");

                break;
            case 6:
                System.out.println("friday");

                break;
            case 7:
                System.out.println("saturday");

                break;

            default:
                System.out.println("Invaild day");
                break;
        }
    }
}