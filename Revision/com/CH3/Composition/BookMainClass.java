package com.CH3.Composition;

public class BookMainClass {
    public static void main(String[] args) {
        Book b= new Book(1,"OOPM BOOK",3);
        int nowords= b.getNumOfWords();
        System.out.println("Total Words="+nowords);
    }
}
