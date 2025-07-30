/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	  int n=197;
        String s=String.valueOf(n);
        int l=s.length();
        char carr[]=s.toCharArray();
        int arr[]=new int[carr.length];
        for (int i=0;i<l;i++){
            arr[i]=Character.getNumericValue(carr[i]);
        }int sum=0;
        boolean kth=false;
        while(sum<n){
            sum=0;
        for(int i=0;i<l;i++){
            sum+=arr[i];
        }
        if(sum==n){
           kth=true; 
        }
        for(int i=0;i<l-1;i++){
            arr[i]=arr[i+1];
        }
        arr[l-1]=sum;
        }
        if(kth){
            System.out.println(sum+"its keith number");
        }
        else{
            System.out.println(sum+"not an keith number");
        }
        
	}
}
