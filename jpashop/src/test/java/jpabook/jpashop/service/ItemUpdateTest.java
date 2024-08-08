package jpabook.jpashop.service;

import jakarta.persistence.EntityManager;
import jpabook.jpashop.domain.item.Book;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ItemUpdateTest {

    @Autowired
    EntityManager em;

     @Test
        public void updateTest() throws Exception {
         Book book = em.find(Book.class, 1L);

         //TX
         book.setName("sdaas");

         //TX Commit (jpa가 변경분에 대하여 자동으로 업데이트 쿼리 )
         //더티 체킹(Dirty Checking), 변경 감지
     }

}
