package com.vojinp;

public class Main {

    public static void main(String[] args) {
        MaximumQueue<Integer> maximumQueue = new MaximumQueue<>();

        maximumQueue.enQueue(1);
        maximumQueue.enQueue(5);
        maximumQueue.enQueue(3);
        System.out.println(maximumQueue.getMax());
        maximumQueue.deQueue();
        System.out.println(maximumQueue.getMax());
        maximumQueue.enQueue(1);
        System.out.println(maximumQueue.getMax());
        maximumQueue.enQueue(6);
        System.out.println(maximumQueue.getMax());
        maximumQueue.enQueue(2);
        maximumQueue.deQueue();
        maximumQueue.deQueue();
        maximumQueue.deQueue();
        maximumQueue.deQueue();
        System.out.println(maximumQueue.getMax());

    }
}
