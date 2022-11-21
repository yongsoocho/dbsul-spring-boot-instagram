package ac.kr.cau.dbsul.instagram.entity.main;

import lombok.*;

import javax.persistence.*;

@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "FEED")
public class FeedEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "feed_id")
	private Long userId;

	@Column(length = 50)
	private String content;

	@Column()
	private String profileURL;

}
