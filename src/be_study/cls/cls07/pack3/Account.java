package be_study.cls.cls07.pack3;

public class Account {
	//! 아래 변수 선언 해야 소스메뉴 먹힘
	private String name;
	private String bank;
	private double rate;
	private int balance;
	
	//! [source] > [Generate getters and setters] > select 4개 다 check 하면 아래 쭈르륵 만들어줌..
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
