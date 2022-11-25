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
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Long userId;

	@Column(length = 50, nullable = false)
	private String email;

	@Column(length = 20, nullable = false, unique = true)
	private String nickname;

	@Column()
	private String profileURL;

	@Column(name = "created_at")
	private Date createdAt;
}
