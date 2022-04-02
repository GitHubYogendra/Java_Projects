import java.util.Scanner;

public class codeChefP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int turn = sc.nextInt();
        while(turn >= 1) {
            int first = sc.nextInt();
            int second = sc.nextInt();
            System.out.println(Math.abs(first - second));
            turn--;
        }
    }
    
}
:wq
