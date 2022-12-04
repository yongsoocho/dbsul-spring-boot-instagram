package ac.kr.cau.dbsul.instagram.dto;

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
    }
}
