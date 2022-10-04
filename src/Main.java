import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.ENGLISH);
        int n = in.nextInt();
        int mx = 0;
        int q = 0;
        for (int i = 0; i < n; ++i){
            q = in.nextInt();
            if (q > mx){
                mx = q;
            }
        }
        System.out.println(mx);
    }
}
/*
Номер 3 с массивом
        import java.util.Locale;
        import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.ENGLISH);
        int n = in.nextInt();
        int mx = 0;
        int[] ar = new int[n];
        for (int i = 0; i < n; ++i){
            ar[i] = in.nextInt();

        }
        for (int i = 0; i < n; i++){
            if (ar[i] > mx){
                mx = ar[i];
            }
        }
        System.out.println(mx);
    }
}
*/
