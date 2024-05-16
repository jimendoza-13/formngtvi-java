import java.util.Scanner;
                 
public class tasksheet1{
	public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter First Parameter: ");
    int first = scanner.nextInt();
    System.out.print("Enter Second Parameter: ");
    int second = scanner.nextInt();
    System.out.print("Enter Third Parameter: ");
    int third = scanner.nextInt();
    
    System.out.print("\nAn array of parameters: ["+first+","+second+","+third+"]\n\n");
   
    for (int array1=1;array1<=first;array1++)
    	
    {
      System.out.print(+array1+" ");
    }
    System.out.print("\n");
    for (int array2=1;array2<=second;array2++)
    {
      System.out.print(+array2+" ");
	}
    System.out.print("\n");
    for (int array3=1;array3<=third;array3++)
    {
      System.out.print(+array3+" ");
	}
    System.out.println("\n");
 
    int x;
    int sumArray1 = 0;
    for (x=1;x <= first;x++) {
    	sumArray1 += x;
    }
    int y;
    int sumArray2 = 0;
    for (y=1;y <= second;y++) {
    	sumArray2 += y;
    }
    int z;
    int sumArray3 = 0;
    for (z=1;z <= third;z++) {
    	sumArray3 += z;
    }
    int TotalSum = sumArray1 + sumArray2 + sumArray3;
    System.out.println("The sum of Array of Parameters is: ("+sumArray1+"+"+sumArray2+"+"+sumArray3+")= "+TotalSum);
}
  }  
