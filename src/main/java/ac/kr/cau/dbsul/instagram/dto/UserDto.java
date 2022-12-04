package ac.kr.cau.dbsul.instagram.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
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
		private LocalDateTime lastUpdated;
	}

}
