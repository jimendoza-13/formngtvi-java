import java.util.Scanner;
                 
public class taskheet1_1_7{
    public static void main(String args[])
  {
    int first, second, add, subtract, multiply;
    float divide;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter First Number: ");
    first = scanner.nextInt();
    System.out.print("Enter Second Number: ");
    second = scanner.nextInt();

    add = first + second;
    subtract = first - second;
    multiply = first * second;
    divide = (float) first / second;

    System.out.println("Sum = " + add);
    System.out.println("Difference = " + subtract);
    System.out.println("Product = " + multiply);
    System.out.println("Quotient = " + divide);
  }
}
