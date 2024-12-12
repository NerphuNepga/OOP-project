/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubesdpbo;
/**
 *
 * @author Arrayan
 */
public class Student extends User {
    private String userID;

    public Student(String userID, String name) {
        super(name);
        this.userID = userID;
    }
    @Override
    public void login() {
    }
    @Override
    public void logout() {
    }
}
