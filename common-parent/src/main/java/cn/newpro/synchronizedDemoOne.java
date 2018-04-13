package cn.newpro;

/**
 * @author Administrator
 * @date 2018/4/10 0010
 */
public class synchronizedDemoOne {
    public static void main(String[] args) {
        Sync sync = new Sync();
        for (int i = 0; i < 3; i++) {
            Thread thread = new MyThread(sync);
            thread.start();
        }
    }
}

class MyThread extends Thread {
    private Sync sync;

    public MyThread(Sync sync) {
        this.sync = sync;
    }

    @Override
    public void run() {
        sync.test();
    }
}

class Sync {
    public synchronized void test() {
        System.out.println("test开始...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("test结束...");
    }
}



