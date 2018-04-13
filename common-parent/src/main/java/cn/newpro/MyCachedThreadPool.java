package cn.newpro;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Administrator
 * @date 2018/4/10 0010
 */
public class MyCachedThreadPool {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " running!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " end!");
            }
        };
        ExecutorService myThreadPool = Executors.newCachedThreadPool();
        myThreadPool.execute(runnable);
        myThreadPool.execute(runnable);
        myThreadPool.execute(runnable);
        myThreadPool.execute(runnable);
        myThreadPool.execute(runnable);
        myThreadPool.shutdown();


    }
}
