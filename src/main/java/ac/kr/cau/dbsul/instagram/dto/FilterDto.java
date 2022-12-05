package ac.kr.cau.dbsul.instagram.dto;

import ac.kr.cau.dbsul.instagram.entity.story.FilterEntity;
import lombok.Builder;
import lombok.Data;

@Data
public class FilterDto {

    @Data
    @Builder
    public static class Request {
        private Long userId;
        private String medialUrl;
        private String name;
    }

    @Data
    @Builder
    public static class Response {
        private Long filterId;
        private String mediaUrl;
        private String name;

        public static Response fromEntity(FilterEntity entity) {
            return Response.builder()
                    .filterId(entity.getFilterId())
                    .mediaUrl(entity.getMediaURL())
                    .name(entity.getName())
                    .build();
        }
    }
}
