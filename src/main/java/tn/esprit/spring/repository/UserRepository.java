package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.entities.Examen;
import tn.esprit.spring.entities.UserA;


@Repository
public interface UserRepository extends JpaRepository<UserA, Long> {


}
