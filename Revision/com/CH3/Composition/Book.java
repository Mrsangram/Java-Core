package com.CH3.Composition;

import java.util.Scanner;

public class Book {
    int id;
    String name;
    Scanner sc;
    Page []pages;  //inner class objects array
//    inner class definitions
    class Page{
        int [] lines;
        Page(int numLines){
            lines = new int[numLines];
        }

        void setLines(){
            for(int i=0; i< lines.length;i++){
                System.out.println("Enter the Number of Words for line"+(i+1));
                lines[i] = sc.nextInt();
            }
        }
        int getLines(){
            return lines.length;
        }
}

//End of inner class


    Book(int id,String name,int numPage){
        this.id = id;
        this.name = name;
        sc = new Scanner(System.in);
        pages = new Page[numPage];
        for (int i=0; i<pages.length; i++){
            System.out.println("Enter the Number of Lines for Page"+(i+1));
            int nlines = sc.nextInt();
            pages[i] = new Page(nlines);
            pages[i].setLines();
        }
    }

    public   int getNumOfWords(){
        int numOfWords =0;
        for(int i=0; i< pages.length; i++){
            for(int j=0; j< pages[i].getLines(); j++)
                numOfWords += pages[i].lines[j];

        }
        return numOfWords;
    }
}
