import java.util.Scanner;

class Palin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String b = "";
        int num = input.length();
        for (int i = num-1; i >= 0;i--){
            b = b + input.charAt(i);
        }
        if(input.equalsIgnoreCase(b)){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
