package ac.kr.cau.dbsul.instagram.dto;

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
    }
}
