package ac.kr.cau.dbsul.instagram.dto;

import ac.kr.cau.dbsul.instagram.entity.feed.FeedEntity;
import ac.kr.cau.dbsul.instagram.entity.feed.FeedLocationEntity;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class FeedLocationDto {

    @Data
    @Builder
    public static class Request {
        private Long feedId;
        private Double coordinateX;
        private Double coordinateY;
        private String alias;
    }

    @Data
    @Builder
    public static class Response {
        private Long feedId;
        private Double coordinateX;
        private Double coordinateY;
        private String alias;
        private LocalDateTime lastUpdated;

        public static Response fromEntity(FeedLocationEntity feedLocationEntity) {
            return Response.builder()
                    .feedId(feedLocationEntity.getFeed().getFeedId())
                    .coordinateX(feedLocationEntity.getCoordinateX())
                    .coordinateY(feedLocationEntity.getCoordinateY())
                    .alias(feedLocationEntity.getAlias())
                    .lastUpdated(feedLocationEntity.getUpdatedAt())
                    .build();
        }
    }
}
