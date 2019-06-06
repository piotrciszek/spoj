package FCTRL3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ilePrzypadkow;
        ilePrzypadkow = scanner.nextInt();
        for (int i = 0; i<ilePrzypadkow; i++){
            int n;
            n = scanner.nextInt();
            switch (n){
                case 0:
                    System.out.println("0 1");
                    break;
                case 1:
                    System.out.println("0 1");
                    break;
                case 2:
                    System.out.println("0 2");
                    break;
                case 3:
                    System.out.println("0 6");
                    break;
                case 4:
                    System.out.println("2 4");
                    break;
                case 5:
                    System.out.println("2 0");
                    break;
                case 6:
                    System.out.println("2 0");
                    break;
                case 7:
                    System.out.println("4 0");
                    break;
                case 8:
                    System.out.println("2 0");
                    break;
                case 9:
                    System.out.println("8 0");
                    break;
                default:
                    System.out.println("0 0");
                    break;
            }
        }
    }
}
