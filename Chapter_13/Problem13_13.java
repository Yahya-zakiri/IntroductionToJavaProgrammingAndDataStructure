// Problem13_13
// Chapter 13 - Course cloneable (deep copy students)

import java.util.ArrayList;

public class Problem13_13 {
    public static void main(String[] args) {
        Course c = new Course("CS", new String[] { "A", "B" });
        Course d = c.clone();
        d.addStudent("C");
        System.out.println(java.util.Arrays.toString(c.getStudents()));
        System.out.println(java.util.Arrays.toString(d.getStudents()));
    }
}

class Course implements Cloneable {
    private String name;
    private ArrayList<String> students = new ArrayList<>();

    public Course(String name, String[] s) {
        this.name = name;
        for (String x : s)
            students.add(x);
    }

    public void addStudent(String s) {
        students.add(s);
    }

    public String[] getStudents() {
        return students.toArray(new String[0]);
    }

    @Override
    public Course clone() {
        try {
            Course c = (Course) super.clone();
            c.students = new ArrayList<>(this.students);
            return c;
        } catch (Exception e) {
            return null;
        }
    }
}
