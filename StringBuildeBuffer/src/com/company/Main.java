package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
         String info = " ";
         info += "My name is Bob";
         info += " ";
         info += "I am builder";
        System.out.println(info);

        StringBuilder sb = new StringBuilder("");
        sb.append("My name is Milos");
        sb.append(" ");
        sb.append("I am a lion trainer");
        System.out.println(sb.toString());

        StringBuilder s = new StringBuilder();
        s.append("My name is Roger");
        s.append(" ");
        s.append("I am a sky driver");
        System.out.println(s.toString());

        // formating
        System.out.print(" Here is a some text.\t That was a tab \n That was a newline");
        System.out.println("More text");
        System.out.printf("total cost %d: quality is %d",5,120);
        for(int i =0; i<=20; i++){
            System.out.printf("%2d: some text here:, \n",i);
        }

        // formating
        System.out.printf("Total value: %.2f\n", 5.6);
        System.out.printf("Total value: %-6.1f\n", 355.69998);


    }
}
