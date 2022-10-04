/*
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.ENGLISH);
        int n = in.nextInt();
        int q = 0;
        int prev = in.nextInt();
        for (int i = 0; i < n-1; ++i) {
            if (q > prev) {
                System.out.print(q + " ");
            }
            prev = q;
            q = in.nextInt();
        }
    }
}
*/


//Номер 3 с массивом

import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.ENGLISH);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; ++i){
            ar[i] = in.nextInt();
        }
        for (int i = 1; i < n; i++){
            if (ar[i] > ar[i-1]){
                System.out.print(ar[i] + " ");
            }
        }
    }
}

