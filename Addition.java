//addition using instance variables
import java.io.*;
import java.util.*;
class Addition {
    
    private int n1,n2;
    
    
    public Addition(int a,int b){
        n1=a;
        n2=b;
    }
    
    public int add(){
        return n1+n2;
    }
    
	public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        Addition a= new Addition(sc.nextInt(),sc.nextInt());
        System.out.println("The sum is: "+a.add());
	}
}
