package Array;
import java.util.Scanner;

public class Suhuasli {
    public static void main (String[]args){
        double c,r,f,k; //variabel
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Bilangan = ");
        c = input.nextInt(); //input suhu Celcius
        r = c*4/5; // rumus reamur
        f = (c*9/5)+32; //rumus farenfait
        k = c+273; //rumus kelvin
        System.out.println("  ");
        System.out.println("Celcius = " +c);   //
        System.out.println("Reamur = "+r);     // Hasil dari rumus
        System.out.println("Fahrenheit = "+f); //
        System.out.println("Kelvin = "+k);     //
    }
}

