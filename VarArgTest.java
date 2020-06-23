
import java.io.*;

class VarArgTest{
    
    public void test(int... a)
    {
        int sum=0;
        for(int it: a)
            sum+=it;
        System.out.println(sum);
    }
    public void test(String s,int... a)
    {
        int sum=0;
        for(int it: a)
            sum+=it;
        System.out.println(s+" "+sum);
    }
	public static void main (String[] args) {
	    VarArgTest testobj= new VarArgTest();
		testobj.test("Testing",1,3,4,5,5);
		testobj.test(3,2,4,7,8,6);
// 		testobj.test();   //ambiguity
	}
}
