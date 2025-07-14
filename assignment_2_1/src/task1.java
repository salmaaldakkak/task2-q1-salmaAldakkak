import java.util.Scanner;

public class task1 {
    public static void main(String[]args){


        Scanner in = new Scanner(System.in);

        char grade;
        System.out.print("Enter your grade Letter (ex. A, B, C, D, F): ");
        grade = in.next().charAt(0);
        grade = Character.toUpperCase(grade);
        // 'switch' is case-sensitive so this line is to make sure that even if the user write the letters in small case the program still works.

        switch (grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Very good");
            break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Pass");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid grade");
        }



    }
}
