package ac.kr.cau.dbsul.instagram.entity.main;

import ac.kr.cau.dbsul.instagram.entity.BaseTimeEntity;
import ac.kr.cau.dbsul.instagram.entity.id.DMRoomPK;
import lombok.*;

import javax.persistence.*;

@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "DM_ATTACH")
@IdClass(DMRoomPK.class)
public class DmAttachEntity extends BaseTimeEntity {

	@Id
	@OneToOne()
	@JoinColumn(name = "message_id", referencedColumnName = "message_id")
	private DMMessageEntity dmMessage;

	@Column(name = "media_url")
	private String mediaURL;

}
