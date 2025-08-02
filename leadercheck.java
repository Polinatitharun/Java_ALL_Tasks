
/*

 Problem 2: Leaders in an Array
Problem Statement:

Given an array of integers, print all the leaders in the array.
An element is a leader if no element to its right is greater than it.

📥 Input:
First line: an integer n (size of array)

Second line: n space-separated integers

📤 Output:
Print all leader elements in the order they appear from left to right in the original array.
Input:
6  
16 17 4 3 5 2
Output:
17 5 2
✅ Explanation:

17 is greater than all elements to its right → ✔

5 is greater than 2 → ✔

2 is last element → always a leader ✔

16, 4, 3 are not leaders.

*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    for(int i=0;i<n;i++){
	        a[i]=sc.nextInt();
	    }
	    
	    for(int i=0;i<n;i++){
	        boolean f=false;
	        for(int j=i+1;j<n;j++){
	            if(a[i]<a[j]){
	                f=true;
	            }
	        }
	        if(f==false){
	            System.out.println(a[i]);
	        }
	    }
	}
}
