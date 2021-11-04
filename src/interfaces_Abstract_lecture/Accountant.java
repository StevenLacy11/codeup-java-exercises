package interfaces_Abstract_lecture;

public class Accountant extends Employee {

	public Accountant(String name, String department) {
		super(name, department);
	}

	public String work() {
		return "TPS Reports have been drafted!";
	}

	@Override
	public String morningMeeting() {
		return "Accountants have morning meeting that beginning at 8:15AM and run until 8:45AM";
	}

	@Override
	public String lunchTime() {
		return "Accountants can have lunch at the desk if they want";
	}

	@Override
	public int dailyPay() {
		return 580;
	}
}
