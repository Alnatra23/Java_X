package method;

import java.util.Scanner;

public class Main {
    public final static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] golongan = {2, 3, 4, 5};
        String[] nama = {"galuh", "indro", "jedi", "kanu"};
        String[] alamat = {"Sawojajar", "Kedung kandang", "Ijen", "Dinoyo"};

        int id = input("Masukkan id tagihan");
        int listrik = input("Masukkan tagihan listrik (kwh)");
        int kwh = listrik;

        listrik = hitungPembayaranListrik(golongan[id - 2], listrik);

        System.out.println("\n\n===================");
        System.out.println("  TAGIHAN LISTRIK");
        System.out.println("===================");
        System.out.println("Nama\t\t\t\t:" + nama[id - 2]);
        System.out.println("Alamat\t\t\t\t:" + alamat[id - 2]);
        System.out.println("Golongan\t\t\t:" + golongan[id - 2]);
        System.out.println("Pemakaian listrik\t:" + kwh + " kwh");
        System.out.println("Total Tagihan\t\t:" + listrik);
    }

    public static int input(String info) {
        System.out.print(info + " : ");
        return input.nextInt();
    }

    public static int hitungPembayaranListrik(int golongan, int listrik) {
        int admin = 13_000;
        int tagihan = 0;

        switch (golongan) {
            case 1 :
                tagihan = admin + (listrik * 1000);
                break;
            case 2 :
                tagihan = admin + (listrik * 1300);
                break;
            case 3 :
                tagihan = admin + (listrik * 1500);
                break;
            default :
                System.err.println("salah masukkan golongan");
        }

        if (tagihan < 50_000) {
            tagihan = 50_000;
        }

        return tagihan;
    }
}
