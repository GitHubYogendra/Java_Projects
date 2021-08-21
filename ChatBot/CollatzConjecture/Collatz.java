import java.util.Scanner;

class Collatz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean sto = true;
        if(num == 1) {
            System.out.println("1");
        }else {
        while (sto) {
            System.out.print(num + " ");
                if (num % 2 == 0) {
                    int res = num / 2;
                    if (res == 1) {
                        System.out.println(res);
                        sto = false;
                    } else {
                        num = res;
                    }
                } else {
                    num = (num * 3) + 1;
                }
            }
        }
    }
}
