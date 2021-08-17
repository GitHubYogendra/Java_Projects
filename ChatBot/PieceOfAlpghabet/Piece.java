import java.util.Scanner;

class Piece {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String input = scanner.nextLine();
            String alp = "abcdefghijklmnopqrstuvwxyz";
            if(alp.contains(input)){
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}

