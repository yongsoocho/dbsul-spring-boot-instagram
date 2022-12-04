package ac.kr.cau.dbsul.instagram.entity.story;

import ac.kr.cau.dbsul.instagram.entity.id.HighLightStoryPK;
import lombok.*;

import javax.persistence.*;

@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "HIGHLIGHT_STORY")
@IdClass(HighLightStoryPK.class)
public class HighLightStoryEntity {

	@Id
	@ManyToOne()
	@JoinColumn(name = "highlight_id", referencedColumnName = "highlight_id")
	private HighLightEntity highlight;

	@Id
	@ManyToOne()
	@JoinColumn(name = "story_id", referencedColumnName = "story_id")
	private StoryEntity story;

}
