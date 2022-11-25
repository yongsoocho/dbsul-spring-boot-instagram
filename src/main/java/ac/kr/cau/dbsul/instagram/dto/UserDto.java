package ac.kr.cau.dbsul.instagram.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

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
		private String email;
		private String nickname;
		private String profileURL;
		private Date createdAt;
	}

}
