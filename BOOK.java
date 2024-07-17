/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prolab;

/**
 *
 * @author PC LAND
 */
class Book {
    private boolean borrowed=false;
    String bookname;
    private int id;
    private int date;
    private String title;
    private String author;

    public Book(String bookname) {
        this.bookname=bookname;}
    
    public Book(String title,int date, String author,int id) {
        this.date = date;
        this.title = title;
        this.author = author;
        this.id=id;}

    public void setBookname(String bookname) {
        this.bookname = bookname;}

    public void setId(int id) {
        this.id = id;}

    public void setDate(int date) {
        this.date = date;}

    public void setTitle(String title) {
        this.title = title;}

    public void setAuthor(String author) {
        this.author = author; }

    public int getId() {
        return id;}

    public String getTitle() {
        return title;}

    public String getAuthor() {
        return author;}

    public boolean isBorrowed() {
        return borrowed; }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;}

}

