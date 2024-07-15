/* 
WAP to ask user to  enter the withdrawal amount.
Check if the withdrawal amount is less than 
then balance amount, 
then print the msg withdrawal permitted. 
and always print tysm.
*/
import java.util.Scanner;
class DemoIfStatement{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the withdrawal amount ");
        int withdrawalAmount = scanner.nextInt();
        int balance = 5000;
        if(withdrawalAmount <= balance){
            System.out.println("Withdrawal permitted");
        }
        System.out.println("tysm");
    }
}