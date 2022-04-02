import java.util.Scanner;

public class corseRegistation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num >=1){
            int nroll = sc.nextInt();
            int total = sc.nextInt();
            int enrolled = sc.nextInt();
            int sum = nroll + enrolled;
            if(sum <= total){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            num--;
        }
    }
    
}

