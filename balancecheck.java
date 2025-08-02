/*
 Problem 3: Balanced String Check
Problem Statement:

Given a string consisting of only the characters 'L' and 'R', you need to split the string into the maximum number of balanced substrings.
A balanced substring is one where the number of 'L' characters equals the number of 'R' characters.

📥 Input:
A string s containing only 'L' and 'R'.

📤 Output:
An integer — the maximum number of balanced substrings

*/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    int bal=0;
	    int c=0;
	    for(int i=0;i<s.length();i++){
	        if(s.charAt(i)=='R'){
	            bal++;
	        }
	        else{
	            bal--;
	        }
	        if(bal==0){
	            c++;
	        }
	    }
	    System.out.println(c);
	}
}
