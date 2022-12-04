package ac.kr.cau.dbsul.instagram.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
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
        private UserDto.Response writer;
        private String mediaUrl;
        private String content;
        private int likes;
        private int clippings;
        private FeedLocationDto.Response location;
        private List<UserDto.Response> taggedUsers;
        private List<HashtagDto.Response> hashtags;
        private LocalDateTime lastUpdated;
    }
}
