import java.util.Scanner;

public class GradeCalculator {

public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in);
    int numberOfAssignments = 7;
    int numberOfLabs = 16 ;
    int totalAssignmentScore;
    int totalLabScore;
    int totalTestScore = 0;
    int totalHomeworkScore = 0;
    int zyante;
    int attendance;
    int midterm1;
    int midterm2;
    int finalTest;
    int quizScore;
    int pat;


    for (int i = 1; i < numberOfAssignments; i++) {
        System.out.println("Enter your score obtained in Assignment No."+ i + ":");
        totalAssignmentScore = scanner.nextInt();
        {
            totalHomeworkScore += totalAssignmentScore;
            System.out.println(totalHomeworkScore);
        }

    }
    for (int i = 1; i < numberOfLabs; i++) {
        System.out
                .println("Enter your score obtained in Lab No." + i + ":");
        totalLabScore = scanner.nextInt();
        {
            totalHomeworkScore += totalLabScore;
            System.out.println(totalHomeworkScore);
        }
    }
    System.out.println("Enter your score obtained in Zyante: ");
    zyante = scanner.nextInt();
    totalHomeworkScore +=zyante;

    System.out.println("Enter your total score obtained in Attendance: ");
    attendance = scanner.nextInt();
    totalHomeworkScore += attendance;

    System.out.println("Enter your Midterm no. 1 score: ");
    midterm1 = scanner.nextInt();
    totalTestScore += midterm1;

    System.out.println("Enter your Midterm no. 2 score: ");
    midterm2 = scanner.nextInt();
    totalTestScore += midterm2;

    System.out.println("Enter your Final exam score: ");
    finalTest = scanner.nextInt();
    totalHomeworkScore += finalTest;

    System.out.println("Enter your total score in the in-class Quizzes: ");
    quizScore = scanner.nextInt();
    totalHomeworkScore += quizScore;

    System.out.println("Enter your score for PAT: ");
    pat = scanner.nextInt();
    totalHomeworkScore += pat;


    System.out.println("Your total test score is: " + totalTestScore );
    System.out.println("your total homework score is: " + totalHomeworkScore);





}
}
 