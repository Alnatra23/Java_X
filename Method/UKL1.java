package method;

public class UKL1 {
    public static void main(String[] args) {
        int a = 15;   //  suku pertama
        int b = 3;   //  selisih
        int n1 = 1;  //  suku awal
        int n2 = 12; //  suku akhir
        int u = a;
        int s = a;
        for (int i = 0; i <= n2; i++) {
            System.out.println("suku ke-" + i + " =" + u);

            u = u + b;
            s = s + u;
        }
    }
}

