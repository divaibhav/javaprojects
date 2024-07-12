//WAP to accept an number from user,
// and check if the number is greater than 100,
// if greater, then print the number.
// This code will always print Thank you.
import java.util.Scanner;
class FirstConditional{
    public static void main(String[] args){
        //creating an Scanner object and initializing 
        // it. Also attaching the input source i.e. 
        // console input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");// prompting the user
        int number = scanner.nextInt();
        // conditional execution
        if(number > 100){
            System.out.println("Number =" + number);            
        }
        System.out.println("Thank you");
    }
}