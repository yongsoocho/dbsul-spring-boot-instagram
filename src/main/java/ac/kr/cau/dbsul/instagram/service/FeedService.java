package ac.kr.cau.dbsul.instagram.service;

import ac.kr.cau.dbsul.instagram.dto.*;

import java.util.List;

public interface FeedService {

	Long createFeed(FeedDto.Request request);

	String searchFeedByTag();

	String getClippingFeed();

	String createFeedClipping();

	void createFeedLike(FeedLikeDto.Request request);

	Long createComment(FeedCommentDto.Request request);

	void createCommentLike(FeedCommentLikeDto.Request request);

	Long createCommentReply(FeedCommentReplyDto.Request request);

	List<FeedDto.Response> getFeedsByUserFollows(Long userId);
	List<FeedCommentDto.Response> getFeedCommentsByFeedId(Long feedId);
}
