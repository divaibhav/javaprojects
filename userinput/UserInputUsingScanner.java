import java.util.Scanner;
class UserInputUsingScanner{
    public static void main(String[] args){
        // create Scanner class object
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter an interger value");
        int number1 = scanner.nextInt();
        System.out.println("Enter the room temprature");
        float temprature = scanner.nextFloat();
        System.out.println("Is table available  true or false");
        boolean isAvailable = scanner.nextBoolean();
        System.out.println("Is table available = " + isAvailable);
    }

}