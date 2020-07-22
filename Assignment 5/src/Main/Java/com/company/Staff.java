package com.company;

import java.util.*;
import java.util.LinkedList;

public class Staff extends Student implements Teacher {
    private static String student;
    private static String Teacher;
    public int i;
    //Node head;
  //  Node tail;




    public static void getStudent() {
        Student student1 = new Student();
        LinkedList <String> students = new LinkedList<>();
        students.add("John");
        students.add("James");
        students.add("Mary");
        students.add("Lucy");



        Iterator<String> itr = students.iterator();
        while(itr.hasNext()){
            System.out.println("The Students are: " + itr.next());
        }

    }

    public static void getTeacher() {
        LinkedList<String> teachers = new LinkedList<>();
        teachers.add("Jackie teaches English");
        teachers.add("Judy teaches Kiswahili");
        teachers.add("Moses teaches Maths");
        teachers.add("Lydiah teaches Science");

        Iterator<String> itr = teachers.iterator();
        while(itr.hasNext()){
            System.out.println("The Teachers are: " + itr.next());
        }

    }
    /*public static void deleteAll(){
        System.out.println("Would you like to delete 1: all Teachers or 2: all students or 3: all grades");
       Scanner deleteChoice = new Scanner(System.in);
       int i= deleteChoice.nextInt();
       if (i=1){
           students.clear()
       }else {

       }
    }*/
    public void clearStudent(){
        Student deleteStudent = new Student();
      deleteStudent.head = null;
        deleteStudent.tail = null;
        deleteStudent.currentSize=0;
        System.out.println("The list is empty");

    }
    public void clearTeacher(){
        Student deleteTeacher = new Student();
       deleteTeacher.head = null;
        deleteTeacher.tail = null;
        deleteTeacher.currentSize=0;
        System.out.println("The list is empty");

    }
    public void addStudent(){
        System.out.println("What is the first name of your new student? ");
        Scanner newS = new Scanner(System.in);
        LinkedList<String> students = new LinkedList<>();
        students.add(newS.nextLine());

        Iterator<String> itr = students.iterator();
        while(itr.hasNext()){
            System.out.println("The students are: " + itr.next());
        }


    }
    public void addTeacher(){
        System.out.println("What is the first name of your new teacher? ");
        Scanner newS = new Scanner(System.in);
        LinkedList<String> teachers = new LinkedList<>();
        teachers.add(newS.nextLine());

        Iterator<String> itr = teachers.iterator();
        while(itr.hasNext()){
            System.out.println("The teachers are: " + itr.next());
        }


    }
}

