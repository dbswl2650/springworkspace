package com.yedam.app.spring.xml;

public class NHCard implements Card {
	private User owner; // 소유자
	private int payAmount; // 결제 대금
	
	NHCard(User owner) {
		this.owner = owner;
		this.payAmount = 0;
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
		System.out.println("농협카드 부가기능");
	}

}
