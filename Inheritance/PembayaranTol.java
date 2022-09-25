package Array;


import java.util.Scanner;

public class Percobaan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int golongan, idMasuk, idKeluar;

        String[] jenisKendaraan = {"sedan, jip, pick up", "truk dengan 2 sumbu roda", "truk dengan 3 sumbu roda"};
        String[] gerbangTol = {"Dupak", "Waru"};

        System.out.print("masukan golongan kendaraan: ");
        golongan = input.nextInt();

        if (golongan < 1 || golongan > jenisKendaraan.length) {
            System.out.println("salah input!");
            System.exit(0);
        }

        System.out.print("masukan id gerbang masuk: ");
        idMasuk = input.nextInt();

        if (idMasuk < 1 || idMasuk > gerbangTol.length) {
            System.out.println("salah input!");
            System.exit(0);
        }

        System.out.print("masukan id gerbang keluar: ");
        idKeluar = input.nextInt();

        if (idKeluar < 1 || idKeluar > gerbangTol.length) {
            System.out.println("salah input!");
            System.exit(0);
        }

        System.out.println("-----------------------------------------------");
        System.out.println("golongan \t\t\t:" + golongan);
        System.out.println("jenis kendaraan \t:" + jenisKendaraan[golongan - 1]);
        System.out.println("gerbang masuk tol \t:" + gerbangTol[idMasuk - 1]);
        System.out.println("gerbang keluar tol \t:" + gerbangTol[idKeluar - 1]);
        System.out.println("tarif \t\t\t\t:" + tarif(golongan, idMasuk, idKeluar));


    }

    static int tarif(int golongan, int idMasuk, int idKeluar) {

        int tarif = 0;

        // golongan 1
        if (golongan == 1) {
            if (idMasuk == 1) {
                if (idKeluar == 2) {
                    tarif = 5000;
                }

            }
        }

        // golongan 2
        if (golongan == 2) {
            if (idMasuk == 1) {
                if (idKeluar == 2) {
                    tarif = 8000;
                }
            }
        }

        // golongan 3
        if (golongan == 3) {
            if (idMasuk == 1) {
                if (idKeluar == 2) {
                    tarif = 8000;
                }
            }
        }
        return tarif;
    }

}
