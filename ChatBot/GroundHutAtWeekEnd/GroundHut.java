import java.util.Scanner;

class GroundHut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tru = "true";           // instead of boolean function boolean tru = true;
        String fal = "false";           // instead of boolean function boolean fal = !tru;
        int num = scanner.nextInt();
        String str = scanner.next();
        if (str.equals(tru)) {
            if (num >= 15 && num <= 25) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
        if (str.equals(fal)) {
            if (num >= 10 && num <= 20) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } scanner.close();
    }
}


