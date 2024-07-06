import java.util.Scanner;   // import statement, imported Scanner class to get user input
class UserInputUsingScanner{    // class Declaration
    public static void main(String[] args){ 
        // create Scanner class object
        Scanner scanner = new Scanner(System.in); // creating Scanner class object and naming it as scanner
        System.out.println("enter an interger value");
        int number1 = scanner.nextInt(); // using Scanner class object scanner for calling nextInt method, to read an integer value
        System.out.println("Enter the room temprature");
        float temprature = scanner.nextFloat(); // using Scanner class object scanner for calling nextFloat method, to read a float value
        System.out.println("Is table available  true or false");
        boolean isAvailable = scanner.nextBoolean();//using Scanner class object scanner for calling nextBoolean method, to read a boolean value
        System.out.println("Is table available = " + isAvailable);
    }

}