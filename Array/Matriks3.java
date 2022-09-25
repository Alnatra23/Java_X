package Array;

import java.util.Random;

public class UKL5 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] arr = new int[5][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(50);
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}