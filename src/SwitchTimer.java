public class SwitchTimer extends Thread{

    public static void switchTimer(int x, int y) throws InterruptedException {
        for (int i = x; i > 0; i--) {
            for (int j = y; j >= 0; j--) {
                switch (j) {
                    case 0:
                        System.out.println("0" + i + " : 0" + j);
                        Thread.sleep(1000);
                        y = 59;
                        break;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        System.out.println("0" + i + " : 0" + j);
                        Thread.sleep(1000);
                        break;
                    default:
                        System.out.println("0" + i + " : " + j);
                        Thread.sleep(1000);
                }
            }
        }
    }
}
