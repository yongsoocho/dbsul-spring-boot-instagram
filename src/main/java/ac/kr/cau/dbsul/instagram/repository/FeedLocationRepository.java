package ac.kr.cau.dbsul.instagram.repository;

import ac.kr.cau.dbsul.instagram.entity.feed.FeedLocationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedLocationRepository extends JpaRepository<FeedLocationEntity, Long> {
}
