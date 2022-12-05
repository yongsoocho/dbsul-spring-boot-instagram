package ac.kr.cau.dbsul.instagram.repository;

import ac.kr.cau.dbsul.instagram.entity.id.UserStoryEntityPK;
import ac.kr.cau.dbsul.instagram.entity.story.StoryLikeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoryLikeRepository extends JpaRepository<StoryLikeEntity, UserStoryEntityPK> {
}
