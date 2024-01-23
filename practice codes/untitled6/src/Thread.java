public class Thread {
    private Runnable target;
    private boolean alive;

    public Thread(Runnable target) {
        this.target = target;
        this.alive = false;
    }

    public synchronized void start() {
        if (!alive) {
            alive = true;
            new ThreadRunner().start();
        }
    }

    public void run() {
        if (target != null) {
            target.run();
        }
    }

    private class ThreadRunner extends java.lang.Thread {
        public void run() {
            Thread.this.run();
            alive = false;
        }
    }
}
