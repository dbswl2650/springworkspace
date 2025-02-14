package com.yedam.app.spring.xml;

public class KBCard implements Card {
	private User owner; // 소유자
	private int payAmount; // 결제대금
	
	public KBCard() {
		this.payAmount = 0;
	}
	
	public void setOwner(User owner) {
		this.owner = owner;
	}

	@Override
	public void showOwerInfo() {
		System.out.println(owner);
	}

	@Override
	public void payment(int pay) {
		System.out.printf("결제금액 : %d\n", pay);
		this.payAmount += pay;
		System.out.printf("결제예상일 : 15일 \n 결제대금 : %d\n", this.payAmount);
	}

	@Override
	public void addServices() {
		System.out.println("국민카드 부가기능");
	}

}
