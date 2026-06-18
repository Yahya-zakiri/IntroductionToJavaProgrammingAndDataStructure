// Problem 11.2
// Person hierarchy: Person, Student, Employee, Faculty, Staff
// Chapter_11

public class Problem11_2 {
    public static class Person {
        protected String name, address, phone, email;

        public Person(String name) {
            this.name = name;
        }

        public String toString() {
            return getClass().getSimpleName() + ": " + name;
        }
    }

    public static class Student extends Person {
        public static final String FRESHMAN = "freshman", SOPHOMORE = "sophomore", JUNIOR = "junior", SENIOR = "senior";
        private String status;

        public Student(String name, String status) {
            super(name);
            this.status = status;
        }

        public String toString() {
            return super.toString();
        }
    }

    public static class Employee extends Person {
        protected String office;
        protected double salary;
        protected java.util.Date dateHired;

        public Employee(String name) {
            super(name);
            dateHired = new java.util.Date();
        }

        public String toString() {
            return super.toString();
        }
    }

    public static class Faculty extends Employee {
        private String officeHours, rank;

        public Faculty(String name) {
            super(name);
        }
    }

    public static class Staff extends Employee {
        private String title;

        public Staff(String name) {
            super(name);
        }
    }

    public static void main(String[] args) {
        Person p = new Person("Alice");
        Student s = new Student("Bob", Student.FRESHMAN);
        Employee e = new Employee("Carol");
        Faculty f = new Faculty("Dave");
        Staff st = new Staff("Eve");
        System.out.println(p);
        System.out.println(s);
        System.out.println(e);
        System.out.println(f);
        System.out.println(st);
    }
}