package ac.kr.cau.dbsul.instagram.service;

import ac.kr.cau.dbsul.instagram.dto.*;

import java.util.List;

public interface FeedService {
	String getFeeds();

	String getFeedDetails();

	String createFeed();

	String searchFeedByTag();

	String getClippingFeed();

	String createFeedClipping();

	String getFeedLikes();

	void createFeedLike(FeedLikeDto.Request request);

	String getFeedComments();

	Long createComment(FeedCommentDto.Request request);

	void createCommentLike(FeedCommentLikeDto.Request request);

	Long createCommentReply(FeedCommentReplyDto.Request request);

	List<FeedDto.Response> getFeedsByUserFollows(int userId);
	List<FeedCommentDto.Response> getFeedCommentsByFeedId(int feedId);
}
