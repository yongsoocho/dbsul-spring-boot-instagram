package ac.kr.cau.dbsul.instagram.entity.story;

import ac.kr.cau.dbsul.instagram.entity.BaseTimeEntity;
import ac.kr.cau.dbsul.instagram.entity.UserEntity;
import lombok.*;

import javax.persistence.*;

@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "HIGHLIGHT")
public class HighLightEntity extends BaseTimeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "highlight_id")
	private Long highlightId;

	@Column()
	private String title;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private UserEntity user;

}
