class T extends Thread {
    private static Scriere scriere = new Scriere();

    public void run() {
        int i = 100;
        while (i > 0) {
            scriere.scrie();
            i--;
        }
    }
}