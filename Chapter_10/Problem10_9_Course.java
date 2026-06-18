// Problem 10.9
// Course class (revised)
// Chapter_10

import java.util.Arrays;

public class Problem10_9_Course {
    public static class Course {
        private String name;
        private String[] students;
        private int numberOfStudents;

        public Course(String name) {
            this.name = name;
            students = new String[10];
            numberOfStudents = 0;
        }

        public void addStudent(String s) {
            if (numberOfStudents >= students.length) {
                students = Arrays.copyOf(students, students.length * 2);
            }
            students[numberOfStudents++] = s;
        }

        public void dropStudent(String s) {
            for (int i = 0; i < numberOfStudents; i++)
                if (students[i].equals(s)) {
                    for (int j = i; j < numberOfStudents - 1; j++)
                        students[j] = students[j + 1];
                    students[--numberOfStudents] = null;
                    break;
                }
        }

        public String[] getStudents() {
            return Arrays.copyOf(students, numberOfStudents);
        }

        public void clear() {
            students = new String[10];
            numberOfStudents = 0;
        }

        public int getNumberOfStudents() {
            return numberOfStudents;
        }
    }

    public static void main(String[] args) {
        Course c = new Course("CS101");
        c.addStudent("A");
        c.addStudent("B");
        c.addStudent("C");
        System.out.println(Arrays.toString(c.getStudents()));
        c.dropStudent("B");
        System.out.println(Arrays.toString(c.getStudents()));
        c.clear();
        System.out.println(c.getNumberOfStudents());
    }
}