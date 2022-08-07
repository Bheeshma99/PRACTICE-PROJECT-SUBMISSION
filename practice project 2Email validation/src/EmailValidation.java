import java.util.*;
import java.util.regex.*;    
public class EmailValidation {

	public static void main(String[] args) {
		
		
		 System.out.println("Enter the count of employees.");
		 try (Scanner sc = new Scanner(System.in)) {
			int n=sc.nextInt();
			String[] emailid_collectins=new String [n+1];
			 System.out.println("Enter the emails of  all  employees.");
			 int i=0;
			 for(i=0;i<=n;i++)
			 {
				 emailid_collectins[i]=sc.nextLine();
				
			 }
			 
			
			 while(true)
			 {
				 System.out.println(" ");
				 System.out.println(" ");
				 System.out.println("Enter your email id.");
				 String regex=sc.nextLine();
				 Pattern pattern = Pattern.compile(regex);  
				 int flag=0;
				 for(i=0;i<=n;i++  )
				 {
					 Matcher matcher = pattern.matcher(emailid_collectins[i]); 
					
					 if(matcher.matches())
					 {
						 System.out.println("Valid email id");
						 flag=1; 
						 break;
					 }
				 }
				 if(flag==0)
				 {
					 System.out.println("Invalid email id."); 
				 }
			 }
		}
			 

	}

}
