package tn.esprit.spring.entities;


import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@ToString
public class Subscription implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long iduser;

    @Enumerated(EnumType.STRING)
    SubscriptionType subscriptionType;

    Date expirationDate;

    float price;

    String description;

    @ManyToOne
    UserA user;

    @ManyToOne
    Offer offer;
}
