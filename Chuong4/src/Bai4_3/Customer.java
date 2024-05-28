/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4_3;

/**
 *
 * @author Kaiser
 */
public class Customer {

    int amount = 1000;

    public synchronized void withdraw(int m) {
        System.out.println("Ban dang rut tien...");
        if (amount < m) {
            System.out.println("Khong du tien de rut!");
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        amount -= m;
        System.out.println("Ban da rut tien thanh cong!!");
    }

    public synchronized void deposit(int m) {
        System.out.println("Ban dang nap tien...");
        amount += m;
        System.out.println("Nap tien thanh cong!");
        notify();
    }

    public static void main(String[] args) {
        final Customer c = new Customer();
        Thread th1 = new Thread() {
            public void run() {
                c.withdraw(1500);
            }
        };
        th1.start();
        Thread th2 = new Thread() {
            public void run() {
                c.deposit(2000);
            }
        };
        th2.start();
    }

}
