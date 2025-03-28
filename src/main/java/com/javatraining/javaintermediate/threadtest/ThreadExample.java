package com.javatraining.javaintermediate.threadtest;

public class ThreadExample {

    public static void main(String[] args) {

        // 첫 번째 스레드
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("[Thread 1] 작업 중... (" + i + ")");
                try {
                    Thread.sleep(500);  // 0.5초 대기
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // 두 번째 스레드
        Thread thread2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("[Thread 2] 처리 중... (" + i + ")");
                try {
                    Thread.sleep(500);  // 0.5초 대기
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // 두 스레드 시작
        thread1.start();
        thread2.start();
    }
}

