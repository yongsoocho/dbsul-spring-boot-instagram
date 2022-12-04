package ac.kr.cau.dbsul.instagram.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@ToString
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

}
