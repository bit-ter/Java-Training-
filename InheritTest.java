/*package whatever //do not write package name here */

import java.io.*;

class A{
    int roll;
    void show(){
        System.out.println("Inside A roll is " + roll);
    }
    public int getRoll(){
        return this.roll;
    }
    public void setRoll(int roll){
        this.roll=roll;
    }
    
}
class B extends A{
    void show(){
        System.out.println("Inside B roll is "+roll);
    }
    void test(){
        System.out.println("Test method");
    }
}
class InheritTest {
    
	public static void main (String[] args) {
	    A a=new A();
	    a.setRoll(50);
	    a.show();
	    A b=new B();    //b is object of A initialised by B
	    b.setRoll(70);
	    b.show();
	    b.test();   //cannot access test() as it belongs to class B 
	    
	    
	}
}
