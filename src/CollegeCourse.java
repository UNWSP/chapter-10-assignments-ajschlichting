public class CollegeCourse
{
	
  private String department;
  private int courseNumber;
  private int credit;
  private double courseFee;
  
  private final double CREDIT_HOUR_RATE = 120.00;
  
  
  
  
  public CollegeCourse(String dpt, int crsNum, int crd)
  {
      department = dpt.toUpperCase();
      courseNumber = crsNum;
      credit = crd;
      courseFee = credit * CREDIT_HOUR_RATE;
  }
  
  
  
  public String getdepartment()
  {
      return department;
  }
  public int getcourseNumber()
  {
      return courseNumber;
  }
  public int getCredits()
  {
      return credit;
  }
  public double getcourseFee()
  {
      return courseFee;
  }
  
  public void display()
  {
      System.out.println("Department: " + this.getdepartment());
      System.out.println("Course Number: " + this.getcourseNumber());
      System.out.println("Credit Hours: " + this.getCredits());
      System.out.println("Course Fee: $" + this.getcourseFee());
  }
}