package tn.esprit.spring.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@ToString
public class Investisment implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idinvestisment;

    String adress;
    float price;
    float surface;
    boolean elevator;
    @Enumerated(EnumType.STRING)
    InvestementType investementType;
    @Enumerated(EnumType.STRING)
    FloorType floorType;

    @ManyToOne
    UserA user;
}
