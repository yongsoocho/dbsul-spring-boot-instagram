package ac.kr.cau.dbsul.instagram.repository;

import ac.kr.cau.dbsul.instagram.entity.id.DMRoomPK;
import ac.kr.cau.dbsul.instagram.entity.main.DMMessageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DMRoomRepository extends JpaRepository<DMMessageEntity, DMRoomPK> {
}
