/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong2.bai2_8;

import java.io.Serializable;

/**
 *
 * @author Kaiser
 */
public class Employee implements Serializable {

    public String code;
    public String name;
    public double salary;

    public Employee() {
    }

    public Employee(String code, String name, double salary) {
        this.code = code;
        this.name = name;
        this.salary = salary;
    }

}
