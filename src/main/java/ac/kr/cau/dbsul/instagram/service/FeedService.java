package ac.kr.cau.dbsul.instagram.service;

import ac.kr.cau.dbsul.instagram.dto.FeedCommentDto;
import ac.kr.cau.dbsul.instagram.dto.FeedCommentLikeDto;
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

	Long createComment(FeedCommentDto.Request request);

	void createCommentLike(FeedCommentLikeDto.Request request);

	String createCommentReply();

	List<FeedDto.Response> getFeedsByUserFollows(int userId);
	List<FeedCommentDto.Response> getFeedCommentsByFeedId(int feedId);
}
