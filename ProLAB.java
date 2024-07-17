/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prolab;

import java.util.ArrayList;
//import javax.swing.SwingUtilities;

/**
 *
 * @author PC LAND
 */
public class ProLAB {
static ArrayList<Book>allbook=new ArrayList<>();
static ArrayList<User>customres=new ArrayList<>();

    public ProLAB() {
      allbook.add(new Book("moon",2022,"islam jamal",56783));
      allbook.add(new Book("ecstasy",2018,"abd al-hadi",51457));
      allbook.add(new Book("The city of the mighty",2017,"omar al-awda",25165));
      allbook.add(new Book("11:11",2020,"yousef badran",42765));
      allbook.add(new Book("Dear me",2019,"ola dayob",2022));
    }


public void addbook(String bookname,int bookid,String bookauthor,int bookdate){
    Book b=new Book(bookname,bookid,bookauthor,bookdate);
boolean isadded=false;
for(Book element:allbook){
 if(element.getId()==bookid){
 isadded=true;}
 
 if(!isadded){
 allbook.add(b);}}
}

public void removebook(String bookname){
Book r=new Book(bookname);
boolean isremoved=false;
for(Book element:allbook){
  if(element.getTitle().equals(bookname)){ 
    isremoved=true;}  
    if(!isremoved){
 allbook.remove(r);}}}  

public void borrowbook(String username,int userid,String bookname){
boolean clintwhyexist=false;
boolean isavaliabe=false;
for (User temp : customres) {
       if (temp.getUsername().equals(username)) {
           clintwhyexist=true;}}

       if(!clintwhyexist){
         customres.add(new User(username,userid));}
       
        for (Book book : allbook) {
            if (book.getTitle().equals(bookname)&&book.isBorrowed()) {
                isavaliabe=true;}}
            
            if(isavaliabe){
               for (User temp : customres) { 
              if(temp.getUsername().equals(username)&&temp.books.size()<5){
                temp.books.add(new Book(bookname));
                 for (Book book : allbook){ 
                    book.setBorrowed(true);}
                 }}}}


public void returnbook(String username,String bookname){
boolean isreturned=false;

for (Book book : allbook) {
            if (book.getTitle().equals(bookname)&&book.isBorrowed()) {
                isreturned=true;}}
for (User temp : customres) {
       if (temp.getUsername().equals(username)) {
           temp.books.remove(new Book(bookname));
      for (Book book : allbook){ 
                     book.setBorrowed(false);
      } }}
}


    public static void main(String[] args) {
        
    }}


