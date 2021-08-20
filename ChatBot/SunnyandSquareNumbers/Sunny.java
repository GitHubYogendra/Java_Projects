package numbers;

import java.util.Scanner;

public class Sunny {
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Amazing Numbers!");
        System.out.println("Supported requests:");
        System.out.println("-enter a natural number to know its properties;");
        System.out.println("- enter two natural numbers to obtain the properties of the list:");
        System.out.println("  * the first parameter represents a starting number;\n" +
                "  * the second parameters show how many consecutive numbers are to be processed;");
        System.out.println("- two natural numbers and a property to search for;");
        System.out.println("- two natural numbers and two properties to search for;");
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
            case 4 :
                callMethod4(str[0], str[1], str[2],str[3]);
                break;
        }
    }

    private static void callMethod4(String s, String s1, String s2, String s3) {
        long num1 = Long.parseLong(String.valueOf(s));
        long num2 = Long.parseLong(String.valueOf(s1));
        String sp = String.valueOf(s2).toUpperCase();
        String sb1 = String.valueOf(s3).toUpperCase();
        switch (sp) {
            case "SPY":
                callspy3(num1, num2, sb1);
                break;
            case "DUCK":
                callDuck3(num1, num2, sb1);
                break;
            case "BUZZ":
                callBuzz3(num1, num2, sb1);
                break;
            case "GAPFUL":
                callGapfull3(num1, num2, sb1);
                break;
            case "PALINDROMIC":
                callPalin3(num1, num2, sb1);
                break;
            case "EVEN":
                callEven3(num1, num2, sb1);
                break;
            case "ODD":
                callOdd3(num1, num2, sb1);
                break;
            case "SQUARE":
                callSquare3(num1, num2, sb1);
                break;
            case "SUNNY":
                callSunny3(num1, num2, sb1);
                break;
            case "BOY" :
            case "HOT" :
            case "LONG" :
            case "STRONG" :
                System.out.println("The properties ["+sp+" "+sb1+"] are wrong.\n" +
                        "Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY]");
                repeat();
                break;
            default:
                System.out.println("The property ["+sp+"] is wrong.\n" +
                        "Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY]\n");
                repeat();
        }
    }


    private static void callSunny3(long num1, long num2, String sb1) {
        switch (sb1) {
            case "SPY":
                spySunny(num1,num2);
                break;
            case "DUCK":
                ducklSunny(num1, num2);
                break;
            case "BUZZ":
                buzzSunny(num1, num2);
                break;
            case "GAPFUL":
                gapfulSunny(num1, num2);
                break;
            case "PALINDROMIC":
                palSunny(num1, num2);
                break;
            case "EVEN":
                evenSunny(num1,num2);
                break;
            case "ODD":
                oddSunny(num1,num2);
                break;
            case "SQUARE":
                System.out.println("The request contains mutually exclusive properties: [SUNNY,SQUARE]\n" +
                        "There are no numbers with these properties.");
                repeat();
                break;
            case "SUNNY":
                callSunny(num1,num2);
                break;
            default:
                System.out.println("The property [" + sb1 + "] is wrong.\n" +
                        "Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, EVEN, ODD, SQUARE, SUNNY]");
                repeat();
        }
    }

    private static void callSquare3(long num1, long num2, String sb1) {
        switch (sb1) {
            case "SPY":
                SpySquare(num1,num2);
                break;
            case "DUCK":
                duckSquare(num1, num2);
                break;
            case "BUZZ":
                buzzSquare(num1, num2);
                break;
            case "GAPFUL":
                gapfulSquare(num1, num2);
                break;
            case "PALINDROMIC":
                palSquare(num1, num2);
                break;
            case "EVEN":
                evenSquare(num1,num2);
                break;
            case "ODD":
                oddSquare(num1,num2);
                break;
            case "SQUARE":
                callSquare(num1, num2);
                break;
            case "SUNNY":
                System.out.println("The request contains mutually exclusive properties: [SQUARE,SUNNY]\n" +
                        "There are no numbers with these properties.");
                repeat();
                break;
            default:
                System.out.println("The property [" + sb1 + "] is wrong.\n" +
                        "Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, EVEN, ODD, SQUARE, SUNNY]");
                repeat();
        }
    }

    private static void callOdd3(long num1, long num2, String sb1) {
        switch (sb1) {
            case "SPY":
                spyOdd(num1,num2);
                break;
            case "DUCK":
                duckOdd(num1, num2);
                break;
            case "BUZZ":
                buzzOdd(num1, num2);
                break;
            case "GAPFUL":
                gapfulOdd(num1, num2);
                break;
            case "PALINDROMIC":
                pallOdd(num1, num2);
                break;
            case "EVEN":
                System.out.println("The request contains mutually exclusive properties: [ODD,EVEN]\n" +
                        "There are no numbers with these properties.");
                repeat();
                break;
            case "ODD":
               callOdd(num1,num2);
                break;
            case "SQUARE":
                oddSquare(num1, num2);
                break;
            case "SUNNY":
                oddSunny(num1, num2);
                break;
            default:
                System.out.println("The property [" + sb1 + "] is wrong.\n" +
                        "Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, EVEN, ODD, SQUARE, SUNNY]");
                repeat();
        }
    }

    private static void oddSunny(long num1, long num2) {
        boolean sta = true;
        int count = 0;
        while (sta) {
            long tim = num1;
            long ck = num1;
            if (num1 % 2 != 0) {
                double te = (double) ck;
                double q = (te + 1);
                int sq = (int) Math.sqrt(q);
                double rus = (sq * sq);
                if (rus == q) {
                    System.out.print("\n" + tim + " is odd, sunny,");
                    count++;
                    checkFotBuzzNumber2(tim);
                    gapful2(tim);
                    palindrome2(tim);
                    spy2(tim);
                    duckofnumb2(tim);
                    if (count == num2) {
                        sta = false;
                    }
                }
            }
            num1 = num1 + 1;
        }
        repeat();
    }

    private static void oddSquare(long num1, long num2) {
        boolean sta = true;
        int count = 0;
        while (sta) {
            long tim = num1;
            long ck = num1;
            if (num1 % 2 != 0) {
                double te = (double) ck;
                int sq = (int) Math.sqrt(te);
                double rus = (sq * sq);
                if (rus == te) {
                    System.out.print("\n" + tim + " is odd, square,");
                    count++;
                    checkFotBuzzNumber2(tim);
                    spy2(tim);
                    palindrome2(tim);
                    gapful2(tim);
                    duckofnumb2(tim);
                    if (count == num2) {
                        sta = false;
                    }
                }
            }
            num1 = num1 + 1;
        }
        repeat();
    }

    private static void callEven3(long num1, long num2, String sb1) {
        switch (sb1) {
            case "SPY":
                spyEven(num1,num2);
                break;
            case "DUCK":
                duckEven(num1, num2);
                break;
            case "BUZZ":
                buzzEven(num1, num2);
                break;
            case "GAPFUL":
                gapfulEven(num1, num2);
                break;
            case "PALINDROMIC":
                palEven(num1, num2);
                break;
            case "EVEN":
                callEven(num1, num2);
                break;
            case "ODD":
                System.out.println("The request contains mutually exclusive properties: [EVEN,ODD]\n" +
                        "There are no numbers with these properties.");
                repeat();
                break;
            case "SQUARE":
                evenSquare(num1, num2);
                break;
            case "SUNNY":
                evenSunny(num1, num2);
                break;
            default:
                System.out.println("The property [" + sb1 + "] is wrong.\n" +
                        "Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, EVEN, ODD, SQUARE, SUNNY]");
                repeat();
        }
    }

    private static void evenSunny(long num1, long num2) {
        boolean sta = true;
        int count = 0;
        while (sta) {
            long tim = num1;
            long ck = num1;
            if (num1 % 2 == 0) {
                double te = (double) ck;
                double q = (te + 1);
                int sq = (int) Math.sqrt(q);
                double rus = (sq * sq);
                if (rus == q) {
                    System.out.print("\n" + tim + " is even, sunny,");
                    count++;
                    checkFotBuzzNumber2(tim);
                    gapful2(tim);
                    palindrome2(tim);
                    spy2(tim);
                    duckofnumb2(tim);
                    if (count == num2) {
                        sta = false;
                    }
                }
            }
            num1 = num1 + 1;
        }
        repeat();
    }

    private static void evenSquare(long num1, long num2) {
        boolean sta = true;
        int count = 0;
        while (sta) {
            long tim = num1;
            long ck = num1;
            if (num1 % 2 == 0) {
                double te = (double) ck;
                int sq = (int) Math.sqrt(te);
                double rus = (sq * sq);
                if (rus == te) {
                    System.out.print("\n" + tim + " is even, square,");
                    count++;
                    checkFotBuzzNumber2(tim);
                    spy2(tim);
                    palindrome2(tim);
                    gapful2(tim);
                    duckofnumb2(tim);
                    if (count == num2) {
                        sta = false;
                    }
                }
            }
            num1 = num1 + 1;
        }
        repeat();
    }


    private static void callPalin3(long num1, long num2, String sb1) {
        switch (sb1) {
            case "SPY":
                spyPalin(num1,num2);
                break;
            case "DUCK":
                duckPalin(num1, num2);
                break;
            case "BUZZ":
                buzzPalindromic(num1, num2);
                break;
            case "GAPFUL":
                gapfulPalindromic(num1, num2);
                break;
            case "PALINDROMIC":
                callPalin(num1, num2);
                break;
            case "EVEN":
                palEven(num1, num2);
                break;
            case "ODD":
                pallOdd(num1, num2);
                break;
            case "SQUARE":
                palSquare(num1, num2);
                break;
            case "SUNNY":
                palSunny(num1, num2);
                break;
            default:
                System.out.println("The property [" + sb1 + "] is wrong.\n" +
                        "Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, EVEN, ODD, SQUARE, SUNNY]");
                repeat();
        }
    }

    private static void palSunny(long num1, long num2) {
        boolean sta = true;
        int count = 0;
        while (sta) {
            long i = num1;
            long tim = i;
            long ck = i;
            long rev, sum = 0, temp;
            temp = i;
            while (i > 0) {
                rev = i % 10;
                sum = (sum * 10) + rev;
                i = i / 10;
            }
            if (temp == sum) {
                double te = (double) ck;
                double q = (te + 1);
                int sq = (int) Math.sqrt(q);
                double rus = (sq * sq);
                if (rus == q) {
                    System.out.print("\n" + tim + " is palindromic, sunny,");
                    count++;
                    checkFotBuzzNumber2(tim);
                    gapful2(tim);
                    spy2(tim);
                    duckofnumb2(tim);
                    checkForOddOrEven2(tim);
                    if (count == num2) {
                        sta = false;
                    }
                }
        }
        num1 = num1 + 1;
    }
    repeat();
}

    private static void palSquare(long num1, long num2) {
        boolean sta = true;
        int count = 0;
        while (sta) {
            long i = num1;
            long tim = i;
            long ck = i;
            long rev, sum = 0, temp;
            temp = i;
            while (i > 0) {
                rev = i % 10;
                sum = (sum * 10) + rev;
                i = i / 10;
            }
            if (temp == sum) {
                double te = (double) ck;
                int sq = (int) Math.sqrt(te);
                double rus = (sq * sq);
                if (rus == te) {
                    System.out.print("\n" + tim + " is palindromic, square,");
                    count++;
                    checkFotBuzzNumber2(tim);
                    spy2(tim);
                    gapful2(tim);
                    duckofnumb2(tim);
                    checkForOddOrEven2(tim);
                    if (count == num2) {
                        sta = false;
                    }
                }
            }
            num1 = num1 + 1;
        }
        repeat();
    }

    private static void pallOdd(long num1, long num2) {
        boolean sta = true;
        int count = 0;
        while (sta) {
            long i = num1;
            long tim = i;
            long ck = i;
            long rev, sum = 0, temp;
            temp = i;
            while (i > 0) {
                rev = i % 10;
                sum = (sum * 10) + rev;
                i = i / 10;
            }
            if (temp == sum) {
                if (ck % 2 != 0) {
                    System.out.print("\n" + tim + " is palindromic, odd,");
                    count++;
                    checkFotBuzzNumber2(tim);
                    spy2(tim);
                    gapful2(tim);
                    duckofnumb2(tim);
                    sunny(tim);
                    square(tim);
                    if (count == num2) {
                        sta = false;
                    }
                }
            }
            num1 = num1 + 1;
        }
        repeat();
    }

    private static void palEven(long num1, long num2) {
        boolean sta = true;
        int count = 0;
        while (sta) {
            long i = num1;
            long tim = i;
            long ck = i;
            long rev, sum = 0, temp;
            temp = i;
            while (i > 0) {
                rev = i % 10;
                sum = (sum * 10) + rev;
                i = i / 10;
            }
            if (temp == sum) {
                if (ck % 2 == 0) {
                    System.out.print("\n" + tim + " is palindromic, even,");
                    count++;
                    checkFotBuzzNumber2(tim);
                    spy2(tim);
                    gapful2(tim);
                    duckofnumb2(tim);
                    sunny(tim);
                    square(tim);
                    if (count == num2) {
                        sta = false;
                    }
                }
            }
            num1 = num1 + 1;
        }
        repeat();
    }

    private static void callGapfull3(long num1, long num2, String sb1) {
        switch (sb1) {
            case "SPY":
                spyGapfull(num1,num2);
                break;
            case "DUCK":
                duckGapfull(num1, num2);
                break;
            case "BUZZ":
                buzzGapful(num1, num2);
                break;
            case "GAPFUL":
                callGapfull(num1, num2);
                break;
            case "PALINDROMIC":
                gapfulPalindromic(num1, num2);
                break;
            case "EVEN":
                gapfulEven(num1, num2);
                break;
            case "ODD":
                gapfulOdd(num1, num2);
                break;
            case "SQUARE":
                gapfulSquare(num1, num2);
                break;
            case "SUNNY":
                gapfulSunny(num1, num2);
                break;
            default:
                System.out.println("The property [" + sb1 + "] is wrong.\n" +
                        "Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, EVEN, ODD, SQUARE, SUNNY]");
                repeat();
        }
    }

    private static void gapfulSunny(long num1, long num2) {
        boolean sta = true;
        int co = 0;
        while (sta) {
            long i = num1;
            long tim = i;
            long ck = i;
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
                    double te = (double) ck;
                    double q = (te + 1);
                    int sq = (int) Math.sqrt(q);
                    double rus = (sq * sq);
                    if (rus == q) {
                        System.out.print("\n" + tim + " is gapful, sunny,");
                        co++;
                        checkFotBuzzNumber2(tim);
                        spy2(tim);
                        duckofnumb2(tim);
                        palindrome2(tim);
                        checkForOddOrEven2(tim);
                        if (co == num2) {
                            sta = false;
                        }
                    }
                }
            }
                num1 = num1 + 1;
            }
            repeat();
        }

    private static void gapfulSquare(long num1, long num2) {
        boolean sta = true;
        int co = 0;
        while (sta) {
            long i = num1;
            long tim = i;
            long ck = i;
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
                    double te = (double) ck;
                    int sq = (int) Math.sqrt(te);
                    double rus = (sq * sq);
                    if (rus == te) {
                        System.out.print("\n" + tim + " is gapful, square,");
                        co++;
                        checkFotBuzzNumber2(tim);
                        spy2(tim);
                        duckofnumb2(tim);
                        palindrome2(tim);
                        checkForOddOrEven2(tim);
                        if (co == num2) {
                            sta = false;
                        }
                    }
                }
            }
                num1 = num1 + 1;
            }
            repeat();
        }

    private static void gapfulOdd(long num1, long num2) {
        boolean sta = true;
        int co = 0;
        while (sta) {
            long i = num1;
            long tim = i;
            long ck = i;
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
                    if (ck % 2 != 0) {
                        System.out.print("\n" + tim + " is gapful, odd,");
                        co++;
                        checkFotBuzzNumber2(tim);
                        spy2(tim);
                        duckofnumb2(tim);
                        palindrome2(tim);
                        sunny(tim);
                        square(tim);
                        if (co == num2) {
                            sta = false;
                        }
                    }
                }
            }
            num1 = num1 + 1;
        }
        repeat();
    }

    private static void gapfulEven(long num1, long num2) {
        boolean sta = true;
        int co = 0;
        while (sta) {
            long i = num1;
            long tim = i;
            long ck = i;
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
                    if (ck % 2 == 0) {
                        System.out.print("\n" + tim + " is gapful, even,");
                        co++;
                        checkFotBuzzNumber2(tim);
                        spy2(tim);
                        duckofnumb2(tim);
                        palindrome2(tim);
                        sunny(tim);
                        square(tim);
                        if (co == num2) {
                            sta = false;
                        }
                    }
                }
            }
            num1 = num1 + 1;
        }
        repeat();
    }

    private static void gapfulPalindromic(long num1, long num2) {
        boolean sta = true;
        int co = 0;
        while (sta) {
            long i = num1;
            long tim = i;
            long ck = i;
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
                    long reverse, sum1 = 0, tempp;
                    tempp = ck;
                    while (ck > 0) {
                        reverse = ck % 10;
                        sum1 = (sum1 * 10) + reverse;
                        ck = ck / 10;
                    }
                    if (tempp == sum1) {
                        System.out.print("\n" + tim + " is gapful, palindromic,");
                        co++;
                        checkFotBuzzNumber2(tim);
                        spy2(tim);
                        duckofnumb2(tim);
                        sunny(tim);
                        square(tim);
                        checkForOddOrEven2(tim);
                        if (co == num2) {
                            sta = false;
                        }
                    }
                }
            }
                num1 = num1 + 1;
            }
            repeat();
        }

    private static void callBuzz3(long num1, long num2, String sb1) {
        switch (sb1) {
            case "SPY":
                spyBuzz(num1,num2);
                break;
            case "DUCK":
                duckBuzz(num1, num2);
                break;
            case "BUZZ":
                callBuzz(num1, num2);
                break;
            case "GAPFUL":
                buzzGapful(num1, num2);
                break;
            case "PALINDROMIC":
                buzzPalindromic(num1, num2);
                break;
            case "EVEN":
                buzzEven(num1, num2);
                break;
            case "ODD":
                buzzOdd(num1, num2);
                break;
            case "SQUARE":
                buzzSquare(num1, num2);
                break;
            case "SUNNY":
                buzzSunny(num1, num2);
                break;
            default:
                System.out.println("The property [" + sb1 + "] is wrong.\n" +
                        "Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, EVEN, ODD, SQUARE, SUNNY]");
                repeat();
        }
    }

    private static void buzzSunny(long num1, long num2) {
        boolean sta = true;
        int count = 0;
        while (sta) {
            long tim = num1;
            long ck = num1;
            long res = num1 % 10;
            if (num1 % 7 == 0 || res == 7) {
                double te = (double) ck;
                double q = (te + 1);
                int sq = (int) Math.sqrt(q);
                double result = (sq * sq);
                if(result == q){
                    System.out.print("\n" + tim + " is buzz, sunny,");
                    count++;
                    checkFotBuzzNumber2(tim);
                    palindrome2(tim);
                    gapful2(tim);
                    checkForOddOrEven2(tim);
                    if (count == num2) {
                        sta = false;
                    }
                }
            }
            num1 = num1 + 1;
        }
        repeat();
    }

    private static void buzzSquare(long num1, long num2) {
        boolean sta = true;
        int count = 0;
        while (sta) {
            long tim = num1;
            long ck = num1;
            long res = num1 % 10;
            if (num1 % 7 == 0 || res == 7) {
                double te = (double) ck;
                int sq = (int) Math.sqrt(te);
                double result = (sq * sq);
                if (result == te) {
                    System.out.print("\n" + tim + " is buzz, square,");
                    count++;
                    spy2(tim);
                    duckofnumb2(tim);
                    palindrome2(tim);
                    gapful2(tim);
                    checkForOddOrEven2(tim);
                    if (count == num2) {
                        sta = false;
                    }
                }
            }
            num1 = num1 + 1;
        }
        repeat();
    }


    private static void buzzOdd(long num1, long num2) {
        boolean sta = true;
        int count = 0;
        while (sta) {
            long tim = num1;
            long ck = num1;
            long res = num1 % 10;
            if (num1 % 7 == 0 || res == 7) {
                if (ck % 2 != 0) {
                    System.out.print("\n" + tim + " is buzz, odd,");
                    count++;
                    spy2(tim);
                    duckofnumb2(tim);
                    palindrome2(tim);
                    gapful2(tim);
                    sunny(tim);
                    square(tim);
                    if (count == num2) {
                        sta = false;
                    }
                }
            }
            num1 = num1 + 1;
        }
        repeat();
    }

    private static void buzzEven(long num1, long num2) {
        boolean sta = true;
        int count = 0;
        while (sta) {
            long tim = num1;
            long ck = num1;
            long res = num1 % 10;
            if (num1 % 7 == 0 || res == 7) {
                if (ck % 2 == 0) {
                    System.out.print("\n" + tim + " is buzz, even,");
                    count++;
                    spy2(tim);
                    duckofnumb2(tim);
                    palindrome2(tim);
                    gapful2(tim);
                    sunny(tim);
                    square(tim);
                    if (count == num2) {
                        sta = false;
                    }
                }
            }
            num1 = num1 + 1;
        }
        repeat();
    }

    private static void buzzPalindromic(long num1, long num2) {
        boolean sta = true;
        int count = 0;
        while (sta) {
            long tim = num1;
            long ck = num1;
            long res = num1 % 10;
            if (num1 % 7 == 0 || res == 7) {
                long rev, sum1 = 0, tempp;
                tempp = ck;
                while (ck > 0) {
                    rev = ck % 10;
                    sum1 = (sum1 * 10) + rev;
                    ck = ck / 10;
                }
                if (tempp == sum1) {
                    System.out.print("\n" + tim + " is buzz, palindromic,");
                    count++;
                    spy2(tim);
                    duckofnumb2(tim);
                    gapful2(tim);
                    sunny(tim);
                    square(tim);
                    checkForOddOrEven2(tim);
                    if (count == num2) {
                        sta = false;
                    }
                }
            }
            num1 = num1 + 1;
        }
        repeat();
    }

    private static void buzzGapful(long num1, long num2) {
        boolean sta = true;
        int count = 0;
        while (sta) {
            long tim = num1;
            long cook = num1;
            long res = num1 % 10;
            if (num1 % 7 == 0 || res == 7) {
                long rev, co = 0, temp1 = 0;
                long dup = cook;
                rev = cook % 10;
                while (cook > 0) {
                    temp1 = cook % 10;
                    co++;
                    cook /= 10;
                }
                if (co >= 3) {
                    String fin = temp1 + "" + rev;
                    long result = Long.parseLong(fin);
                    if (dup % result == 0) {
                        System.out.print("\n" + tim + " is buzz,  gapful,");
                        count++;
                        spy2(tim);
                        duckofnumb2(tim);
                        palindrome2(tim);
                        sunny(tim);
                        square(tim);
                        checkForOddOrEven2(tim);
                        if (count == num2) {
                            sta = false;
                        }
                    }
                }
            }
            num1 = num1 + 1;
        }
        repeat();
    }
    private static void callDuck3(long num1, long num2, String sb1) {
        switch (sb1) {
            case "SPY":
                System.out.println("The request contains mutually exclusive properties: [DUCK,SPY]\n" +
                        "There are no numbers with these properties.");
                repeat();
                break;
            case "DUCK":
                callDuck(num1, num2);
                break;
            case "BUZZ":
                duckBuzz(num1, num2);
                break;
            case "GAPFUL":
                duckGapfull(num1, num2);
                break;
            case "PALINDROMIC":
                duckPalin(num1, num2);
                break;
            case "EVEN":
                duckEven(num1, num2);
                break;
            case "ODD":
                duckOdd(num1, num2);
                break;
            case "SQUARE":
                duckSquare(num1, num2);
                break;
            case "SUNNY":
                ducklSunny(num1, num2);
                break;
            default:
                System.out.println("The property [" + sb1 + "] is wrong.\n" +
                        "Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, EVEN, ODD, SQUARE, SUNNY]");
                repeat();
        }
    }

    private static void ducklSunny(long num1, long num2) {
        boolean sta = true;
        int count = 0;
        while (sta) {
            long i = num1;
            long tim = i;
            long ck = i;
            int c = 0;
            while (i > 0) {
                long ld = i % 10;
                i = i / 10;
                if (ld == 0) {
                    c++;
                }
            }
            if (c > 0) {
                double te = (double) ck;
                double q = (te + 1);
                int sq = (int) Math.sqrt(q);
                double result = (sq * sq);
                if(result == q){
                    System.out.print("\n" + tim + " is duck, sunny,");
                    count++;
                    checkFotBuzzNumber2(tim);
                    palindrome2(tim);
                    gapful2(tim);
                    checkForOddOrEven2(tim);
                    if (count == num2) {
                        sta = false;
                    }
                }
            }
            num1 = num1 + 1;
        }
        repeat();
    }


    private static void duckSquare(long num1, long num2) {
        boolean sta = true;
        int count = 0;
        while (sta) {
            long i = num1;
            long tim = i;
            long ck = i;
            int c = 0;
            while (i > 0) {
                long ld = i % 10;
                i = i / 10;
                if (ld == 0) {
                    c++;
                }
            }
            if (c > 0) {
                double te = (double) ck;
                int sq = (int) Math.sqrt(te);
                double result = (sq * sq);
                if (result == te) {
                    System.out.print("\n" + tim + " is duck, square,");
                    count++;
                    checkFotBuzzNumber2(tim);
                    palindrome2(tim);
                    gapful2(tim);
                    checkForOddOrEven2(tim);
                    if (count == num2) {
                        sta = false;
                    }
                }
            }
            num1 = num1 + 1;
        }
        repeat();
    }

    private static void duckOdd(long num1, long num2) {
        boolean sta = true;
        int count = 0;
        while (sta) {
            long i = num1;
            long tim = i;
            long ck = i;
            int c = 0;
            while (i > 0) {
                long ld = i % 10;
                i = i / 10;
                if (ld == 0) {
                    c++;
                }
            }
            if (c > 0) {
                if (ck % 2 != 0) {
                    System.out.print("\n" + tim + " is duck, odd,");
                    count++;
                    checkFotBuzzNumber2(tim);
                    palindrome2(tim);
                    gapful2(tim);
                    sunny(tim);
                    square(tim);
                    if (count == num2) {
                        sta = false;
                    }
                }
            }
            num1 = num1 + 1;
        }
        repeat();
    }

    private static void duckEven(long num1, long num2) {
        boolean sta = true;
        int count = 0;
        while (sta) {
            long i = num1;
            long tim = i;
            long ck = i;
            int c = 0;
            while (i > 0) {
                long ld = i % 10;
                i = i / 10;
                if (ld == 0) {
                    c++;
                }
            }
            if (c > 0) {
                if (ck % 2 == 0) {
                    System.out.print("\n" + tim + " is duck, even,");
                    count++;
                    checkFotBuzzNumber2(tim);
                    palindrome2(tim);
                    gapful2(tim);
                    sunny(tim);
                    square(tim);
                    if (count == num2) {
                        sta = false;
                    }
                }
            }
            num1 = num1 + 1;
        }
        repeat();
    }

    private static void duckPalin(long num1, long num2) {
        boolean sta = true;
        int count = 0;
        while (sta) {
            long i = num1;
            long tim = i;
            long ck = i;
            int c = 0;
            while (i > 0) {
                long ld = i % 10;
                i = i / 10;
                if (ld == 0) {
                    c++;
                }
            }
            if (c > 0) {
                long rev, sum1 = 0, tempp;
                tempp = ck;
                while (ck > 0) {
                    rev = ck % 10;
                    sum1 = (sum1 * 10) + rev;
                    ck = ck / 10;
                }
                if (tempp == sum1) {
                    System.out.print("\n" + tim + " is duck, palindromic,");
                    count++;
                    checkFotBuzzNumber2(tim);
                    gapful2(tim);
                    sunny(tim);
                    square(tim);
                    checkForOddOrEven2(tim);
                    if (count == num2) {
                        sta = false;
                    }
                }
            }
            num1 = num1 + 1;
        }
        repeat();
    }

    private static void duckGapfull(long num1, long num2) {
        boolean sta = true;
        int count = 0;
        while (sta) {
            long i = num1;
            long tim = i;
            long cook = i;
            int c = 0;
            while (i > 0) {
                long ld = i % 10;
                i = i / 10;
                if (ld == 0) {
                    c++;
                }
            }
            if (c > 0) {
                long rev, co = 0, temp1 = 0;
                long dup = cook;
                rev = cook % 10;
                while (cook > 0) {
                    temp1 = cook % 10;
                    co++;
                    cook /= 10;
                }
                if (co >= 3) {
                    String fin = temp1 + "" + rev;
                    long result = Long.parseLong(fin);
                    if (dup % result == 0) {
                        System.out.print("\n" + tim + " is duck,  gapful,");
                        count++;
                        checkFotBuzzNumber2(tim);
                        palindrome2(tim);
                        sunny(tim);
                        square(tim);
                        checkForOddOrEven2(tim);
                        if (count == num2) {
                            sta = false;
                        }
                    }
                }
            }
            num1 = num1 + 1;
        }
        repeat();
    }


    private static void duckBuzz(long num1, long num2) {
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
                long res = num1 % 10;
                if (num1 % 7 == 0 || res == 7) {
                    System.out.print("\n " +tim + " is duck, buzz ");
                    co++;
                    palindrome2(tim);
                    gapful2(tim);
                    sunny(tim);
                    square(tim);
                    checkForOddOrEven2(tim);
                    if (co == num2) {
                        sta = false;
                    }
                }
            }
            num1 = num1 + 1;
        }
        repeat();
    }

    private static void spyDuck() {
        System.out.println("The request contains mutually exclusive properties: [SPY,DUCK ]\n" +
                "There are no numbers with these properties.");
        repeat();
    }

    private static void callspy3(long num1, long num2, String sb1) {
        switch (sb1) {
            case "SPY":
                callspy(num1, num2);
                break;
            case "DUCK":
                spyDuck();
                break;
            case "BUZZ":
                spyBuzz(num1, num2);
                break;
            case "GAPFUL":
                spyGapfull(num1, num2);
                break;
            case "PALINDROMIC":
                spyPalin(num1, num2);
                break;
            case "EVEN" :
                spyEven(num1,num2);
                break;
            case "ODD" :
                spyOdd(num1,num2);
                break;
            case "SQUARE" :
                SpySquare(num1,num2);
                break;
            case "SUNNY" :
                spySunny(num1,num2);
                break;
            default:
                System.out.println("The property [" + sb1 + "] is wrong.\n" +
                        "Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, EVEN, ODD, SQUARE, SUNNY]");
                repeat();
        }
    }

    private static void spySunny(long num1, long num2) {
        boolean sta = true;
        int count = 0;
        while (sta) {
            long i = num1;
            long tim = i;
            long sk = i;
            long res, sum = 0, pro = 1;
            while (i > 0) {
                res = i % 10;
                sum += res;
                pro *= res;
                i = i / 10;
            }
            if (sum == pro) {
                double te = (double) sk;
                double q = (te + 1);
                int sq = (int) Math.sqrt(q);
                double result = (sq * sq);
                if(result == q){
                    System.out.print("\n" + tim + " is spy, sunny,");
                    count++;
                    checkFotBuzzNumber2(tim);
                    palindrome2(tim);
                    gapful2(tim);
                    checkForOddOrEven2(tim);
                    if (count == num2) {
                        sta = false;
                    }
                }
            }
            num1 = num1 + 1;
        }
        repeat();
    }

    private static void SpySquare(long num1, long num2) {
        boolean sta = true;
        int count = 0;
        while (sta) {
            long i = num1;
            long tim = i;
            long sk = i;
            long res, sum = 0, pro = 1;
            while (i > 0) {
                res = i % 10;
                sum += res;
                pro *= res;
                i = i / 10;
            }
            if (sum == pro) {
                double te = (double) sk;
                int sq = (int) Math.sqrt(te);
                double result = (sq * sq);
                if(result == te){
                    System.out.print("\n" + tim + " is spy, square,");
                    count++;
                    checkFotBuzzNumber2(tim);
                    palindrome2(tim);
                    gapful2(tim);
                    checkForOddOrEven2(tim);
                    if (count == num2) {
                        sta = false;
                    }
                }
            }
            num1 = num1 + 1;
        }
        repeat();
    }


    private static void spyOdd(long num1, long num2) {
        boolean sta = true;
        int count = 0;
        while (sta) {
            long i = num1;
            long tim = i;
            long sk = i;
            long res, sum = 0, pro = 1;
            while (i > 0) {
                res = i % 10;
                sum += res;
                pro *= res;
                i = i / 10;
            }
            if (sum == pro) {
                if (sk % 2 != 0) {
                    System.out.print("\n" + tim + " is spy, odd,");
                    count++;
                    checkFotBuzzNumber2(tim);
                    palindrome2(tim);
                    gapful2(tim);
                    sunny(tim);
                    square(tim);
                    if (count == num2) {
                        sta = false;
                    }
                }
            }
            num1 = num1 + 1;
        }
        repeat();
    }

    private static void spyEven(long num1, long num2) {
        boolean sta = true;
        int count = 0;
        while (sta) {
            long i = num1;
            long tim = i;
            long sk = i;
            long res, sum = 0, pro = 1;
            while (i > 0) {
                res = i % 10;
                sum += res;
                pro *= res;
                i = i / 10;
            }
            if (sum == pro) {
                if (sk % 2 == 0) {
                    System.out.print("\n" + tim + " is spy, even,");
                    count++;
                    checkFotBuzzNumber2(tim);
                    palindrome2(tim);
                    gapful2(tim);
                    sunny(tim);
                    square(tim);
                    if (count == num2) {
                        sta = false;
                    }
                }
            }
            num1 = num1 + 1;
        }
        repeat();
    }

    private static void spyPalin(long num1, long num2) {
        boolean sta = true;
        int count = 0;
        while (sta) {
            long i = num1;
            long tim = i;
            long ck = i;
            long res, sum = 0, pro = 1;
            while (i > 0) {
                res = i % 10;
                sum += res;
                pro *= res;
                i = i / 10;
            }
            if (sum == pro) {
                long rev, sum1 = 0, tempp;
                tempp = ck;
                while (ck > 0) {
                    rev = ck % 10;
                    sum1 = (sum1 * 10) + rev;
                    ck = ck / 10;
                }
                if (tempp == sum1) {
                    System.out.print("\n" + tim + " is spy, palindromic,");
                    count++;
                    checkFotBuzzNumber2(tim);
                    gapful2(tim);
                    sunny(tim);
                    square(tim);
                    checkForOddOrEven2(tim);
                    if (count == num2) {
                        sta = false;
                    }
                }
            }
            num1 = num1 + 1;
        }
        repeat();
    }


    private static void spyGapfull(long num1, long num2) {
        boolean sta = true;
        int count = 0;
        while (sta) {
            long i = num1;
            long cook = i;
            long tim = i;
            long res, sum = 0, pro = 1;
            while (i > 0) {
                res = i % 10;
                sum += res;
                pro *= res;
                i = i / 10;
            }
            if (sum == pro) {
                long rev, co = 0, temp1 = 0;
                long dup = cook;
                rev = cook % 10;
                while (cook > 0) {
                    temp1 = cook % 10;
                    co++;
                    cook /= 10;
                }
                if (co >= 3) {
                    String fin = temp1 + "" + rev;
                    long result = Long.parseLong(fin);
                    if (dup % result == 0) {
                        System.out.print("\n" + tim + " is spy,  gapful,");
                        count++;
                        checkFotBuzzNumber2(tim);
                        palindrome2(tim);
                        sunny(tim);
                        square(tim);
                        checkForOddOrEven2(tim);
                        if (count == num2) {
                            sta = false;
                        }
                    }
                }
            }
            num1 = num1 + 1;
        }
        repeat();
    }

    private static void spyBuzz(long num1, long num2) {
        boolean sta = true;
        int count = 0;
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
                long result = tim % 10;
                if (tim % 7 == 0 || result == 7) {
                    System.out.print("\n" + tim + " is  spy,  buzz,");
                    count++;
                    gapful2(tim);
                    palindrome2(tim);
                    sunny(tim);
                    square(tim);
                    checkForOddOrEven2(tim);
                    if (count == num2) {
                        sta = false;
                    }
                }
            }
            num1 = num1 + 1;
        }
        repeat();
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
                break;
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
            case "SQUARE" :
                callSquare(num1,num2);
                break;
            case "SUNNY" :
                callSunny(num1,num2);
                break;
            default:
                System.out.println("The property [" + sb + "] is wrong.\n" +
                        "Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, EVEN, ODD, SQUARE, SUNNY]");
                repeat();
        }
    }

    private static void callSunny(long num1, long num2) {
        boolean sta = true;
        int count = 0;
        while (sta) {
                double te = (double) num1;
                double q = (te + 1);
                int sq = (int) Math.sqrt(q);
                double res = (sq * sq);
                if(res == q) {
                    long tim = (long)te;
                    System.out.print("\n " + tim + " is sunny,");
                    count++;
                    checkFotBuzzNumber2(tim);
                    duckofnumb2(tim);
                    gapful2(tim);
                    palindrome2(tim);
                    spy2(tim);
                    checkForOddOrEven2(tim);
                    if (count == num2) {
                        sta = false;
                    }
            }
            num1 = num1 + 1;
        }
        repeat();
    }


    private static void callSquare(long num1, long num2) {
        boolean sta = true;
        int count = 0;
        while (sta) {
            double te = (double) num1;
            int sq = (int) Math.sqrt(te);
            double rus = (sq * sq);
            if(rus == te) {
                long tim = (long) te;
                System.out.print("\n " + tim + " is square,");
                count++;
                checkFotBuzzNumber2(tim);
                duckofnumb2(tim);
                gapful2(tim);
                palindrome2(tim);
                spy2(tim);
                checkForOddOrEven2(tim);
                if (count == num2) {
                    sta = false;
                }
            }
            num1 = num1 + 1;
        } repeat();
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
                sunny(tim);
                square(tim);
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
                sunny(tim);
                square(tim);
                spy2(tim);
                if (count == num2) {
                    sta = false;
                }
            } num1 = num1 + 1;
        } repeat();
    }

    private static void square(long tim) {
        double te = (double) tim;
        int sq = (int) Math.sqrt(te);
        double res = (sq * sq);
        if(res == te){
            System.out.print(" square,");
        }
    }

    private static void sunny(long tim) {
        double te = (double) tim;
        double q = (te + 1);
        int sq = (int) Math.sqrt(q);
        double res = (sq * sq);
        if(res == q){
            System.out.print(" sunny,");
        }
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
                System.out.print("\n " +tim + " is palindromic,");
                count++;
                checkFotBuzzNumber2(tim);
                duckofnumb2(tim);
                gapful2(tim);
                sunny(tim);
                square(tim);
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
                    System.out.print("\n " +tim + " is gapful,");
                    c++;
                    checkFotBuzzNumber2(tim);
                    duckofnumb2(tim);
                    palindrome2(tim);
                    sunny(tim);
                    square(tim);
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
                System.out.print("\n " +tim + " is buzz,");
                c++;
                duckofnumb2(tim);
                palindrome2(tim);
                gapful2(tim);
                sunny(tim);
                square(tim);
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
                System.out.print( "\n " +tim + " is  duck, ");
                co++;
                checkFotBuzzNumber2(tim);
                palindrome2(tim);
                gapful2(tim);
                sunny(tim);
                square(tim);
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
                System.out.print("\n " +tim + " is  spy,");
                c++;
                checkFotBuzzNumber2(tim);
                duckofnumb2(tim);
                palindrome2(tim);
                gapful2(tim);
                sunny(tim);
                square(tim);
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
            System.out.print(" buzz,");
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
            System.out.print(" duck,");
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
            System.out.print(" palindromic,");
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
                System.out.print(" gapful,");
            }
        }
    }


    private static void checkForOddOrEven2(long tim) {
        if(tim % 2 ==0){
            System.out.print(" even");
        } else {
            System.out.print(" odd");
        }
    }


    private static void callMethod2(String s, String s1) {
        long num1 = Long.parseLong(String.valueOf(s));
        long num2 = Long.parseLong(String.valueOf(s1));
        long num3 = num1 + num2;
        if (num1 < 0) {
            System.out.println("The first parameter should be a natural number or zero.");
        }
        else {
            if (num2 <= 0) {
                System.out.println("The second parameter should be a natural number.");
            } else {
                for (long i = num1; i < num3; i++) {
                    System.out.print(" \n "+i + " is ");
                    checkFotBuzzNumber1(i);
                    duckofnumb1(i);
                    palindrome1(i);
                    gapful1(i);
                    sunny2(i);
                    square2(i);
                    spy1(i);
                    checkForOddOrEven1(i);
                }
            }
        }
        repeat();
    }

    private static void square2(long i) {
        double te = (double) i;
        int sq = (int) Math.sqrt(te);
        double res = (sq * sq);
        if (res == te) {
            System.out.print(" square,");
        }
    }

    private static void sunny2(long i) {
        double te = (double) i;
        double q = (te + 1);
        int sq = (int) Math.sqrt(q);
        double res = (sq * sq);
        if (res == q) {
            System.out.print(" sunny,");
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
                    sunny1(num);
                    square1(num);
                    checkForOddOrEven(num);
                    repeat();
                }
            } catch (NumberFormatException e) {
                System.out.println("The first parameter should be a natural number or zero.");
                repeat();
            }
    }

    private static void square1(long num) {
        double te = (double) num;
        int sq = (int) Math.sqrt(te);
        double res = (sq * sq);
        boolean result = (res == te);
            System.out.println("\t  square: " + result);
        }

    private static void sunny1(long num) {
        double te = (double) num;
        double q = (te + 1);
        int sq = (int) Math.sqrt(q);
        double res = (sq * sq);
        boolean result = (res == q);
            System.out.println("\t  sunny: " + result);
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
            System.out.print(" Odd,");
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
        System.out.println("- two natural numbers and two properties to search for;");
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
            case 4 :
                callMethod4(str[0], str[1], str[2],str[3]);
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

