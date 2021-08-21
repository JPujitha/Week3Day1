package week3.Day1.Assignmnet;

public class AxisBank extends BankInfo{
	public void deposit(){
		System.out.println("Overriden deposit method");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank obj=new AxisBank();
		obj.saving();
		obj.fixed();
		obj.deposit();

	}

}
