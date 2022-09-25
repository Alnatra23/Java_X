package Array;
import java.util.Scanner;
public class soal1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

                                          // Deklarasi Variabel
        float r, l, v;                    //Rusuk,Luas,Volume

        System.out.println("\t Luas dan Volume Bola ");

        System.out.print("\n Masukkan Jari-Jari : ");
        r = userInput.nextFloat();

        l = (float) (4 * Math.PI * r * r * r /3);              //Rumus Luas Permukaan Bola
        System.out.println("\n Luas Permukaan Bola   : " + l);

        v = 4 / (float) (4 * Math.PI * r * r ); //Rumus Volume Bola
        System.out.println(" Volume Bola : " + v);
    }
}

