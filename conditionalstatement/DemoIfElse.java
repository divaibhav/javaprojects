/* 
WAP to ask user to  enter the withdrawal amount.
Check if the withdrawal amount is less than 
then balance amount, 
then print the msg withdrawal permitted 
otherwise print withdrawal not permitted
and always print tysm.
*/
import java.util.Scanner;
class DemoIfElse{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the withdrawal amount ");
        int withdrawalAmount = scanner.nextInt();
        int balance = 5000;
        if(withdrawalAmount <= balance){
            System.out.println("Withdrawal permitted");
        }
        else{
            System.out.println("Withdrawal not permitted");

        }
        System.out.println("tysm");
    }
}