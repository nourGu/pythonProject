package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.entities.Announcement;
import tn.esprit.spring.entities.Visit;


@Repository
public interface AnnoucementRepository extends JpaRepository<Announcement, Long> {


}
