package ac.kr.cau.dbsul.instagram.entity.statistic;

import ac.kr.cau.dbsul.instagram.entity.UserEntity;
import ac.kr.cau.dbsul.instagram.entity.feed.FeedEntity;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "FEED_VISIT")
public class FeedVisitEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "feed_visit_id")
	private Long feedVisitId;

	@ManyToOne()
	@JoinColumn(name = "feed_id", referencedColumnName = "feed_id")
	private FeedEntity feed;

	@ManyToOne()
	@JoinColumn(name = "user_id", referencedColumnName = "user_id")
	private UserEntity user;

	@Column(name = "connected_at", updatable = false)
	private LocalDateTime connectedAt;

	@Column(name = "disconnected_at", updatable = false)
	private LocalDateTime disconnectedAt;

}
