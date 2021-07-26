import java.util.Scanner;

class HiringChef {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        sc.next();
        sc.next();
        sc.next();
        String per = sc.next();
        System.out.println("The form for " + name + " is completed. We will contact you if we need " +
                "a chef that cooks " + per + " dishes.");
        sc.close();
    }
}
