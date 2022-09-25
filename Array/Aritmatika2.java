package Array;

public class UKL3 {
    public static void main(String[] args) {
            int a =15;
            int b =3;
            int u =a;
            int s =a;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3-i ; j++) {
                    System.out.print(u+"\t");
                    u= u + b;
                    s= s + u;
                }
                System.out.println();
            }
        s= s - u;
        System.out.println("aritmatikanya adalah  "    + s);
        }
    }

