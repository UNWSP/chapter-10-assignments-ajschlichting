public class LabCourse extends CollegeCourse
{
  private final double LAB_COURSE_FEE = 50.00;
  private double labCourseFee;
  public LabCourse(String dpt, int crsNum, int crd)
  {
      super(dpt, crsNum, crd);
      labCourseFee = super.getcourseFee() + LAB_COURSE_FEE;
  }
  
  public double getLabCourseFee()
  {
      return labCourseFee;
  }
  
  
  public void display()
  {  
      System.out.println("Department: " + super.getdepartment());
      System.out.println("Course Number: " + super.getcourseNumber());
      System.out.println("Credit Hours: " + super.getCredits());
      System.out.println("Course Fee: $" + this.getLabCourseFee());      
  }
}  
