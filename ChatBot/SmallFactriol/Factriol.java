import java.util.*;
import java.lang.*;
class Factriol {
  public static void main(String[] args) throws java.lang.Exception {
    // your code goes here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n > 0) {
      int num = sc.nextInt();
      System.out.println(num + " in");
      int res = 1;
      for (int i = 1; i <= num; i++) {
        res = res * i;
      }
        System.out.println(res);
      n--;
    }
  }

}
