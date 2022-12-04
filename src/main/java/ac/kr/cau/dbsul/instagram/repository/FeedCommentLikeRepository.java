package ac.kr.cau.dbsul.instagram.repository;

import ac.kr.cau.dbsul.instagram.entity.feed.FeedCommentLikeEntity;
import ac.kr.cau.dbsul.instagram.entity.id.FeedCommentLikeEntityPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedCommentLikeRepository extends JpaRepository<FeedCommentLikeEntity, FeedCommentLikeEntityPK> {

}
