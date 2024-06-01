package scannerUse;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter a number:");
        int a= scanner.nextInt();
        System.out.println(a);
        Boolean c= scanner.nextBoolean();
        System.out.println(c);

        //after putting integer and hitting "enter"
        //the int c only reads the integer input given, keeping the newline charater(\n) onto the input buffer
        //now, when we use  [String b= scanner.nextLine();] b reads the lef-tover \n and skips taking input
        //so, a [scanner.nextLine();] is needed
        scanner.nextLine();

        //is scanner is closed here later scanner cannot be accesed
        // scanner.close();

        System.out.println("Enter a string:");
        String b= scanner.nextLine();
        System.out.println(b);
        scanner.close();
    }
}