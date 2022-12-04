package ac.kr.cau.dbsul.instagram.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class FeedCommentDto {

    @Data
    @Builder
    public static class Request {
        private Long userId;
        private String content;
    }

    @Data
    @Builder
    public static class Response {
        private Long feedCommentId;
        private String content;
        private List<FeedCommentReplyDto.Response> replies;
        private LocalDateTime lastUpdated;
    }
}
