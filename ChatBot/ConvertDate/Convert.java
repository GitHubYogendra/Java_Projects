
import java.util.Scanner;

class Convert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.next();
        String Date1 = date.replaceAll("-","/");
        System.out.print(Date1.substring(5,7)+""+Date1.substring(7,10)+"/"+Date1.substring(0,4));
    }
}
