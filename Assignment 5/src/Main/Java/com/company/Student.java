package com.company;
import java.util.*;

public class Student   {
    public char Grade;
    public char English;
    public char Kiswahili;
    public char Maths;
    public char Science;
    public Node<String> head;
    public Node<String> tail;
    public int currentSize;



   class Node<T>{
        private T data;
        private Node<T> next;

        public T getData(){
            return this.data;
        }
        public void setData(T newData){
            this.data=newData;
        }
        public Node<T> getNext(){
            return this.next;
        }
        public void setNext(Node<T> newNext){
            this.next=newNext;
        }
    }

    public static void getGrade(){
        Collection <String> grades = new LinkedList<>();

        System.out.println("Please assign grades for John");
        System.out.println("How much did he get for English");
        Scanner english = new Scanner(System.in);
        grades.add("English: " + english.nextLine());
        System.out.println("confirm: ");
        System.out.println("English was: " + english.nextLine());


        System.out.println("How much did he get for Kiswahili");
        Scanner Kiswahili = new Scanner(System.in);
        System.out.println("Kiswahili was: " + Kiswahili.nextLine());
        System.out.println("confirm: ");
        grades.add("Kiswahili: " + Kiswahili.nextLine());

        System.out.println("How much did he get for Math");
        Scanner Math = new Scanner(System.in);
        System.out.println("Math was: " + Math.nextLine());
        System.out.println("confirm: ");
        grades.add("Math: " + Math.nextLine());

        System.out.println("How much did he get for Science");
        Scanner Science = new Scanner(System.in);
        System.out.println("Science was: " + Science.nextLine());
        System.out.println("confirm: ");
        grades.add("Science: " + Science.nextLine());

        System.out.println("John's grades were: ");
      //  Collection <String> grades = new LinkedList<>();
     // grades.add("English: " + english.nextLine());
      //  grades.add("Kiswahili: " + Kiswahili.nextLine());
       // grades.add("Math: " + Math.nextLine());
       // grades.add("Science: " + Science.nextLine());


        Iterator<String> itr = grades.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
    public static void getGrade2(){
        Collection <String> grades = new LinkedList<>();

        System.out.println("Please assign grades for James");
        System.out.println("How much did he get for English");
        Scanner english = new Scanner(System.in);
        grades.add("English: " + english.nextLine());
        System.out.println("confirm: ");
        System.out.println("English was: " + english.nextLine());


        System.out.println("How much did he get for Kiswahili");
        Scanner Kiswahili = new Scanner(System.in);
        System.out.println("Kiswahili was: " + Kiswahili.nextLine());
        System.out.println("confirm: ");
        grades.add("Kiswahili: " + Kiswahili.nextLine());

        System.out.println("How much did he get for Math");
        Scanner Math = new Scanner(System.in);
        System.out.println("Math was: " + Math.nextLine());
        System.out.println("confirm: ");
        grades.add("Math: " + Math.nextLine());

        System.out.println("How much did he get for Science");
        Scanner Science = new Scanner(System.in);
        System.out.println("Science was: " + Science.nextLine());
        System.out.println("confirm: ");
        grades.add("Science: " + Science.nextLine());

        System.out.println("James' grades were: ");
        //  Collection <String> grades = new LinkedList<>();
        // grades.add("English: " + english.nextLine());
        //  grades.add("Kiswahili: " + Kiswahili.nextLine());
        // grades.add("Math: " + Math.nextLine());
        // grades.add("Science: " + Science.nextLine());


        Iterator<String> itr = grades.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
    public static void getGrade3(){
        Collection <String> grades = new LinkedList<>();

        System.out.println("Please assign grades for Mary");
        System.out.println("How much did he get for English");
        Scanner english = new Scanner(System.in);
        grades.add("English: " + english.nextLine());
        System.out.println("confirm: ");
        System.out.println("English was: " + english.nextLine());


        System.out.println("How much did he get for Kiswahili");
        Scanner Kiswahili = new Scanner(System.in);
        System.out.println("Kiswahili was: " + Kiswahili.nextLine());
        System.out.println("confirm: ");
        grades.add("Kiswahili: " + Kiswahili.nextLine());

        System.out.println("How much did he get for Math");
        Scanner Math = new Scanner(System.in);
        System.out.println("Math was: " + Math.nextLine());
        System.out.println("confirm: ");
        grades.add("Math: " + Math.nextLine());

        System.out.println("How much did he get for Science");
        Scanner Science = new Scanner(System.in);
        System.out.println("Science was: " + Science.nextLine());
        System.out.println("confirm: ");
        grades.add("Science: " + Science.nextLine());

        System.out.println("Mary's grades were: ");
        //  Collection <String> grades = new LinkedList<>();
        // grades.add("English: " + english.nextLine());
        //  grades.add("Kiswahili: " + Kiswahili.nextLine());
        // grades.add("Math: " + Math.nextLine());
        // grades.add("Science: " + Science.nextLine());


        Iterator<String> itr = grades.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
    public static void getGrade4(){
        Collection <String> grades = new LinkedList<>();

        System.out.println("Please assign grades for Lucy");
        System.out.println("How much did he get for English");
        Scanner english = new Scanner(System.in);
        grades.add("English: " + english.nextLine());
        System.out.println("confirm: ");
        System.out.println("English was: " + english.nextLine());


        System.out.println("How much did he get for Kiswahili");
        Scanner Kiswahili = new Scanner(System.in);
        System.out.println("Kiswahili was: " + Kiswahili.nextLine());
        System.out.println("confirm: ");
        grades.add("Kiswahili: " + Kiswahili.nextLine());

        System.out.println("How much did he get for Math");
        Scanner Math = new Scanner(System.in);
        System.out.println("Math was: " + Math.nextLine());
        System.out.println("confirm: ");
        grades.add("Math: " + Math.nextLine());

        System.out.println("How much did he get for Science");
        Scanner Science = new Scanner(System.in);
        System.out.println("Science was: " + Science.nextLine());
        System.out.println("confirm: ");
        grades.add("Science: " + Science.nextLine());

        System.out.println("Lucy's grades were: ");
        //  Collection <String> grades = new LinkedList<>();
        // grades.add("English: " + english.nextLine());
        //  grades.add("Kiswahili: " + Kiswahili.nextLine());
        // grades.add("Math: " + Math.nextLine());
        // grades.add("Science: " + Science.nextLine());


        Iterator<String> itr = grades.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
    public static void getGrades(){

           getGrade();
           getGrade2();
           getGrade3();
           getGrade4();

    }
}


