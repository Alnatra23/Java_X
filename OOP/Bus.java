package Ujibus;

public class BUs {
    public int penumpang,maxpenumpang;

    public BUs(int maxpenumpang){
        this.maxpenumpang = maxpenumpang;
        this.penumpang = 0;
    }

    public void pluspenumpang(int penumpang){
        int temp;
        temp=this.penumpang+penumpang;
        if (temp>=maxpenumpang){
            System.err.println("Overload penumpang taruh di atas bis saja");
        }
        else {
            this.penumpang=temp;
        }

    }
    public void cetak(){
        System.out.println("Penumpang sekarang = "+penumpang);
        System.out.println("penumpang seharusnya adalah ="+maxpenumpang);
    }
}


