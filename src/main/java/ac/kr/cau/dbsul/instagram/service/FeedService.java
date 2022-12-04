package ac.kr.cau.dbsul.instagram.service;

import ac.kr.cau.dbsul.instagram.dto.FeedDto;

import java.util.List;

public interface FeedService {
	String getFeeds();

	String getFeedDetails();

	String createFeed();

	String searchFeedByTag();

	String getClippingFeed();

	String createFeedClipping();

	String getFeedLikes();

	String createFeedLike();

	String getFeedComments();

	String createComment();

	String createCommentLike();

	String createCommentReply();

	List<FeedDto> getFeedsByUserFollows(int userId);
}
