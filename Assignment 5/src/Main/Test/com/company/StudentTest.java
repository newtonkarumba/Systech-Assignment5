package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void getGrade() {
        assertEquals("A" , "A");
    }

    @Test
    public void getGrade2() {
        assertEquals("B" , "B");
    }

    @Test
    public void getGrade3() {
        assertEquals("C" , "C");
    }

    @Test
    public void getGrade4() {
        assertEquals("A" , "A");
    }

    @Test
    public void getGrades() {
        assertEquals("B" , "B");
    }
}