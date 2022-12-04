package ac.kr.cau.dbsul.instagram.repository;

import ac.kr.cau.dbsul.instagram.entity.feed.FeedCommentReplyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedCommentReplyRepository extends JpaRepository<FeedCommentReplyEntity, Long> {

}
