package ac.kr.cau.dbsul.instagram.entity.story;

import ac.kr.cau.dbsul.instagram.entity.BaseTimeEntity;
import ac.kr.cau.dbsul.instagram.entity.id.StoryFilterPK;
import lombok.*;

import javax.persistence.*;

@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "STORY_FILTER")
@IdClass(StoryFilterPK.class)
public class StoryFilterEntity extends BaseTimeEntity {

	@Id
	@ManyToOne()
	@JoinColumn(name = "story_id", referencedColumnName = "story_id")
	private StoryEntity story;

	@Id
	@ManyToOne()
	@JoinColumn(name = "filter_id", referencedColumnName = "filter_id")
	private FilterEntity filter;

}
