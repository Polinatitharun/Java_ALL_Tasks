
/* Correct Input:
"abcaabbccdeaa"

🔍 Step-by-step Count:
'a' appears at: index 0, 3, 4, 11, 12 → 5 times

'b' appears at: index 1, 5 → 2 times

'c' appears at: index 2, 6, 7 → 3 times

'd' appears at: index 8 → 1 time

'e' appears at: index 9 → 1 time
Correct Output:
5a2b3c1d1e */

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
	    String res="";
	    String cs="";
		for(int i=0;i<s.length();i++){
		    int c=0;
		    if(cs.contains(s.charAt(i)+"")){
		        continue;
		    }
		    else{
		    for(int j=0;j<s.length();j++){
		        if(s.charAt(i)==s.charAt(j) ){
		            c++;
		            
		        }
		    }
		    cs+=s.charAt(i)+"";
		    res+=c+""+s.charAt(i);
		    }
		}
		System.out.println(res);
	}
}
