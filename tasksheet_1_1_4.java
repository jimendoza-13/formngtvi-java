import java.util.Scanner;
public class tasksheet_1_1_4 {

    public static void main(String[] args) {
        
        int score;
        char grade;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the score of the student");
        score = scan.nextInt();
        
        if(score >= 90){
            grade = 'A';
        }
        else if (score >= 80){
            grade = 'B';
        }
        else if (score >= 70){
            grade = 'C';
        }
        else if (score >= 60){
            grade = 'D';
        }
        else {
            grade = 'F';
        }
        
        System.out.println("Your grade is " + grade);
    }
}
