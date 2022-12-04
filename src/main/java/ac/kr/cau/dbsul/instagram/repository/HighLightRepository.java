package ac.kr.cau.dbsul.instagram.repository;

import ac.kr.cau.dbsul.instagram.entity.story.HighLightEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HighLightRepository extends JpaRepository<HighLightEntity, Long> {
}
