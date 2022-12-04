package ac.kr.cau.dbsul.instagram.repository.main;

import ac.kr.cau.dbsul.instagram.entity.id.FollowEntityPK;
import ac.kr.cau.dbsul.instagram.entity.main.FollowEntity;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FollowRepository extends JpaRepository<FollowEntity, FollowEntityPK> {

    @EntityGraph(attributePaths = {"followedBy"})
    List<FollowEntity> findAllByFollowedBy_UserId(int userId);
}
