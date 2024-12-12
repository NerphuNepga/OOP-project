/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubesdpbo;

/**
 *
 * @author Arrayan
 */
public abstract class User {
    private String name;

    public User(String name) {
        this.name = name;
    }
    public abstract void login();
    public abstract void logout();
}
