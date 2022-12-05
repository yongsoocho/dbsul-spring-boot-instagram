package ac.kr.cau.dbsul.instagram.dto;

import ac.kr.cau.dbsul.instagram.entity.UserEntity;
import ac.kr.cau.dbsul.instagram.entity.story.StoryEntity;
import lombok.Builder;
import lombok.Data;

@Data
public class StoryDto {

	@Data
	@Builder
	public static class Request {
		private String mediaURL;
		private Long userId;
	}

	@Data
	@Builder
	public static class Response {
		private Long storyId;
		private String mediaURL;
		private String nickname;
		private String profileURL;
		private FilterDto.Response filter;

		public static Response fromEntity(StoryEntity storyEntity) {
			FilterDto.Response filter = FilterDto.Response
					.fromEntity(storyEntity.getFilter());

			return Response.builder()
					.storyId(storyEntity.getStoryId())
					.mediaURL(storyEntity.getMediaURL())
					.nickname(storyEntity.getUser().getNickname())
					.profileURL(storyEntity.getUser().getProfileURL())
					.filter(filter)
					.build();
		}
	}
}
