package utils;
import java.util.Scanner;
public class Main
{
    public static void main (String args [])
    {
    	Scanner sc=new Scanner (System.in);
    	System.out.println("Introdu nota");
    	Integer note =sc.nextInt();
    	System.out.println("Alegeti subiect: \n 1. -DE \n 2. -SS \n 3. -Engleza \n 4. -MS");
    	Integer options=sc.nextInt();
    	switch (options) 
    	{
    	case 1: 
    		System.out.println("Nota la DE este " +note);
    		break;
    	case 2:	
    		System.out.println("Nota la SS este " +note);
    		break;
    	case 3:	
    		System.out.println("Nota la Engleza este " +note);
    		break;
    	case 4:	
    		System.out.println("Nota la Ms este " +note);
    		break;
    	}
    
    }
}
