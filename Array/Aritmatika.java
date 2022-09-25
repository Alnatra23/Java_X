package Array;

public class UKL2 {
    public static void main(String[] args) {
        int a = 15;
        int b = 3;
        int u = a;
        int s = a;
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 1; j++) {
                System.out.print(u + "\t");
                u = u + b;
                s = s + u;
            }
            System.out.println();
        }
        System.out.println("aritmatikanya adalah  " + s);
    }
}