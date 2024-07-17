/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prolab;

import java.util.ArrayList;
import java.util.List;


class User {
    
   String username;
   int userid;
 ArrayList<Book>books=new ArrayList<>();
 
    public User(String username, int userid) {
        this.username = username;
        this.userid = userid;}

    public User(String username) {
        this.username = username; }

    public String getUsername() {
        return username;}

    public void setUsername(String username) {
        this.username = username;}

    public int getUserid() {
        return userid;}

    public void setUserid(int userid) {
        this.userid = userid;}

   
    
    

    
   


}
