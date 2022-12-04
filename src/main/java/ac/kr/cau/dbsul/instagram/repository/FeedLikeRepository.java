package ac.kr.cau.dbsul.instagram.repository;

import ac.kr.cau.dbsul.instagram.entity.feed.FeedLikeEntity;
import ac.kr.cau.dbsul.instagram.entity.id.FeedLikeEntityPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedLikeRepository extends JpaRepository<FeedLikeEntity, FeedLikeEntityPK> {
}
