package ac.kr.cau.dbsul.instagram.entity.main;

import ac.kr.cau.dbsul.instagram.entity.BaseTimeEntity;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "DM_ATTACH")
public class DmAttachEntity extends BaseTimeEntity implements Serializable {

	@Id
	@OneToOne()
	@JoinColumn(name = "message_id", referencedColumnName = "message_id")
	private DMMessageEntity dmMessage;

	@Column(name = "media_url")
	private String mediaURL;

}
