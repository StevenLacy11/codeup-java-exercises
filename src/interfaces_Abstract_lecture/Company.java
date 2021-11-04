package interfaces_Abstract_lecture;

public class Company { //company

	public static void main(String[] args) {
		Accountant accountBot = new Accountant("numberBot", "Accounting");
		Custodian cleanerBot = new Custodian("cleanerBot9000", "Maintenance");

//		System.out.println(accountBot.work());
//		System.out.println(accountBot.getName());
//		System.out.println(accountBot.getDepartment());
//
//		System.out.println(cleanerBot.work());
//		System.out.println(cleanerBot.getName());
//		System.out.println(cleanerBot.getDepartment());

		System.out.println(accountBot.getName() + " is reporting for business for the " + accountBot.getDepartment());
		

		System.out.println(cleanerBot.getName() + " is reporting for business for the " + cleanerBot.getDepartment());


	}


}
