package com.yedam.app.spring.javabase;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // Spring 설정 => Spring이 내부 자동으로 실행
public class javaConfig {
	
	@Bean // 메서드를 실행한 결과를 Bean으로 등록
	public User user() {
		return new User();
	}
	
	@Bean                 // 매개변수를 선언 -> IoC컨테이너 안 Bean을 호출
	public NHCard nhCard(User user) {
		return new NHCard(user); // DI : 생성자 주입
	}
	
	@Bean
	public KBCard kbCard(User user) {
		KBCard kbCard = new KBCard();
		kbCard.setOwner(user); // DI : 새터 주입
		return kbCard;
	}
}
