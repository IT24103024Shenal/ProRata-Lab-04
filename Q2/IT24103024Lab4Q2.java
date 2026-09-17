import java.util.Scanner;

public class IT24103024Lab4Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter exam marks (out of 100): ");
        double examMarks = input.nextDouble();
        if (examMarks < 0 || examMarks > 100) {
            System.out.println("Invalid input for exam marks. Terminating program.");
            return;
        }

        System.out.print("Please enter lab submission marks (out of 100): ");
        double labMarks = input.nextDouble();
        if (labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid input for lab submission marks. Terminating program.");
            return;
        }

        System.out.print("Please enter the percentage given for the exam: ");
        double examPercent = input.nextDouble();
        System.out.print("Please enter the percentage given for the lab submission: ");
        double labPercent = input.nextDouble();

        if (examPercent + labPercent != 100) {
            System.out.println("The percentages must add up to 100. Terminating program.");
            return;
        }

        double finalMark = (examMarks * examPercent / 100) + (labMarks * labPercent / 100);

        System.out.println();
        System.out.println("Final Exam Mark is : " + finalMark);
    }
}