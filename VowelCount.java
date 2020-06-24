import java.util.*;
import java.io.*;
public class StringDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int count = 0;
		for(int i = 0;i<s.length();i++){
		    switch(s.charAt(i)){
		        case 'a':
		        case 'e':
		        case 'i':
		        case 'o':
		        case 'u':{
		            count++;
		            break;
		        }
		    }
		}   
		System.out.println("Vowel count is : "+ count);
	   
	}
}
