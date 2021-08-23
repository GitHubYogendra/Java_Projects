import java.util.Scanner;

public class Bollon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-->=0) {
            int len = sc.nextInt();
            int len1 = len+1;
            int[] arr = new int[len1];
            for(int i = 1; i<len;++i){
                arr[i]=sc.nextInt();

            }
            for(int i = len; i>=1;--i) {
                if (arr[i] <= 7) {
                    System.out.println(arr[i-1]);
                    break;
                }
            }break;
        }
    }
}

