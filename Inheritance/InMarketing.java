package Array;
    public class InMarketing extends Inheritancepegawai {
        private int gajiUtama = 2_000_000;
        private int bonusGaji = 4_000_000;
        InMarketing(String nama, String gender, int NISN) {super(nama, gender, NISN);
        }
        public void cetak() {
            System.out.println("Berikut Identitas Pegawai");
            System.out.println("Nama     \t: " + this.nama);
            System.out.println("Gender    \t: " + this.gender);
            System.out.println("NIP       \t: " + this.NISN);
            System.out.println("Bekerja dibagian Marketing");
            System.out.println("Gaji utama  : " + gajiUtama);
            System.out.println("Gaji Bonus  : " + bonusGaji);
        }
    }

