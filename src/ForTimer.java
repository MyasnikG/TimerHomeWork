public class ForTimer extends Thread {

    public static void timer(int x, int y) throws InterruptedException {
        for (int i = x; i > 0; i--) {
            for (int j = y; j >= 0; j--) {
                if (y < 10) {
                    if (j == 0) {
                        y = 59;
                    }
                    System.out.println("0" + i + " : 0" + j);
                    Thread.sleep(1000);
                } else {
                    if (j < 10) {
                        System.out.println("0" + i + " : 0" + j);
                        Thread.sleep(1000);
                    } else {
                        System.out.println("0" + i + " : " + j);
                        Thread.sleep(1000);
                    }
                }
            }
        }
    }
}
