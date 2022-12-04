package ac.kr.cau.dbsul.instagram.repository;

import ac.kr.cau.dbsul.instagram.entity.feed.FeedCommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<FeedCommentEntity, Long> {
}
