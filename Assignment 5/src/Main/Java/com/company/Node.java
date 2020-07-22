package com.company;

public abstract class Node<T> {
    public Student.Node<String> head;
    public Student.Node<String> tail;
    public int currentSize;

        private T data;
        private Student.Node<T> next;

        public T getData(){
            return this.data;
        }
        public void setData(T newData){
            this.data=newData;
        }
        public Student.Node<T> getNext(){
            return this.next;
        }
        public void setNext(Student.Node<T> newNext){
            this.next=newNext;
        }
    }

