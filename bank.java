 /******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class bank
{
	public static void main(String[] args) {
	    int balance=100000,withdraw,deposit;
	   Scanner sc= new Scanner(System.in);
	   while(true){
	       System.out.println("choice 1: withdraw money");
	       System.out.println("choice 2: deposit money");
	       System.out.println("choice 3: availible balance");
	       System.out.println("choice 4: exit");
	       int choice=sc.nextInt();
	       switch(choice){
	           case 1:
	               System.out.println("enter money to withdraw");
	               withdraw=sc.nextInt();
	               if(withdraw<=balance){
	                   balance=balance-withdraw;
	                   System.out.println("plse collect ur cash");
	               }
	               else{
	                   System.out.println("insufficient balance");
	               }
	               break;
	               case 2:
	                   System.out.println("enter amount to deposit");
	                   deposit=sc.nextInt();
	                   balance=deposit+balance;
	                   System.out.println("succesfully deposited");
	                   System.out.println(balance);
	                   System.out.println("");
	                   break;
	                   case 3:
	                       System.out.println("balance"+balance);
	                       System.out.println("");
	                       break;
	                       case 4:
	                           System.out.println("exited");
	               }
	       }
	       
	   }
	}
