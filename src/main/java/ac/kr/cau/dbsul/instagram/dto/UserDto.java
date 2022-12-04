package ac.kr.cau.dbsul.instagram.dto;

import ac.kr.cau.dbsul.instagram.entity.UserEntity;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserDto {

	@Data
	@Builder
	public static class Request {
		private String email;
		private String nickname;
		private String profileURL;
	}

	@Data
	@Builder
	public static class Response {
		private Long userId;
		private String nickname;
		private String profileURL;
		private LocalDateTime lastUpdated;

		public static UserDto.Response fromEntity(UserEntity userEntity) {
			return Response.builder()
					.userId(userEntity.getUserId())
					.nickname(userEntity.getNickname())
					.profileURL(userEntity.getProfileURL())
					.lastUpdated(userEntity.getUpdatedAt())
					.build();
		}
	}

}
