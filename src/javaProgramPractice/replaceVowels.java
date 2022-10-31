package javaProgramPractice;

import java.util.Scanner;

public class replaceVowels
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the string");
        String st=scan.nextLine();
        char ch[]=st.toCharArray();
        for (int i = 0; i < ch.length; i++)
        {
               if (ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
               {
                ch[i]='$'; //replacing $ in the place of vowels
               }   
        }
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }
    }
}