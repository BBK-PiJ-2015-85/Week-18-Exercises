package q3_2;

public class TimedTask implements Runnable {
    private int time;


    public TimedTask(int time) {
        if (time < 1000) {
            this.time = time;
        } else {
            time = 1000;
        }
    }

    public void run() {
        try {
            Thread.sleep(time);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
