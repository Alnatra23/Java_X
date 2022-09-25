package Array;

import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String namaDepan, namaBelakang, NISN, tempatLahir, tanggalLahir, jeniskelamin, alamatdimalang, mottohidup;

        System.out.println();
        System.out.println("\t--------------------------------------------");
        System.out.println("\t\t\t\tTugas Program Biodata");
        System.out.println("\t--------------------------------------------");
        System.out.println();
        System.out.println("\t\tIsi biodata diri anda dengan lengkap!");
        System.out.println("\t--------------------------------------------");

        do {
            System.out.print("\tNama Depan      \t: ");
            namaDepan = scan.nextLine();
        } while (namaDepan.isBlank());


      do {
          System.out.print("\tNama Belakang   \t: ");
          namaBelakang = scan.nextLine();
      } while (namaBelakang.isBlank());

      do {
          System.out.print("\tNISN            \t: ");
          NISN = scan.nextLine();
      } while (NISN.isBlank());

      do {
          System.out.print("\tTempat Lahir    \t: ");
          tempatLahir = scan.nextLine();
      } while (tempatLahir.isBlank());

      do {
          System.out.print("\tTanggal Lahir   \t: ");
          tanggalLahir = scan.nextLine();
      } while (tanggalLahir.isBlank());

      do {
          System.out.print("\tJenis Kelamin    \t: ");
          jeniskelamin = scan.nextLine();
      } while (jeniskelamin.isBlank());

      do {
          System.out.print("\tAlamat Di Malang\t: ");
          alamatdimalang = scan.nextLine();
      } while (alamatdimalang.isBlank());

      do {
          System.out.print("\tMotto Hidup      \t: ");
          mottohidup = scan.nextLine();
      } while (mottohidup.isBlank());

        System.out.println();
        System.out.println("\t========================================================================");
        System.out.println("\t\t\t\t\t\t\t\tBiodataku");
        System.out.println("\t========================================================================");
        System.out.println("\tNama Lengkap      \t\t: " + namaDepan + " " + namaBelakang);
        System.out.println("\tNISN\t\t\t\t\t: " + NISN);
        System.out.println("\tTempat/Tanggal Lahir\t: " + tempatLahir + ", " + tanggalLahir);
        System.out.println("\tJenis Kelamin\t\t    : " + jeniskelamin);
        System.out.println("\tAlamat Di Malang\t    : " + alamatdimalang);
        System.out.println("\tMotto Hidup\t\t        : " + mottohidup);
        System.out.println("\t========================================================================");
        System.out.println("\t\t\t\t\t\t\t\tTERIMAKASIH");
        System.out.println("\t========================================================================");
    }
}
