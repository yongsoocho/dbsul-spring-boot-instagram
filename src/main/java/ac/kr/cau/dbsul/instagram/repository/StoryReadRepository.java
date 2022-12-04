package ac.kr.cau.dbsul.instagram.repository;

import ac.kr.cau.dbsul.instagram.entity.id.UserStoryEntityPK;
import ac.kr.cau.dbsul.instagram.entity.story.StoryReadEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoryReadRepository extends JpaRepository<StoryReadEntity, UserStoryEntityPK> {
}
