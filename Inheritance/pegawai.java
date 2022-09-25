package Array;

public class pegawai {
    public static void main(String[] args) {
        Inheritancepegawai pegawai = new Inheritancepegawai("Naufal", "Laki-Laki", 0063306011);
        pegawai.cetak();

        System.out.println();

        InAdmin admin = new InAdmin("Sukijan","Laki-Laki",0063306011);
        admin.cetak();

        System.out.println();

        InMarketing market = new InMarketing("Rosalia","Perempuan",0063306011);
        market.cetak();
    }
}
