package Array;

public class InAdmin extends Inheritancepegawai{
    private int gajiUtama = 1_500_000;
    private int bonusGaji = 3_000_000;
    InAdmin(String nama, String gender, int NIP) {
        super(nama, gender, NIP);
    }
    public void cetak() {
        System.out.println("Berikut Identitas Pegawai");
        System.out.println("Nama     \t: " + this.nama);
        System.out.println("Gender    \t: " + this.gender);
        System.out.println("NIP       \t: " + this.NISN);
        System.out.println("Bekerja dibagian Admin");
        System.out.println("Gaji utama  : " + gajiUtama);
        System.out.println("Gaji Bonus  : " + bonusGaji);
    }
}