import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Bugs {

    public static void main(String[] args) 
{
        /*System.out.println("Hello World!");*/
        System.out.println("\n**************************************\n");
        System.out.println("\tWelcome to TheDesk \n");
        System.out.println("**************************************");
        
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        ArrayList<Integer> expenses = new ArrayList<Integer>();
        expenses.add(1000);
        expenses.add(2300);
        expenses.add(45000);
        expenses.add(32000);
        expenses.add(110);
        expenses.addAll(arrlist);
        
        optionsSelection(expenses);

    }
    private static void optionsSelection(ArrayList<Integer> arrayList) {
        String[] arr = {"1. I wish to review my expenditure",
                "2. I wish to add my expenditure",
                "3. I wish to delete my expenditure",
                "4. I wish to sort the expenditures",
                "5. I wish to search for a particular expenditure",
                "6. Close the application"
        };
        int[] arr1 = {1,2,3,4,5,6};
        int  slen = arr1.length;
        for(int i=0; i<slen;i++)
        {
            System.out.println(arr[i]);
            // display the all the Strings mentioned in the String array
        }
        
        	
           
            	 
        System.out.println("\nEnter your choice:\t");
        Scanner sc = new Scanner(System.in);
        int  options =  sc.nextInt();
        //for(int j=1;j<=slen;j++)
        //{
          //  if(options==j)
           // {
       
                switch (options)
                {
                    case 1:
                        System.out.println("Your saved expenses are listed below: \n");
                        System.out.println(arrayList+"\n");
                        optionsSelection(arrayList);
                      
                        break;
                    case 2:
                        System.out.println("Enter the value to add your Expense: \n");
                        int value = sc.nextInt();
                        arrayList.add(value);
                        System.out.println("Your value is updated\n");
                        //expenses.addAll(arrlist);
                        System.out.println(arrayList+"\n");
                        optionsSelection(arrayList);

                        break;
                    case 3:
                        System.out.println("You are about the delete all your expenses! \nConfirm again by selecting the same option...\n");
                        int con_choice = sc.nextInt();
                        if(con_choice==options){
                               arrayList.clear();
                            System.out.println(arrayList+"\n");
                            System.out.println("All your expenses are erased!\n");
                        } else {
                            System.out.println("Oops... try again!");
                        }
                        optionsSelection(arrayList);
                        break;
                    case 4:
                        sortExpenses(arrayList);
                        optionsSelection(arrayList);
                        break;
                    case 5:
                        searchExpenses(arrayList);
                        optionsSelection(arrayList);
                        break;
                    case 6:
                        closeApp();
                        break;
                    default:
                        System.out.println("You have made an invalid choice!");
                        break;
                }
            //}
        //}

    }
    private static void closeApp() {
        System.out.println("Closing your application... \nThank you!");
            }
    private static void searchExpenses(ArrayList<Integer> arrayList) {
        int leng = arrayList.size();
        Collections.sort(arrayList); 
        System.out.println("Enter the expense you need to search:\t");
        Scanner sc = new Scanner(System.in);
        int  key =  sc.nextInt();
        int low=0;
        int high=leng-1;
        while(low<=high)
        {
        	int mid=(low+high)/2;
        	if( arrayList.get(mid)==key)
        		  {
        		    System.out.println("the expense is found.\n\n\n\n");
        		    return ;
        		  }
        	else if (arrayList.get(mid)<key)
        		    low=mid+1;
        	else
        		high=mid-1;
        }
       
        System.out.println("the expense is not found.\n\n\n\n");
        return;
        //Complete the method
    }
    private static void sortExpenses(ArrayList<Integer> arrayList) {
 
        Collections.sort(arrayList); 
        System.out.println("After sortiog expenses are:-");
        System.out.println(arrayList+"\n\n\n\n");
        
       //Complete the method. The expenses should be sorted in ascending order.
    }
}