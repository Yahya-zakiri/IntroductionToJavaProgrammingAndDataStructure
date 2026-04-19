
// Chapter 8
// 8.5 Case Study
// Listing 8.2

public class GradeExam {

    public static void main(String[] args) {
        char[][] answers = {
                { 'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
                { 'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D' },
                { 'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D' },
                { 'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D' },
                { 'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
                { 'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
                { 'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
                { 'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' } };
        char[] keys = { 'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D' };

        for (int i = 0; i < answers.length; i++) {
            int correctAnswers = 0;
            for (int j = 0; j < keys.length; j++) {
                if (answers[i][j] == keys[j]) {
                    correctAnswers++;
                }
            }
            System.out.println("Student " + (i + 1) + " correct answers: " + correctAnswers);
        }
    }
}