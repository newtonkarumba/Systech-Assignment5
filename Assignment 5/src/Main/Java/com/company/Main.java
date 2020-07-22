package com.company;

import java.util.Scanner;
import java.util.Stack;

public class Main {


    public static void main(String[] args) {
        int n;
	/*Steps:
	1. Make a students linked list
	2. Make a teachers linked list
	3. Make a grades linked list
	4. Make a menu
	5. Add Functions like view Students View teachers add new, Delete all, Delete staff

	*/
        //   Staff stude = new Staff();
        // stude.getStudent();
        // stude.getTeacher();
        //    stude.getGrade();

        for (n=1; n<=20; n++){
            System.out.println("Welcome to Highschool! What would you like to do? ");
            System.out.println("1: View Students ");
            System.out.println("2: View Teachers ");
            System.out.println("3: View Grades ");
            System.out.println("4: Delete all ");
            System.out.println("5: Add student  ");
            Scanner scanner2 = new Scanner(System.in);
             n = scanner2.nextInt();

            Staff stude = new Staff();

            switch (n){
                case 1:
                stude.getStudent();
                break;
                case 2:
                stude.getTeacher();
                break;
                case 3:
                stude.getGrades();
                break;
                case 4:
                stude.clearStudent();
                stude.clearTeacher();
                break;
                case 5:
                    stude.addStudent();
                    stude.getStudent();
                    break;
                case 6:
                    stude.addTeacher();
                    stude.getTeacher();

                default:
                    System.out.println("You have entered the wrong value");
            }
        }
    }
}

