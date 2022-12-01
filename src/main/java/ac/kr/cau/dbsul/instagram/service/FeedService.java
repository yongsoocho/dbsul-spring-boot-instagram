package ac.kr.cau.dbsul.instagram.service;

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
}
