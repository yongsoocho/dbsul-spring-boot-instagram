package ac.kr.cau.dbsul.instagram.entity.feed;

import ac.kr.cau.dbsul.instagram.dto.FeedLocationDto;
import ac.kr.cau.dbsul.instagram.entity.BaseTimeEntity;
import ac.kr.cau.dbsul.instagram.entity.UserEntity;
import lombok.*;
import org.hibernate.annotations.LazyToOne;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "FEED")
public class FeedEntity extends BaseTimeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "feed_id")
	private Long feedId;

	@Column(name = "media_url")
	private String mediaURL;

	@Column
	private String content;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private UserEntity user;

	@OneToMany(mappedBy = "feed")
	private List<FeedTagEntity> tags = new ArrayList<>();

	@OneToMany(mappedBy = "feed")
	private List<FeedClippingEntity> clippings = new ArrayList<>();

	@OneToMany(mappedBy = "feed")
	private List<FeedLikeEntity> likes = new ArrayList<>();

	@OneToMany(mappedBy = "feed")
	private List<FeedReportEntity> reports = new ArrayList<>();

	@OneToMany(mappedBy = "feed")
	private List<FeedCommentEntity> comments = new ArrayList<>();

	@OneToMany(mappedBy = "feed")
	private List<FeedHashtagEntity> hashtags = new ArrayList<>();

	@OneToOne(mappedBy = "feed", fetch = FetchType.LAZY, optional = true)
	private FeedLocationEntity feedLocation;

}
