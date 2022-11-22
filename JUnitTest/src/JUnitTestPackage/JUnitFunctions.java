package JUnitTestPackage;

import java.util.*;

public class JUnitFunctions{
	public static int addnum(int x,int y){
		int sum = x + y;  
		return sum;
	}
	
	public static String addstring(String a, String b){
		String ne=a+b;
		return ne;
		}	
	public static void main(String args[]) 
	{
		System.out.println(addnum(1,2));
		System.out.println(addstring("Raghavendra"," Prasad"));
		
		
		
	}

}