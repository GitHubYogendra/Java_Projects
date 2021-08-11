import java.util.Scanner;
class Name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        if ("null".equals(firstName)) {
            System.out.println(lastName);
        } else {
            if ("null".equals(lastName)) {
                System.out.println(firstName);

            } else {
                System.out.println(firstName + " " + lastName);
            }
        }
    }
}





