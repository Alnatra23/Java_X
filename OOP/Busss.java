import Ujibus.BUs;
import Ujibus.Buss;

public class Encapsulation2 {
    public static void main(String[] args) {

        Buss buss = new Buss();
        buss.penumpang = 18;
        buss.maxpenumpang=24;
        buss.cetak();
        buss.penumpang-=3;
        buss.cetak();


        BUs bus = new BUs(12);
        bus.pluspenumpang(15);
        bus.cetak();
    }
}