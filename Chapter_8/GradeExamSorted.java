// Problem 8.3
// Sort students on grades (increasing order)
// Chapter_8

import java.util.Arrays;

public class GradeExamSorted {
    public static void main(String[] args) {
        char[] answers = { 'A', 'B', 'C', 'D', 'A', 'B', 'C', 'D', 'A', 'B' };

        char[][] students = {
                { 'A', 'B', 'A', 'D', 'C', 'A', 'B', 'A', 'C', 'D' },
                { 'A', 'B', 'A', 'C', 'C', 'A', 'B', 'A', 'C', 'D' },
                { 'A', 'B', 'A', 'D', 'C', 'A', 'B', 'A', 'C', 'D' },
                { 'A', 'B', 'A', 'D', 'C', 'A', 'B', 'A', 'C', 'A' },
                { 'A', 'B', 'A', 'D', 'C', 'A', 'B', 'D', 'C', 'D' },
                { 'A', 'B', 'C', 'D', 'A', 'B', 'C', 'D', 'A', 'B' },
                { 'A', 'B', 'C', 'D', 'A', 'B', 'C', 'D', 'A', 'B' },
                { 'A', 'B', 'C', 'D', 'A', 'B', 'C', 'D', 'A', 'B' }
        };

        int n = students.length;
        int[] correctCounts = new int[n];
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < answers.length; j++) {
                if (students[i][j] == answers[j])
                    count++;
            }
            correctCounts[i] = count;
        }

        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++)
            indices[i] = i;

        Arrays.sort(indices, (a, b) -> Integer.compare(correctCounts[a], correctCounts[b]));

        for (int idx : indices) {
            System.out.println("Student " + idx + " correct count " + correctCounts[idx]);
        }
    }
}
