package Array;

import java.util.Scanner;

public class remoteTV {
    public static void main(String[] args) {
        lihattv();
    }

    public static void lihattv() {
        int pilih;
        Scanner scan = new Scanner(System.in);
        tv tivi = new tv();
        remote remot = new remote();
        while (true) {

            if (remot.getpower()) tivi.tampil(remot.getchannel(), remot.getvol());
            else tivi.mati();
            System.out.println("0. Turn on/off");
            System.out.println("1. Channel +");
            System.out.println("2. Channel -");
            System.out.println("3. Set Channel");
            System.out.println("4. Volume +");
            System.out.println("5. Volume -");
            pilih = scan.nextInt();
            switch (pilih) {
                case 0:
                    remot.powerset();
                    break;
                case 1:
                    if (remot.getchannel() < 20) remot.chp();
                    else if (remot.getchannel() == 20) remot.chset(0);
                    break;
                case 2:
                    if (remot.getpower()) {
                        if (remot.getchannel() > 0) remot.chm();
                        else if (remot.getchannel() == 0) remot.chset(20);
                    }
                    break;
                case 3:
                    if (remot.getpower()) {
                        int ch = scan.nextInt();
                        if (ch > 20) System.out.println("Tidak ada channel");
                        else remot.chset(ch);
                    }
                    break;
                case 4:
                    if (remot.getpower()) {
                        if (remot.getvol() < 10) remot.volp();
                    }
                    break;
                case 5:
                    if (remot.getpower()) {
                        if (remot.getvol() > 0) remot.volm();
                    }
                    break;
            }
            System.out.print('\u000C');
        }
    }
}
