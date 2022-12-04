package ac.kr.cau.dbsul.instagram.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
public class FeedDto {

    @Data
    @Builder
    public static class Request {
        private Long userId;
        private String mediaUrl;
        private String content;
    }

    @Data
    @Builder
    public static class Response {
        private Long feedId;
        private String mediaUrl;
        private String content;
        private FeedLocationDto.Response location;
        private List<HashtagDto> hashtags;
    }
}
