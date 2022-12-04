package ac.kr.cau.dbsul.instagram.entity.statistic;

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
@Table(name = "VISIT_LOCATION")
public class VisitLocationEntity extends BaseTimeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "visit_location_id")
	private Long visitLocationId;

	@ManyToOne()
	@JoinColumn(name = "user_id", referencedColumnName = "user_id")
	private UserEntity user;

	@ManyToOne()
	@JoinColumn(name = "feed_visit_id", referencedColumnName = "feed_visit_id")
	private FeedVisitEntity feedVisit;

	@Column(name = "coord_x")
	private Double coordX;

	@Column(name = "coord_y")
	private Double coordY;

}
