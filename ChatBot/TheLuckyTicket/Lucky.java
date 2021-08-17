import java.util.Scanner;

class Lucky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        String[] str = num.split("");
        int size = str.length;
        int[] arr = new int[size];
        int sum = 0 ,sum1 = 0;
        for (int i = 0; i < size/2; i++) {
            arr[i] = Integer.parseInt(str[i]);
            sum = sum + arr[i];
        }
        for (int i = 3; i < size; i++) {
            arr[i] = Integer.parseInt(str[i]);
            sum1 = sum1 + arr[i];
        }
        if(sum == sum1){
            System.out.println("Lucky");
        } else {
            System.out.println("Regular");
        }
    }
}
