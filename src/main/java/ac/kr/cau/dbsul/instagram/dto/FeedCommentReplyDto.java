package ac.kr.cau.dbsul.instagram.dto;

import lombok.Builder;
import lombok.Data;

@Data
public class FeedCommentReplyDto {

    @Data
    @Builder
    public static class Request {
        private Long userId;
        private Long feedCommentId;
        private String content;
    }

    @Data
    @Builder
    public static class Response {
        private Long feedCommentReplyId;
        private String content;
    }
}
