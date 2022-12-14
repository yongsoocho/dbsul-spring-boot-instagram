package ac.kr.cau.dbsul.instagram.entity.main;

import ac.kr.cau.dbsul.instagram.entity.BaseTimeEntity;
import ac.kr.cau.dbsul.instagram.entity.UserEntity;
import ac.kr.cau.dbsul.instagram.entity.id.DMRoomPK;
import lombok.*;

import javax.persistence.*;

@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "DM_ROOM_ENTITY")
@IdClass(DMRoomPK.class)
public class DMRoomEntity extends BaseTimeEntity {

	@Id
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "dm_to_id", referencedColumnName = "user_id")
	private UserEntity dmTo;

	@Id
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "dm_by_id", referencedColumnName = "user_id")
	private UserEntity dmBy;

	@Column(length = 255, name = "last_message")
	private String lastMessage;

}
