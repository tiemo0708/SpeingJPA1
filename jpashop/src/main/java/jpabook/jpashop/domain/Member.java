package jpabook.jpashop.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
@NamedQuery(
        name = "Member.findByUsername",
        query="select m from Member m where m.name = :username")
public class Member {
    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;
    @NotEmpty
    private String name;

    @Embedded
    private Address address;

    @JsonIgnore
    @OneToMany(mappedBy="member")
    private List<Order> orders = new ArrayList<>();

}
