package ac.kr.cau.dbsul.instagram.repository.main;

import ac.kr.cau.dbsul.instagram.entity.feed.FeedEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedRepository extends JpaRepository<FeedEntity, Long> {
}
