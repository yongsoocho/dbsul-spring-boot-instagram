package ac.kr.cau.dbsul.instagram.repository;

import ac.kr.cau.dbsul.instagram.entity.feed.FeedEntity;
import ac.kr.cau.dbsul.instagram.entity.story.FilterEntity;
import ac.kr.cau.dbsul.instagram.entity.story.StoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StoryRepository extends JpaRepository<StoryEntity, Long> {

	@Query(value = "" +
			"SELECT * " +
			"FROM story AS s" +
			"", nativeQuery = true)
	List<StoryEntity> getStories();

	@Query(value = "" +
			"SELECT s " +
			"FROM StoryEntity s " +
			"LEFT JOIN FollowEntity  fol " +
			"ON s.user.userId = fol.followTo.userId " +
			"WHERE fol.followedBy.userId = :userId " +
			"AND (:isBestFriends = fol.bestFriend) " +
			"ORDER BY s.createdAt ")
	List<StoryEntity> findStoriesByUserFollowing(
			@Param("userId") Long userId,
			@Param("isBestFriends") boolean isBestFriends);

}
