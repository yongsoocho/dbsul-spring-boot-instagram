package ac.kr.cau.dbsul.instagram.repository;

import ac.kr.cau.dbsul.instagram.entity.feed.FeedEntity;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FeedRepository extends JpaRepository<FeedEntity, Long> {

}
