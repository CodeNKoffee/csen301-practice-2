import java.util.*;

public class StudentRecordsSort {
  static class Student {
    String name;
    int studentID;
    double GPA;

    public Student(String name, int studentID, double GPA) {
      this.name = name;
      this.studentID = studentID;
      this.GPA = GPA;
    }
  }

  public static void sortStudentsByName(Student[] students) {
    Arrays.sort(students, Comparator.comparing(student -> student.name));
  }

  public static void main(String[] args) {
    Student[] students = {
      new Student("Alice", 101, 3.7),
      new Student("Bob", 102, 3.5),
      new Student("Charlie", 103, 4.0),
      // Add more students here
    };

    sortStudentsByName(students);

    for (Student student : students) {
      System.out.println("Name: " + student.name + ", Student ID: " + student.studentID + ", GPA: " + student.GPA);
    }
  }
}
