package jpabook.jpashop.repository;

import jpabook.jpashop.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {
    //select m from Member m where. m.name =?
    //메소드 이름으로 쿼리생성
    List<Member> findByName(String name);
    //Jpa NamedQuery
   // List<Member> findByUsername(@Param("username") String username);

    //파라미터 바인딩
    @Query("select m from Member m where m.name = :username")
    List<Member> findByUsername(@Param("username") String username);
}


