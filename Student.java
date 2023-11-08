import java.util.Arrays;
import java.util.Comparator;

/**
 * This class represents a Student.
 */
public class Student {
  private final String name;
  private final int age;
  private final String group;
  private final int grade;
  private final String email;

  /**
   * Constructor for creating a cosmetic product.
   *
   * @param name    The name of the Student.
   * @param age   The age of the Student.
   * @param group   The group of the Student.
   * @param grade  The grade of the Student.
   * @param email The email of the Student.
   */
  public Student(String name, int age, String group, int grade, String email) {
    this.name = name;
    this.age = age;
    this.group = group;
    this.grade = grade;
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getGroup() {
    return group;
  }

  public int getGrade() {
    return grade;
  }

  public String getEmail() {
    return email;
  }

  /**
   * Copies an array and sorts students by group in ascending order.
   *
   * @param students The array of Students to be sorted.
   */
  public static Student[] sortByGroupAscending(Student[] students) {
    Student[] studentsCopy = new Student[students.length];
    System.arraycopy(students, 0, studentsCopy, 0, students.length);
    Arrays.sort(studentsCopy, Comparator.comparing(Student::getGroup));

    return studentsCopy;
  }

  /**
   * Copies an array and sorts students by age in descending order.
   *
   * @param students The array of Students to be sorted.
   */
  public static Student[] sortByAgeDescending(Student[] students) {
    Student[] studentsCopy = new Student[students.length];
    System.arraycopy(students, 0, studentsCopy, 0, students.length);
    Arrays.sort(studentsCopy, Comparator.comparing(Student::getAge).reversed());

    return studentsCopy;
  }

  public String toString() {
    return String.format("\nStudent - %s\nAge - %d\nGroup - %s\nGrade - %d\nEmail - %s", name, age, group, grade, email);
  }
}
