// for taking user input we will use library 
//class Scanner, which is coming from package 
// java.util
// TO add this class in our program, we will use import 
// statement. import statements are placed above class 
// declaration
import java.util.Scanner;
class UserInputOutput{
    public static void main(String[] args){
        //step 3
        int number1;
        double number2;
        //step 4 Scanner class object declare and initialize
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter age");
        int age = scanner.nextInt();
        System.out.println("Age = " + age);


        System.out.println("Enter your name");
        scanner.nextLine();
        String name = scanner.nextLine();
        //next()
        //nextLine();
        System.out.println("Name = " + name);
        
    }

}