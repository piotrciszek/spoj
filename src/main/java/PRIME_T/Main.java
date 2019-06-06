package PRIME_T;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n = 10000;
        boolean[] liczby = new boolean[10001];
        for (int i = 0; i <= n; i++) {
            liczby[i] = true;
        }
        liczby[1] = false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (liczby[i] == true) {
                for (int j = i + i; j <= n; j = j + i) {
                    liczby[j] = false;
                }
            }
        }

        Scanner scanner = new Scanner(System.in);
        int ileTestow = scanner.nextInt();
        for (int i=0; i<ileTestow; i++){
            int liczba = scanner.nextInt();
            if (liczby[liczba]==true){
                System.out.println("TAK");
            } else {
                System.out.println("NIE");
            }
        }
    }
}
