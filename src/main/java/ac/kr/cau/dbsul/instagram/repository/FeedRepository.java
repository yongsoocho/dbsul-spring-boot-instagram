package ac.kr.cau.dbsul.instagram.repository;

import ac.kr.cau.dbsul.instagram.entity.feed.FeedEntity;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FeedRepository extends JpaRepository<FeedEntity, Long> {

    @Query(value = "" +
            "SELECT f " +
            "FROM FeedEntity f " +
            "LEFT JOIN FollowEntity fol " +
            "ON f.user.userId = fol.followTo.userId " +
            "WHERE fol.followedBy.userId = :userId " +
            "ORDER BY f.updatedAt ")
    List<FeedEntity> findFeedsByUserFollowing(@Param("userId") Long userId);

    @Query(value = "" +
            "CALL GET_FEEDS_WITH_TRACKED(:userId, :feedId) ",
            nativeQuery = true)
    FeedEntity getFeedDetailByFollowingWithTracked(
            @Param("userId") Long userId,
            @Param("feedId") Long feedId
    );
}
