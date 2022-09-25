package Array;

public class Inheritancepegawai {
    String nama;
    String gender;
    int NISN;

    Inheritancepegawai(String nama, String gender, int NISN) {
        this.nama = nama;
        this.gender = gender;
        this.NISN =  NISN;
    }
    public void cetak(){
        System.out.println("Berikut Identitas Pegawai");
        System.out.println("Nama      \t: "+nama);
        System.out.println("gender      \t: "+gender);
        System.out.println("NISN      \t: "+NISN);
    }
}
