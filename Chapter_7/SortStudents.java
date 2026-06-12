//Chapter 7
//Programming exercises
//(Sort students by score descending)

import java.util.Scanner;
import java.util.Arrays;

public class SortStudents {
    static class Student implements Comparable<Student> {
        String name;
        double score;

        Student(String n, double s) {
            name = n;
            score = s;
        }

        public int compareTo(Student o) {
            return Double.compare(o.score, this.score);
        } // desc
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = input.nextInt();
        Student[] s = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name and score: ");
            String name = input.next();
            double score = input.nextDouble();
            s[i] = new Student(name, score);
        }
        Arrays.sort(s);
        for (Student st : s)
            System.out.println(st.name + " " + st.score);
        input.close();
    }
}