package q3_1;

import java.util.concurrent.Executor;

public class Task implements Executor {

    @Override
    public void execute(Runnable r) {
        Thread t = new Thread(r);
        t.start();
    }
}
