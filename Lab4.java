/*
1131 - zalikova
1131 % 11 = 9 => C11 = Визначити клас студент, який складається як мінімум з 5-и полів.
*/

/**
 * This class demonstrates the sorting of Students.
 */
public class Lab4 {
  public static void main(String[] args) {
    Student student1 = new Student("Danil", 19, "IM-11", 3, "04danil@gmail.com");
    Student student2 = new Student("Vasiliy", 21, "IO-228", 4, "vasiliy@gmail.com");
    Student student3 = new Student("Petro", 18, "IK-92", 1, "Petro@gmail.com");
    Student student4 = new Student("Vladislav", 20, "AK-01", 2, "Vladislav@gmail.com");
    Student student5 = new Student("Timur", 19, "FM-13", 3, "Timur@gmail.com");

    Student[] students = { student1, student2, student3, student4, student5 };

    System.out.print("Array without sorting: \n");
    for (Student student : Student.sortByAgeDescending(students)) {
      System.out.println(student);
    }

    System.out.println("\nSorted by age descending:");
    for (Student student : Student.sortByAgeDescending(students)) {
      System.out.printf("\tStudent %s - age %d\n", student.getName(), student.getAge());
    }

    System.out.println("\nSorted by group ascending:");
    for (Student student : Student.sortByGroupAscending(students)) {
      System.out.printf("\tStudent %s - group %s\n", student.getName(), student.getGroup());
    }
  }
}
