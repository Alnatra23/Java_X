package Array;

import java.util.Scanner;

public class UKLSOAL3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            int golongan, idMasuk, idKeluar;

            String[] jenisKendaraan = {"sedan, jip, pick up", "truk dengan 2 sumbu roda", "truk dengan 3 sumbu roda"};
            String[] gerbangTol = {"waru", "sidoarjo", "porong"};

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
            System.out.println("jenis kendaraan \t:" + jenisKendaraan[golongan-1]);
            System.out.println("gerbang masuk tol \t:" + gerbangTol[idMasuk-1]);
            System.out.println("gerbang keluar tol \t:" + gerbangTol[idKeluar-1]);
            System.out.println("tarif \t\t\t\t:" + tarif(golongan, idMasuk, idKeluar));



        }

        static int tarif(int golongan, int idMasuk, int idKeluar) {

            int tarif = 0;

            // golongan 1
            if (golongan == 1) {
                if (idMasuk == 1) {
                    if (idKeluar == 2) {
                        tarif = 6000;
                    } else if (idKeluar == 3) {
                        tarif = 9000;
                    }
                } else if (idMasuk == 2) {
                    if (idKeluar == 1) {
                        tarif = 6000;
                    } else if (idKeluar == 3) {
                        tarif = 5500;
                    }
                } else if (idMasuk == 3) {
                    if (idKeluar == 1) {
                        tarif = 9000;
                    } else if (idKeluar == 2) {
                        tarif = 5500;
                    }
                }
            }

            // golongan 2
            if (golongan == 2) {
                if (idMasuk == 1) {
                    if (idKeluar == 2) {
                        tarif = 9000;
                    } else if (idKeluar == 3) {
                        tarif = 14000;
                    }
                } else if (idMasuk == 2) {
                    if (idKeluar == 1) {
                        tarif = 9000;
                    } else if (idKeluar == 3) {
                        tarif = 8500;
                    }
                } else if (idMasuk == 3) {
                    if (idKeluar == 1) {
                        tarif = 14000;
                    } else if (idKeluar == 2) {
                        tarif = 8500;
                    }
                }
            }

             // golongan 3
            if (golongan == 3) {
                if (idMasuk == 1) {
                    if (idKeluar == 2) {
                        tarif = 9000;
                    } else if (idKeluar == 3) {
                        tarif = 14000;
                    }
                } else if (idMasuk == 2) {
                    if (idKeluar == 1) {
                        tarif = 9000;
                    } else if (idKeluar == 3) {
                        tarif = 8500;
                    }
                } else if (idMasuk == 3) {
                    if (idKeluar == 1) {
                        tarif = 14000;
                    } else if (idKeluar == 2) {
                        tarif = 8500;
                    }
                }
            }
            return tarif;
        }

    }
