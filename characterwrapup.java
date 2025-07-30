
public class Main
{
	public static void main(String[] args) {
	 String s="ignnnite";
	 String res="";
	 for(int i=0;i<s.length();i++){
	     int c=1;
	     while(i+1<s.length()&&s.charAt(i)==s.charAt(i+1)){
	         c++;
	         i++;
	     }
	     if(c>1){
	        res+=c+""+s.charAt(i); 
	     }
	     else{
	         res+=s.charAt(i);
	     }
	    
	 }
	 System.out.println(res);
	}
}
