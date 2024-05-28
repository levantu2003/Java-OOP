package Baii4_1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Kaiser
 */
public class MyThreadMain {

    public static void main(String[] args) {

        Thread thread1 = new Thread(new MyThread1(Thread.MAX_PRIORITY));
        Thread thread2 = new Thread(new MyThread1(Thread.MIN_PRIORITY));

        thread1.setName("Thread MAX: ");
        thread2.setName("Thread MIN: ");

        // Khởi chạy các thread
        thread1.start();
        thread2.start();
    }
}
