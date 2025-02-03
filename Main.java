class Main {
    public static void main(String[] args) {
        Thread.currentThread().setName("Daemon-Thread");
        System.out.println("This is the Main thread and name is : " + Thread.currentThread().getName());
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r, "My-Cutie-Pie-Process");
        t.start();
        // At this point of time, ther are 2 threads
        System.out.println("This is the Child thread and name is : " + t.getName());
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run(){
        System.out.println("Child Thread");
        System.out.println("Child Thread - " + Thread.currentThread().getName());
    }
}