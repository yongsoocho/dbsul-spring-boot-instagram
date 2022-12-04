package ac.kr.cau.dbsul.instagram.repository;

import ac.kr.cau.dbsul.instagram.entity.feed.FeedEntity;
import ac.kr.cau.dbsul.instagram.entity.story.StoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StoryRepository extends JpaRepository<StoryEntity, Long> {

	@Query(value = "" +
			"SELECT * " +
			"FROM story AS s" +
			"", nativeQuery = true)
	List<StoryEntity> getStories();

}
