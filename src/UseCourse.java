import java.util.Scanner;
public class UseCourse
{
  public static void main(String[] args)
  {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter the course department: ");
      String dept = keyboard.nextLine();
      System.out.print("Enter the course number: ");
      int number = keyboard.nextInt();
      System.out.print("Enter the course credit hours: ");
      int hours = keyboard.nextInt();
      if(dept.equalsIgnoreCase("BIO") || dept.equalsIgnoreCase("CHM")|| dept.equalsIgnoreCase("CIS") || dept.equalsIgnoreCase("PHY"))
      {
          LabCourse labCourse = new LabCourse(dept, number, hours);
          labCourse.display();
      }
      else
      {
          CollegeCourse CollegeCourse = new CollegeCourse(dept, number, hours);
          CollegeCourse.display();
      }
      keyboard.close();
  }
}