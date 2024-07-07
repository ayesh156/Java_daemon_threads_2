package com;

public class Test {
    public static void main(String[] args) {
        ThreadGroup tg = Thread.currentThread().getThreadGroup();
        
        boolean daemon = tg.isDaemon();
        
        System.out.println("Main: "+daemon);
        
        System.out.println("System: "+tg.getParent().isDaemon());
        
        ThreadGroup tg1 = new ThreadGroup("ABC");
        
        tg1.setDaemon(true);
        
        Thread t1 = new Thread(tg1, "A");
        Thread t2 = new Thread(tg1, "B");
        Thread t3 = new Thread(tg1, "C");
        Thread t4 = new Thread(tg1, "D");
        
        t1.setDaemon(true);
        t2.setDaemon(true);
        t3.setDaemon(true);
        t4.setDaemon(true);
        
        tg1.interrupt();
        
        System.out.println("ABC:"+tg1.isDaemon());
        
        
    }
}
