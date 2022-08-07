import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class VirtualKeyForYourRepositories {

	public static void main(String[] args) throws IOException {
		 /*FOR WELCOME SCREEN*/
        System.out.println("\n********************************************************************************\n\n\n\n\n");
        System.out.println("\tWELCOME TO THE VIRTUAL KEY  \n\tFOR YOUR REPOSITORIES DESK.\n\n\n\n\n");
        System.out.println("\t\t\t\tDEVELOPER:-  BHAIRU LAL JAT");
        System.out.println("\t\t\t\tCONTACT DETAILS:-9602462211\n");
        System.out.println("********************************************************************************\n\n\n\n");
        
        
        System.out.println("please enter the directory path to open main menu:");
        try (Scanner scstr = new Scanner(System.in)) {
			String pathname=scstr.nextLine();
			mainMenu(pathname);
		}
        
      
        
       
        
	}
	 private static void mainMenu(String pathname) throws IOException 
	 {
		  /*FOR MAIN MENU SCREEN*/
	        System.out.println("\n\n\n********************************************************************************\n\n\n");
	        System.out.println("\t\t\t-: MAIN MENU :-\n\n\n");
	        System.out.println("\t# 1 For Retrieving the file names in an ascending order.\r\n"
	        		+ "\r\n"
	        		+ "\t# 2 For Business-level operations:\r\n"
	        		
	        		+ "\t\t To add a user specified file to the application.\r\n"
	        		
	        		+ "\t\t To delete a user specified file from the application.\r\n"
	        		
	        		+ "\t\t To search a user specified file from the application.\r\n"
	        		
	        		+ "\t\t To close the current execution context \n\t\t and return to the main context.\r\n"
	        		+ "\r\n"
	        		+ "\t# 3 For close the application.");
	        System.out.println("\n\n\n********************************************************************************");
	        
	        System.out.println("\nEnter your choice:\t");
	        try( Scanner sc = new Scanner(System.in);)
	        {
	        	 int  options =  sc.nextInt();
	        	  
	 	        switch (options)
	 	        {
	 	            case 1:
	 	            	 System.out.println("\n********************************************************************************\n");
	 	            	 System.out.println("files and directories at the given path are listed below:-");
	 	            	 display(pathname);
	 	            	 System.out.println("\n********************************************************************************");
	 	            	 System.out.println("Enter any integer for continue:-");
	 	            	 int c=sc.nextInt();
	 	                 mainMenu(pathname);
	 	            	break;
	 	            	
	 	            case 2:
	 	            	subMenu(pathname);
	 	            	
	 	            	break;
	 	            	
	 	            case 3:
	 	                closeApp();
	 	                break;
	 	                
	 	            default:
	 	                System.out.println("You have made an invalid choice!");
		                System.out.println("Enter any positive integer for continue:-");
		            	int cd=sc.nextInt();
		 	        	if(cd>=0) mainMenu(pathname);
	 	                break;
	 	        }
	        }
	       
	        
	      
	 }
	private static void subMenu (String pathname) throws IOException
	 {
		System.out.println("\n\n\n********************************************************************************\n\n\n");
     	System.out.println("\t Enter 1 for Add a file to the existing directory.\r\n");
     	System.out.println("\t Enter 2 for Delete a specified file from the existing directory.\r\n");
     	System.out.println("\t Enter 3 for Search specified file from the existing directory.\r\n");
     	System.out.println("\t Enter 4 to navigate back to the main menu.\r\n");
     	System.out.println("\n\n\n********************************************************************************");
     	 System.out.println("\nEnter your choice:\t");
	        try( Scanner sc = new Scanner(System.in);)
	        {
	        	 int  options =  sc.nextInt();
	        	  
	 	        switch (options)
	 	        {
	 	        case 1:
	 	        	System.out.println("please enter the file name precedig by backslash");
	 	        	Scanner scstr = new Scanner(System.in);
	 	        	String s=scstr.nextLine();
		   			String newfilepathname= pathname+s;
		 	   		 File newpath=new File(newfilepathname);
		 	   		 if(newpath.createNewFile())
		   			 System.out.println("new file added.");
		 	   		 else 
		 	   			 System.out.println("this file is already persent.");
		   			System.out.println("Enter any positive integer for continue:-");
	            	 int c1=sc.nextInt();
	            	 if(c1>=0) subMenu(pathname);
	 	        	break;
	 	       case 2:
	 	    	  System.out.println("please enter the file name precedig by backslash");
	 	        	Scanner scstr2 = new Scanner(System.in);
	 	        	String s2=scstr2.nextLine();
		   			String newfilepathname2= pathname+s2;
		 	   		 File newpath2=new File(newfilepathname2);
		 	   		 if(newpath2.delete())
		   			 System.out.println("file deleted.");
		 	   		 else 
		 	   			 System.out.println("this file is not present.");
		   			System.out.println("Enter any positive integer for continue:-");
	            	 int c2=sc.nextInt();
	            	 if(c2>=0) subMenu(pathname);
	 	        	break;
	 	       case 3:
	 	    	  System.out.println("please enter the file name precedig by backslash");
	 	        	Scanner scstr3 = new Scanner(System.in);
	 	        	String s3=scstr3.nextLine();
		   			String newfilepathname3= pathname+s3;
		 	   		 File newpath3=new File(newfilepathname3);
		 	   		if(newpath3.exists())
						 System.out.println("this file is present ");
						 else 
							 System.out.println("this file is not persent.");
	 	    	   System.out.println("Enter any positive integer for continue:-");
	            	 int c3=sc.nextInt();
	            	 if(c3>=0) subMenu(pathname);
	 	        	break;
	 	       case 4:
	 	    	   mainMenu(pathname);
	 	        	break;
	 	      default:
	                System.out.println("You have made an invalid choice!");
	                System.out.println("Enter any positive integer for continue:-");
	            	int cd=sc.nextInt();
	 	        	if(cd>=0) subMenu(pathname);
	                break; 
	 	        }
	 	        
	        }	
	 }

	 private static void  display(String pathname)
	 {
		 File path=new File(pathname);
		 String [] arr=path.list();
		
		 for(int i=0;i<arr.length;i++)
         {
         	System.out.println(arr[i]);
         }
	 }
	 private static void closeApp() {
	        System.out.println("Closing your application... \nThank you!");
	            }

	 
}
