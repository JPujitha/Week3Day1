package week3.Day1.org.student;

import week3.Day1.Assignment.org.department.Department;

public class Student extends Department{
	public void studentName() {
   	 System.out.println("********Student Package********");
   	 System.out.println("studentName method from student class");
    }
	  public void studentDept() {
    	  System.out.println("studentDept method from Student class");
      }
     public void studentId() {
    	 System.out.println("studentId method from student class");
     }

   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj1=new Student();
		obj1.collegeName();
		obj1.collegeCode();
		obj1.collegeRank();
		obj1.deptName();
		obj1.studentName();
		obj1.studentDept();
		obj1.studentId();
	    

	}

}
