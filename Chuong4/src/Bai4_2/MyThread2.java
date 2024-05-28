package Bai4_2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Kaiser
 */
public class MyThread2 extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 1) {
                System.out.println(Thread.currentThread().getName() + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    break;
                }
            }
        }

    }
}
