import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.ENGLISH);
        int n = in.nextInt();
        int sig = 1;
        if (n < 0){
            sig = -1;
            n *= -1;
        }
        int a = n;
        int k = 0;
        while (a > 0){
            k += 1;
            a /= 10;
        }
        a = 0;
        for (int i = k-1; i >=0; --i){
            a += (n % 10) * Math.pow(10, i);
            n = n / 10;
        }
        a*=  sig;
        System.out.println(a);
    }
}