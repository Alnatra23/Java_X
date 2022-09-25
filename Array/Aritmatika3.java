public class UKL4 {
    public static void main(String[] args) {
        int a = 15;
        int b = 3;
        int u = a;
        int s = a;
        System.out.println("Deret Aritmatikanya adalah");
        for (int i = 3; i >0; i--) {
            for (int j = 0; j <i; j++) {
                System.out.print(u + "\t");
                u = u + b;
                s = s + u;
            }
            System.out.println();
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2 + i; j++) {
                System.out.print(u + "\t");
                u = u + b;
                s = s + u;
            }
            System.out.println();
        }
        s = s - u;
        System.out.println("Jumlah Deret Aritmatikanya adalah " + s);
    }
}