//Решение не полное, постараюсь до вторника исправить
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.ENGLISH);
        int n = in.nextInt();
        int x = in.nextInt();
        String str = Integer.toString(n);
        int[] arr = new int[str.length()-1];
        for (int i = 0; i <= str.length(); ++i){
            if (x != n % 10){
                arr[i] = n %10;
            }
            else{
                System.out.print(n/10);
                break;
            }
            n /= 10;
        }
        for (int i = arr.length-1; i >= 0; --i){
            if (arr[i]==0) {
                continue;
            }
            System.out.print(arr[i]);
        }

    }

}

