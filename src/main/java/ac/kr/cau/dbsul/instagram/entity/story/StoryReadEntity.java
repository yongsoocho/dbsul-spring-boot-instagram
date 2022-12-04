package ac.kr.cau.dbsul.instagram.entity.story;

import ac.kr.cau.dbsul.instagram.entity.BaseTimeEntity;
import ac.kr.cau.dbsul.instagram.entity.UserEntity;
import ac.kr.cau.dbsul.instagram.entity.id.UserStoryEntityPK;
import lombok.*;

import javax.persistence.*;

@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "STORY_READ")
@IdClass(UserStoryEntityPK.class)
public class StoryReadEntity extends BaseTimeEntity {

	@Id
	@ManyToOne()
	@JoinColumn(name = "user_id", referencedColumnName = "user_id")
	private UserEntity user;

	@Id
	@ManyToOne()
	@JoinColumn(name = "user_id", referencedColumnName = "user_id")
	private StoryEntity story;

}
