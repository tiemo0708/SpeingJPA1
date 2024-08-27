package jpabook.jpashop;

import com.fasterxml.jackson.datatype.hibernate6.Hibernate6Module;  // 변경된 부분
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpashopApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpashopApplication.class, args);
	}

	@Bean
	Hibernate6Module hibernate6Module() {  // 변경된 부분
		Hibernate6Module hibernate6Module = new Hibernate6Module();
		// 강제 지연 로딩 설정
//		hibernate6Module.configure(Hibernate6Module.Feature.FORCE_LAZY_LOADING, true);  // 엔티티 외부 노출
		return hibernate6Module;
	}
}
