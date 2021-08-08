import java.util.Scanner;

class  size{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 0;
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        while (i < num) {
            int num1 = sc.nextInt();
            if (num1 == 0) {
                count++;
            } else {
                if (num1 == 1) {
                    count1++;
                } else {
                    count2++;
                }
            }
            i++;
        } System.out.print(count + " ");
        System.out.print(count1 + " ");
        System.out.print(count2);
    }
}
