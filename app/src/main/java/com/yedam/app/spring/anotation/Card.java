package com.yedam.app.spring.anotation;

public interface Card {
	// 소유자정보
	public void showOwerInfo();
	// 결제기능
	public void payment(int pay);
	// 부가기능
	public void addServices();
}
