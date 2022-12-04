package ac.kr.cau.dbsul.instagram.dto;

import ac.kr.cau.dbsul.instagram.entity.feed.HashtagEntity;
import lombok.Builder;
import lombok.Data;

@Data
public class HashtagDto {

    @Data
    @Builder
    public static class Request {
        private String hashtagName;
    }

    @Data
    @Builder
    public static class Response {
        private String hashtagName;

        public static Response fromEntity(HashtagEntity hashtagEntity) {
            return Response.builder()
                    .hashtagName(hashtagEntity.getHashtagName())
                    .build();
        }
    }
}
