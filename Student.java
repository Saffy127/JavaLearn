import java.util.*;

public class Student implements Comparable<Student>, Comparator<Student> {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public int compare(Student s1, Student s2) {
        if (s1.age == s2.age) {
            return s1.name.compareTo(s2.name);
        }
        return s1.age - s2.age;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Isaac", 22));
        students.add(new Student("Caylan", 22));
        students.add(new Student("Nolan", 21));

        // Display initial list
        System.out.println("Initial list of students:");
        for (Student s : students) {
            System.out.println(s.name + " " + s.age);
        }

        // Sort and display using Comparable (name)
        Collections.sort(students);
        System.out.println("\nSorted by name using Comparable:");
        for (Student s : students) {
            System.out.println(s.name + " " + s.age);
        }

        // Sort and display using Comparator (age, then name)
        Collections.sort(students, new Student("", 0));
        System.out.println("\nSorted by age and then name using Comparator:");
        for (Student s : students) {
            System.out.println(s.name + " " + s.age);
        }
    }
}
