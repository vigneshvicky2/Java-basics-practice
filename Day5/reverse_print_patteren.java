import java.util.*;

public class reverse_print_patteren{
	public static void main(String[] args){	
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=1;
        for(int i =1;i<=n;i++) {
        	int d =i;
        	boolean t=true;
        	for(int j=1;j<=i;j++) {
        		if(t) {
        			System.out.print(" "+d);
        			d+=(n-i)*2+1;
        			t=false;
        		}
        		else{
        			System.out.print(" "+d);
        			d+=(i-j)*2;
        			t=true;
        		}
        	}
        	
        	System.out.println();
        }
		
}}