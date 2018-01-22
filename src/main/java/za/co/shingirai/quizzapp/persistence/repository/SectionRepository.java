package za.co.shingirai.quizzapp.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.shingirai.quizzapp.persistence.model.Section;

@Repository
public interface SectionRepository extends JpaRepository<Section, Long> {
}
