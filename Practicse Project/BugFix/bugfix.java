package BugFix;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Scanner;

	public class bugfix {
		public static void main(String[] args) { 
	        System.out.println("\n**************\n");
	        System.out.println("Welcome to Deskboard  \n");
	        System.out.println("**************");
	        optionsSelection();

	    }
	    private static void optionsSelection() {
	        String[] arr = {"1. I wish to review my PAYMENT DATA",
	                "2. I wish to add my PAYMENT DETAILS",
	                "3. I wish to delete my PAYMENT HISTORY",
	                "4. I wish to sort the PAYMENT STATUS",
	                "5. I wish to search for a particular PAYMENT OPTION",
	                "6. Close the PAYMENT ACCOUNT "
	        };
	        int[] arr1 = {1,2,3,4,5,6};
	        int  slen = arr1.length;
	        for(int i=0; i<slen;i++){
	            System.out.println(arr[i]);
	          
	        }
	        ArrayList<Integer> arrlist = new ArrayList<Integer>();
	        ArrayList<Integer> PAYMENT = new ArrayList<Integer>();
	        PAYMENT.add(1000);
	        PAYMENT.add(2300);
	        PAYMENT.add(45000);
	        PAYMENT.add(32000);
	        PAYMENT.add(110);
	        PAYMENT.addAll(arrlist);
	        System.out.println("\nEnter your choice:\t");
	        Scanner sc = new Scanner(System.in);
	        int  options =  sc.nextInt();
	        for(int j=1;j<=slen;j++){
	            if(options==j){
	                switch (options){
	                    case 1:
	                        System.out.println("Your saved PAYMENT list: \n");
	                        System.out.println(PAYMENT+"\n");
	                        optionsSelection();
	                        break;
	                    case 2:
	                        System.out.println("Enter the value to add your PAYMENT: \n");
	                        int value = sc.nextInt();
	                        PAYMENT.add(value);
	                        System.out.println("Your  PAYMENT value is updated\n");
	                        PAYMENT.addAll(arrlist);
	                        System.out.println(PAYMENT+"\n");
	                        optionsSelection();

	                        break;
	                    case 3:
	                        System.out.println("You are about the delete all your PAYMENT HISTORY! \nConfirm again by selecting the same option...\n");
	                        int con_choice = sc.nextInt();
	                        if(con_choice==options){
	                               PAYMENT.clear();
	                            System.out.println(PAYMENT+"\n");
	                            System.out.println("All your PAYMENT HISTORY are erased!\n");
	                        } else {
	                            System.out.println("Oops... try again!");
	                        }
	                        optionsSelection();
	                        break;
	                    case 4:
	                        sortPAYMENT(PAYMENT);
	                        optionsSelection();
	                        break;
	                    case 5:
	                        searchPAYMENT(PAYMENT);
	                        optionsSelection();
	                        break;
	                    case 6:
	                        closeApp();
	                        break;
	                    default:
	                        System.out.println("You have made an invalid choice!");
	                        break;
	                }
	            }
	        }

	    }
	    private static void closeApp() {
	        System.out.println("Closing your PAYMENT ACCOUNT... \nThank you!");
	            }
	    private static void searchPAYMENT(ArrayList<Integer> arrayList) {
	        int leng = arrayList.size();
	        System.out.println("Enter the PAYMENT OPTION you need to search:\t");
	        //
	        Scanner sc = new Scanner(System.in);
	        int input = sc.nextInt();
	        for(int i=0;i<leng;i++) {
	        	if(arrayList.get(i)==input) {
	        		System.out.println("Found the PAYMENT " + input + " at " + i + " position");
	        	}
	        }
	    }
	    private static void sortPAYMENT(ArrayList<Integer> arrayList) {
	        int arrlength =  arrayList.size();
	        Collections.sort(arrayList);
	        System.out.println("Sorted PAYMENT Details: ");
	        for(Integer i: arrayList) {
	        	System.out.print(i + " ");
	        }
	        
	        System.out.println("\n");
	       
	    }
	}	


