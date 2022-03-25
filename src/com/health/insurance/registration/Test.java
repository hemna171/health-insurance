package com.health.insurance.registration;

import java.util.ArrayList;

public class Test {

    private String author; 
   // private String subject; 

    public Test(String author){
        this.author = author; 
       // this.subject = subject; 
            
    }
    public String getAuthor(){
        return author; 
    }

    public void setAuthor(String author){
       this.author = author; 
   }

   // public String getSubject(){
   //     return subject; 
    //}

    //public void SetSubject(String subject){
    //    this.subject = subject; 
    //}

    
    public static void main(String[] args) {
        ArrayList<String> Books = new ArrayList<>();
        Books.add("Zed A. Shaw"); 
        Books.add("Hebert Schildt"); 
        Books.add("David Powers"); 
        
        System.out.println(Books);




        /*ArrayList a1 = new ArrayList<>(); 
        a1.add(0,1);
        a1.add(2); 
        a1.add(2,3); 

        System.out.println(a1);

        ArrayList a2 = new ArrayList<>(a1); 
        a2.add(4); 
        a2.add(5); 

        System.out.println(a2);

        ArrayList a3 = new ArrayList<>(); 
        a3.add(6); 
        a3.add(7); 
        
        a2.addAll(a3); 
        System.out.println(a2);

        ArrayList<String> books = new ArrayList<>(); 
        books.add("Java");
        books.add("PHP"); 
        books.add("C++"); 
        books.add("Ruby"); 

        /*for(String c:books){
            //System.out.println(c);
            if(c.contains("a")){
                System.out.println(c);
            }
        }

        int j = 0; 
        do{
            System.out.println(books.get(j++));
        }
        while(j < books.size());
            //System.out.println(books.get(j++));
        }
        System.out.println(books);
        System.out.println( books.lastIndexOf("C++"));
        System.out.println(books.contains("C++")); */



    }
}