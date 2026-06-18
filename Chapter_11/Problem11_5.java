// Problem 11.5
// Course using ArrayList
// Chapter_11

import java.util.ArrayList;
import java.util.Arrays;

public class Problem11_5 {
    public static class Course {
        private String name;
        private ArrayList<String> students = new ArrayList<>();

        public Course(String name) {
            this.name = name;
        }

        public void addStudent(String s) {
            students.add(s);
        }

        public void dropStudent(String s) {
            students.remove(s);
        }

        public String[] getStudents() {
            return students.toArray(new String[0]);
        }

        public int getNumberOfStudents() {
            return students.size();
        }
    }

    public static void main(String[] args) {
        Course c = new Course("CS");
        c.addStudent("A");
        c.addStudent("B");
        System.out.println(Arrays.toString(c.getStudents()));
        c.dropStudent("A");
        System.out.println(Arrays.toString(c.getStudents()));
    }
}