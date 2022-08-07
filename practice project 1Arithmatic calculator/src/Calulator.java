import java.util.*;
public class Calulator {

	public static void main(String[] args) 
	{
	    float a;
	    float b;
	    char operation;
		System.out.println("Enter first number");
        Scanner in=new Scanner(System.in);
        a=in.nextFloat();
        System.out.println("Enter opetation");
        operation=in.next().charAt(0);
        System.out.println("Enter second number");
        b=in.nextFloat();
       if(operation=='+')
    	   System.out.println(a+b);
       if(operation=='-')
    	   System.out.println(a-b);
       if(operation=='*')
    	   System.out.println(a*b);
       if(operation=='/')
    	   System.out.println(a/b);
	}
	
}

