package q3;

import java.util.concurrent.Executor;

public class Task implements Executor {

    @Override
    public void execute(Runnable r) {
        Thread t = new Thread(r);
        t.start();
    }
}
