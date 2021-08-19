package numbers;

import java.util.Scanner;

public class Spy {
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Amazing Numbers!");
        System.out.println("Supported requests:");
        System.out.println("-enter a natural number to know its properties;");
        System.out.println("- enter two natural numbers to obtain the properties of the list:");
        System.out.println("  * the first parameter represents a starting number;\n" +
                "  * the second parameters show how many consecutive numbers are to be processed;");
        System.out.println("- two natural numbers and a property to search for;");
        System.out.println("- separate the parameters with one space;");
        System.out.println("- enter 0 to exit.");
        System.out.println("\n Enter a request: ");
        String s = sc.nextLine();
        String[] str = s.split(" ");
        int len = str.length;

        switch (len) {
            case 1:
                callMethod1(s);
                break;
            case 2:
                callMethod2(str[0], str[1]);
                break;
            case 3:
                callMethod3(str[0], str[1], str[2]);
                break;
        }
    }


    private static void callMethod3(String s, String s1, String s2) {
        long num1 = Long.parseLong(String.valueOf(s));
        long num2 = Long.parseLong(String.valueOf(s1));
        String sb = String.valueOf(s2).toUpperCase();
        switch (sb) {
            case "SPY":
                callspy(num1, num2);
                break;
            case "DUCK":
                callDuck(num1, num2);
                break;
            case "BUZZ":
                callBuzz(num1, num2);
            case "GAPFUL":
                callGapfull(num1, num2);
                break;
            case "PALINDROMIC":
                callPalin(num1, num2);
                break;
            case "EVEN" :
                callEven(num1,num2);
                break;
            case "ODD" :
                callOdd(num1,num2);
                break;
            default:
                System.out.println("The property [" + sb + "] is wrong.\n" +
                        "Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, EVEN, ODD]");
                repeat();
        }
    }

    private static void callOdd(long num1, long num2) {
        boolean sta = true;
        int count = 0;
        while (sta) {
            long tim = num1;
            if (num1 % 2 != 0) {
                System.out.print("\n"+ tim + " is odd,");
                count++;
                checkFotBuzzNumber2(tim);
                duckofnumb2(tim);
                palindrome2(tim);
                gapful2(tim);
                spy2(tim);
                if (count == num2) {
                    sta = false;
                }
            } num1 = num1 + 1;
        } repeat();
    }

    private static void callEven(long num1, long num2) {
        boolean sta = true;
        int count = 0;
        while (sta) {
            long tim = num1;
            if (num1 % 2 == 0) {
                System.out.print("\n"+ tim + " is even,");
                count++;
                checkFotBuzzNumber2(tim);
                duckofnumb2(tim);
                palindrome2(tim);
                gapful2(tim);
                spy2(tim);
                if (count == num2) {
                    sta = false;
                }
            } num1 = num1 + 1;
        } repeat();
    }

    private static void callPalin(long num1, long num2) {
        boolean sta = true;
        int count = 0;
        while (sta) {
            long i = num1;
            long tim = i;
            long rev, sum = 0, temp;
            temp = i;
            while (i > 0) {
                rev = i % 10;
                sum = (sum * 10) + rev;
                i = i / 10;
            }
            if (temp == sum) {
                System.out.print(tim + " is palindromic,");
                count++;
                checkFotBuzzNumber2(tim);
                duckofnumb2(tim);
                gapful2(tim);
                spy2(tim);
                checkForOddOrEven2(tim);
                if (count == num2) {
                    sta = false;
                }
            } num1 = num1 + 1;
        } repeat();
    }

    private static void callGapfull(long num1, long num2) {
        boolean sta = true;
        int c = 0;
        while (sta) {
            long i = num1;
            long tim = i;
            long rev, count = 0, temp1 = 0;
            long dup = i;
            rev = i % 10;
            while (i > 0) {
                temp1 = i % 10;
                count++;
                i /= 10;
            }
            if (count >= 3) {
                String res = temp1 + "" + rev;
                long result = Long.parseLong(res);
                if (dup % result == 0) {
                    System.out.print(tim + " is gapful,");
                    c++;
                    checkFotBuzzNumber2(tim);
                    duckofnumb2(tim);
                    palindrome2(tim);
                    spy2(tim);
                    checkForOddOrEven2(tim);
                    if (c == num2) {
                        sta = false;
                    }
                }
            }
            num1 = num1 + 1;
        }
            repeat();

    }

    private static void callBuzz(long num1, long num2) {
        boolean sta = true;
        int c = 0;
        while (sta) {
            long tim = num1;
            long res = num1 % 10;
            if (num1 % 7 == 0 || res == 7) {
                System.out.print(tim + " is buzz,");
                c++;
                duckofnumb2(tim);
                palindrome2(tim);
                gapful2(tim);
                spy2(tim);
                checkForOddOrEven2(tim);
                if (c == num2) {
                    sta = false;
                }
            } num1 = num1 + 1;
        } repeat();
    }

    private static void callDuck(long num1, long num2) {
        boolean sta = true;
        int co = 0;
        while (sta) {
            long i = num1;
            long tim = i;
            int c = 0;
            while (i > 0) {
                long ld = i % 10;
                i = i / 10;
                if (ld == 0) {
                    c++;
                }
            }
            if (c > 0) {
                System.out.print( tim + " is  duck, ");
                co++;
                checkFotBuzzNumber2(tim);
                palindrome2(tim);
                gapful2(tim);
                spy2(tim);
                checkForOddOrEven2(tim);
                if (co == num2) {
                    sta = false;
                }
            } num1 = num1 + 1;
        } repeat();
    }

    private static void spy2(long tim) {
        long res ,sum = 0,pro = 1;
        while (tim > 0){
            res = tim % 10;
            sum += res;
            pro *= res;
            tim = tim / 10;
        }
        if (sum == pro) {
            System.out.print(" spy,");
        }
    }

    private static void callspy(long num1, long num2) {
        boolean sta = true;
        int c = 0;
        while (sta) {
            long i = num1;
            long tim = i;
            long res, sum = 0, pro = 1;
            while (i > 0) {
                res = i % 10;
                sum += res;
                pro *= res;
                i = i / 10;
            }
            if (sum == pro) {
                System.out.print(tim + " is  spy,");
                c++;
                checkFotBuzzNumber2(tim);
                duckofnumb2(tim);
                palindrome2(tim);
                gapful2(tim);
                checkForOddOrEven2(tim);
                if (c == num2) {
                    sta = false;
                }
            }
            num1 = num1 + 1;
        }  repeat();
    }


    private static void checkFotBuzzNumber2(long tim) {
        long res = tim % 10;
        if (tim % 7 == 0 || res == 7) {
            System.out.print("buzz,");
        }
    }


    private static void duckofnumb2(long tim) {
        int count = 0;
        while (tim > 0) {
            long ld = tim % 10;
            tim = tim / 10;
            if (ld == 0) {
                count++;
            }
        }
        if (count > 0) {
            System.out.print("duck,");
        }
    }


    private static void palindrome2(long tim) {
        long rev, sum = 0, tempp;
        tempp = tim;
        while (tim > 0) {
            rev = tim % 10;
            sum = (sum * 10) + rev;
            tim = tim / 10;
        }
        if (tempp == sum) {
            System.out.print("palindromic,");
        }
    }


    private static void gapful2(long tim) {
        long rev, count = 0, temp1 = 0;
        long dup = tim ;
        rev = tim % 10;
        while (tim > 0) {
            temp1 = tim % 10;
            count++;
            tim /= 10;
        }
        if (count >= 3) {
            String res = temp1 + "" + rev;
            long result = Long.parseLong(res);
            if (dup % result == 0) {
                System.out.print("gapful,");
            }
        }
    }


    private static void checkForOddOrEven2(long tim) {
        if(tim % 2 ==0){
            System.out.print("even\n");
        } else {
            System.out.print("odd\n");
        }
    }


    private static void callMethod2(String s, String s1) {
        long num1 = Long.parseLong(String.valueOf(s));
        long num2 = Long.parseLong(String.valueOf(s1));
        long num3 = num1 + num2;
        if (num1 < 0) {
            System.out.println("The first parameter should be a natural number or zero.");
            repeat();
        } else {
            if (num2 <= 0) {
                System.out.println("The second parameter should be a natural number.");
                repeat();
            } else {
                for (long i = num1; i < num3; i++) {
                    System.out.print(" \n "+i + " is ");
                    checkFotBuzzNumber1(i);
                    duckofnumb1(i);
                    palindrome1(i);
                    gapful1(i);
                    spy1(i);
                    checkForOddOrEven1(i);
                }
                repeat();
            }
        }
    }


    private static void callMethod1(String s) {
        if (s.isEmpty()) {
            first();
        } else
            try {
                Long.parseLong(s);
                long num = Long.parseLong(s);
                if (num == 0) {
                    exit();
                } else {
                    negative(num);
                    checkForNatural(num);
                    System.out.println("Properties of " + num);
                    checkFotBuzzNumber(num);
                    duckofnumb(num);
                    palindrome(num);
                    gapful(num);
                    spy(num);
                    checkForOddOrEven(num);
                    repeat();
                }
            } catch (NumberFormatException e) {
                System.out.println("The first parameter should be a natural number or zero.");
                repeat();
            }
    }

    private static void spy1(long i) {
        long res ,sum = 0,pro = 1;
        while (i > 0){
            res = i % 10;
            sum += res;
            pro *= res;
            i = i / 10;
        }
        if (sum == pro) {
            System.out.print(" spy,");
        }
    }

    private static void spy(long num) {
        long res ,sum = 0,pro = 1;
        while (num > 0){
            res = num % 10;
            sum += res;
            pro *= res;
            num = num / 10;
        }
        boolean result = (sum == pro);
        System.out.println("\t\t spy: " + result);
    }



    private static void checkForOddOrEven1(long i) {
        if (i % 2 == 0) {
            System.out.print(" even,");
        }
        if (i % 2 != 0) {
            System.out.print(" Odd, ");
        }
    }

    private static void  duckofnumb1(long i) {
        int count = 0;
        while (i > 0) {
            long ld = i % 10;
            i = i / 10;
            if (ld == 0) {
                count++;
            }
        }
        if (count > 0) {
            System.out.print(" duck, ");
        }
    }

    private static void palindrome1(long i) {
        long rev, sum = 0, temp;
        temp = i;
        while (i > 0) {
            rev = i % 10;
            sum = (sum * 10) + rev;
            i = i / 10;
        }
        if (temp == sum) {
            System.out.print(" palindromic, ");
        }
    }

    private static void gapful1(long i) {
        long rev, count = 0, temp = 0;
        long dup = i;
        rev = i % 10;
        while (i > 0) {
            temp = i % 10;
            count++;
            i /= 10;
        }
        if (count >= 3) {
            String res = temp + "" + rev;
            long result = Long.parseLong(res);
            if (dup % result == 0) {
                System.out.print("gapful,");
            }
        }
    }

    private static void checkFotBuzzNumber1(long i) {
        long res = i % 10;
        if (i % 7 == 0 || res == 7) {
            System.out.print(" buzz,");
        }
    }

    private static void gapful(long num) {
        long rev, count = 0, temp = 0;
        long dup = num;
        rev = num % 10;
        while (num > 0) {
            temp = num % 10;
            count++;
            num /= 10;
        }
        if (count >= 3) {
            String res = temp + "" + rev;
            long result = Long.parseLong(res);
            boolean grape = (dup % result == 0);
            System.out.println("\t  gapful: " + grape);
        }
        System.out.println("\t  gapful:  false" );
    }


    private static void first() {
        System.out.println("Supported requests:");
        System.out.println("-enter a natural number to know its properties;");
        System.out.println("- enter two natural numbers to obtain the properties of the list:");
        System.out.println("* the first parameter represents a starting number;\n" +
                "  * the second parameters show how many consecutive numbers are to be processed;");
        System.out.println("- two natural numbers and a property to search for;");
        System.out.println("- separate the parameters with one space;");
        System.out.println("- enter 0 to exit.");
        repeat();
    }

    private static void negative(long num) {
        if (num <= 0) {
            System.out.println("The first parameter should be a natural number or zero.");
            repeat();
        }
    }


    private static void palindrome(long num) {
        long rev, sum = 0, temp;
        temp = num;
        while (num > 0) {
            rev = num % 10;
            sum = (sum * 10) + rev;
            num = num / 10;
        }
        boolean pali = (temp == sum);
        System.out.println(" palindromic: " + pali);
    }

    private static void repeat() {
        System.out.println(" \n Enter a request: ");
        String s = sc.nextLine();
        String[] str = s.split(" ");
        int len = str.length;
        switch (len) {
            case 1:
                callMethod1(s);
                break;
            case 2:
                callMethod2(str[0], str[1]);
                break;
            case 3:
                callMethod3(str[0], str[1], str[2]);
                break;
        }
    }

    private static void duckofnumb(long num) {
        int count = 0;
        while (num > 0) {
            long ld = num % 10;
            num = num / 10;
            if (ld == 0) {
                count++;
            }
        }
        boolean result = (count > 0);
            System.out.println("\t\tduck: " + result);
    }

    private static void checkFotBuzzNumber(long num) {
        long res = num % 10;
        boolean result = (num % 7 == 0 || res == 7);
            System.out.println("\t\tbuzz: " + result);
    }

    private static void checkForOddOrEven(long num) {
        boolean res = (num % 2 == 0);
        System.out.println("\t\teven: " + res);

        boolean result = (num % 2 != 0);
        System.out.println("\t\t Odd: " + result);
    }

    private static void checkForNatural(long num) {
        if (num <= 0) {
            exit();
        }
    }

    private static void exit() {
        System.out.println("Goodbye!");
        System.exit(0);
    }
}

