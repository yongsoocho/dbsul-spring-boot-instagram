package ac.kr.cau.dbsul.instagram.dto;

import ac.kr.cau.dbsul.instagram.entity.UserEntity;
import ac.kr.cau.dbsul.instagram.entity.story.StoryReadEntity;
import lombok.Builder;
import lombok.Data;

@Data
public class StoryReadDto {

	@Data
	@Builder
	public static class Request {
		private Long userId;
		private Long storyId;
	}

	@Data
	@Builder
	public static class Response {
		private Long userId;
		private Long storyId;

		public static Response fromEntity(StoryReadEntity storyReadEntity) {
			return Response.builder()
					.userId(storyReadEntity.getUser().getUserId())
					.storyId(storyReadEntity.getStory().getStoryId())
					.build();
		}
	}

}
