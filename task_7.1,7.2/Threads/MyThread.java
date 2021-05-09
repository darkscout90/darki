package Threads;

public class MyThread extends Thread {
    private String task;

    public MyThread(String task) {
        super();
        this.task = task;
    }

    @Override
    public void run() {
        System.out.println(task);
      //  for (int i = 0; i < 100; i++) {
        //    System.out.println(task + " выпонено: " + i + "%");
        //}
    }
}
