class ThreadOne extends Thread {
    public ThreadOne(Runnable r) {
        super(r);
    }

    public void run() {
        System.out.print("ThreadOne");
    }
}

class ThreadTwo implements Runnable {
    public void run() {
        System.out.print("ThreadTwo");
    }
}

class C {
    public static void main(String[] args) {
        new ThreadOne(new ThreadTwo()).start();
    }
}