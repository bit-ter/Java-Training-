import java.util.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int f=sc.nextInt();
	    int factorial=1;
	    while(f>0){
	        factorial*=f--;
	    }
	    System.out.println(factorial);
	    sc.close();
	}
}
