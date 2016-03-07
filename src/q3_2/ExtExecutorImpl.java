package q3_2;

import q3_1.ExecutorImpl;
import q3_1.Task;

import java.util.concurrent.Executor;

public class ExtExecutorImpl extends ExecutorImpl implements Executor {

    public ExtExecutorImpl(Executor executor) {
        super(executor);
    }

    public int getMaxPendingTime() {
        return tasks.size() * 1000;
    }


    public static void main(String[] args) {
        ExtExecutorImpl ex = new ExtExecutorImpl(new Task());
        for (int i = 0; i < 10; i++) {
            Runnable r = new TimedTask(i * 200);
            System.out.println(ex.getMaxPendingTime());
            ex.execute(r);
            System.out.println(ex.getMaxPendingTime());
        }
    }
}
