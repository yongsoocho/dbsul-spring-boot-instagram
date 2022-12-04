package ac.kr.cau.dbsul.instagram.entity;

import ac.kr.cau.dbsul.instagram.entity.feed.FeedEntity;
import ac.kr.cau.dbsul.instagram.entity.main.FollowEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "USER")
public class UserEntity extends BaseTimeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Long userId;

	@Column(length = 50, nullable = false)
	private String email;

	@Column(length = 20, nullable = false, unique = true)
	private String nickname;

	@Column(name = "profile_url")
	private String profileURL;

	@OneToMany(mappedBy = "followTo")
	private List<FollowEntity> followings = new ArrayList<>();

	@OneToMany(mappedBy = "followedBy")
	private List<FollowEntity> followers = new ArrayList<>();

	@OneToMany(mappedBy = "user")
	private List<FeedEntity> feeds = new ArrayList<>();

}
