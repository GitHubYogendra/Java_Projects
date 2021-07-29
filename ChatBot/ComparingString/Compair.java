import java.util.Scanner;

class Compair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean tru = true;
        String first = sc.nextLine();
        String noWhiteSpace1 = first.replaceAll("\\s","");
        String second = sc.nextLine();
        String noWhiteSpace = second.replaceAll("\\s","");
        if (noWhiteSpace1.equals(noWhiteSpace)){
            System.out.println(tru);
        }else {
            System.out.println(!tru);
        }
    }
}
