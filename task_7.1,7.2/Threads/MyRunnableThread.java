package Threads;

public class MyRunnableThread implements Runnable {
    private String task;

    public MyRunnableThread(String task) {
        super();
        this.task = task;
    }

    @Override
    public void run() {
        System.out.println(task);
        //      for (int i = 0; i < 100; i++) {
    //        System.out.println(task + " выпонено: " + i + "%");
  //      }
    }
}
