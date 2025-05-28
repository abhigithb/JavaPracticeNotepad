public class Trainer{

  String name = "Askah";
    int empID = 1234;

public static void main (String args[]){
 Trainer akash=new Trainer();
  akash.trainerInfo();
  akash.techSelenium();
  akash.techPlaywright();
  akash.techML();
  

}

public void techSelenium()
{
	System.out.println("Akash Trainer tech Selenium");

}

public void techPlaywright()
{
	System.out.println("Akash Trainer tech Playwright");

}

public void techML()
{
	System.out.println("Akash Trainer tech ML");

}


public void trainerInfo()
{
	System.out.println("Trainer name:"+name+" "+"employeeid:"+""+empID);

}




}