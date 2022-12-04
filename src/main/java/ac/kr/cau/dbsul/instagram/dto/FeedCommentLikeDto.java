package ac.kr.cau.dbsul.instagram.dto;

import lombok.Builder;
import lombok.Data;

@Data
public class FeedCommentLikeDto {

    @Data
    @Builder
    public static class Request {
        private Long userId;
        private Long feedCommentId;
    }
}
