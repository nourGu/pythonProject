package tn.esprit.spring.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@ToString
public class UserA implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long iduser;

    String username;

    TypeUser typeUser;

    @OneToMany(mappedBy = "user")
    List<Article> articles;

    @OneToMany (mappedBy = "user")
    List<Visit> visits;

    @OneToMany (mappedBy = "user")
    List<Investisment> investisments;

    @OneToMany (mappedBy = "user")
    List<Forum> Forums;

    @OneToMany (mappedBy = "user")
    List<Subscription> subscriptions;
}
