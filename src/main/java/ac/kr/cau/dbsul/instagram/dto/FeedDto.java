package ac.kr.cau.dbsul.instagram.dto;

import ac.kr.cau.dbsul.instagram.entity.feed.FeedEntity;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

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

        public static Response fromEntity(FeedEntity feedEntity) {
            UserDto.Response writer = UserDto.Response.fromEntity(
                    feedEntity.getUser()
            );
            FeedLocationDto.Response location = FeedLocationDto.Response.fromEntity(
                    feedEntity.getFeedLocation()
            );
            List<UserDto.Response> taggedUsers = feedEntity.getTags()
                    .stream()
                    .map(feedTagEntity ->
                            UserDto.Response.fromEntity(feedTagEntity.getUser()))
                    .collect(Collectors.toList());
            List<HashtagDto.Response> hashtags = feedEntity.getHashtags()
                    .stream()
                    .map(feedHashtagEntity ->
                            HashtagDto.Response.fromEntity(feedHashtagEntity.getHashtag()))
                    .collect(Collectors.toList());

            int likes = feedEntity.getLikes().size();
            int clippings = feedEntity.getClippings().size();

            return Response.builder()
                    .feedId(feedEntity.getFeedId())
                    .writer(writer)
                    .mediaUrl(feedEntity.getMediaURL())
                    .content(feedEntity.getContent())
                    .likes(likes)
                    .clippings(clippings)
                    .location(location)
                    .taggedUsers(taggedUsers)
                    .hashtags(hashtags)
                    .lastUpdated(feedEntity.getUpdatedAt())
                    .build();
        }
    }
}
