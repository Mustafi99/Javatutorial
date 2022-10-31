package hackerRank;

import java.util.Scanner;

public class Hr5 {
	
	    public static void main(String[] args)
	    {
	        Scanner sc=new Scanner(System.in);
	        for(int i=0; i<3; i++)
	        {
	            String s1=sc.next();
	            int x=sc.nextInt();
	            System.out.printf("%-14s %03d %n", s1, x);
	            // %-14s left-justified from o to 14 for string
	            // %03d padded with leading zero for int
	        }
	    }

	}