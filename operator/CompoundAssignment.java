import java.util.Scanner;
class CompoundAssignment{
    public static void main(String[] args){
        // compound assignment
        /*
            int a = 10;
            a += 3; a = a + 3; 13
            a -= 2; a = a - 2; 11
            a *= 5; a = a * 5; 55
            a /= 5; a = a / 5; 11
            a %= 10; a = a % 10; 1
        */
       Scanner scanner = new Scanner(System.in);
       int number = 0;
       number +=10;
       System.out.println(number);
    }
}