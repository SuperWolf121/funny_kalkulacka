package randombull;

import java.util.Scanner;

public class funny_kalkulacka {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Cau vitej v me kalkulacce");
        System.out.print("Co chces delat?");      // Hej cus
        System.out.println();
        System.out.println("Moznosti: +, -, /, *");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        String moznost = sc.nextLine();
        int y,z;
        if(moznost.equals("+")){

            System.out.println("Ok, tak jaky chces cisla?");
            System.out.println();
            System.out.println("Napoveda: napis cislo a potom enter, po nem dalsi cislo a zase enter");
            System.out.println();
            do {
                y = sc.nextInt();
                z = sc.nextInt();
                if (y >= 10 || z >= 10) {
                    System.out.println("Btw ty cisla");
                    System.out.println("ehm");
                    System.out.println("Kazdy cislo musi byt mensi nez deset");
                }
            } while (y >= 10 || z >= 10);
            System.out.println("ok..");
            System.out.println();
            System.out.println("pockej...");
            System.out.println("Ty nevis kolik je " + y + " + " + z + " ?");
            System.out.println("hahaha !!!");
            System.out.println();
            System.out.println("ZA PET");
            System.out.println(" - učitelka Matiky");

        }else {
            do {
                System.out.println("Sorry to jeste neumim");
                System.out.println();
                moznost = sc.nextLine();
            } while (!moznost.equals("+"));
            System.out.println("Ok, tak jaky chces cisla?");
            System.out.println();
            System.out.println("Napoveda: napis cislo a potom enter, po nem dalsi cislo a zase enter");
            System.out.println();
            do {
                y = sc.nextInt();
                z = sc.nextInt();
                if (y >= 10 || z >= 10) {
                    System.out.println("Btw ty cisla");
                    System.out.println("ehm");
                    System.out.println("Kazdy cislo musi byt mensi nez deset");
                }
            } while (y >= 10 || z >= 10);
            System.out.println("ok..");
            System.out.println();
            System.out.println("pockej...");
            System.out.println("Ty nevis kolik je " + y + " + " + z + " ?");
            System.out.println("hahaha !!!");
            System.out.println();
            System.out.println("ZA PET");
            System.out.println(" - učitelka Matiky");
        }
    }
}