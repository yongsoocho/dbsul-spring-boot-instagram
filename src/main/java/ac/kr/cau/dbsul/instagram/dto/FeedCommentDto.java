package ac.kr.cau.dbsul.instagram.dto;

import ac.kr.cau.dbsul.instagram.entity.feed.FeedCommentEntity;
import ac.kr.cau.dbsul.instagram.entity.feed.FeedEntity;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class FeedCommentDto {

    @Data
    @Builder
    public static class Request {
        private Long userId;
        private Long feedId;
        private String content;
    }

    @Data
    @Builder
    public static class Response {
        private Long feedCommentId;
        private String content;
        private List<FeedCommentReplyDto.Response> replies;
        private LocalDateTime lastUpdated;

        public static Response fromEntity(FeedCommentEntity feedCommentEntity) {
            List<FeedCommentReplyDto.Response> replies =
                    feedCommentEntity.getReplies()
                            .stream()
                            .map(FeedCommentReplyDto.Response::fromEntity)
                            .collect(Collectors.toList());

            return Response.builder()
                    .feedCommentId(feedCommentEntity.getFeedCommentId())
                    .content(feedCommentEntity.getFeed().getContent())
                    .replies(replies)
                    .lastUpdated(feedCommentEntity.getUpdatedAt())
                    .build();
        }
    }
}
