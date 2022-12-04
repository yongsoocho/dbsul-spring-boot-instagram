package ac.kr.cau.dbsul.instagram.entity.main;

import ac.kr.cau.dbsul.instagram.entity.UserEntity;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "STORY")
public class StoryEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "story_id")
	private Long storyID;

	@Column(name = "media_url")
	private String mediaURL;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private UserEntity user;

}
