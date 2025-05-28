import java.util.*;
public class ContructoreDemo{
  String empName;
  int empAge;
  
  public ContructoreDemo(String empName, int empAge)
  {
        this.empName=empName;
	this.empAge=empAge;
  }
  
  public void employeeInfo(){
	  
	    System.out.println("employee name:"+empName);
		System.out.println("employee Age:"+empAge);
	  
	 
  }
  
  public static void main(String args[]){
   
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter employee name");
   String empName=sc.nextLine();
   System.out.println("Enter employee age");
   int empAge=sc.nextInt();
   sc.close();
 ContructoreDemo cd=new ContructoreDemo(empName,empAge);
 cd.employeeInfo();
 
   
}
}