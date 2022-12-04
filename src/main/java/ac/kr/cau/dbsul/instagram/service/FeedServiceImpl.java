package ac.kr.cau.dbsul.instagram.service;

import ac.kr.cau.dbsul.instagram.dto.FeedCommentDto;
import ac.kr.cau.dbsul.instagram.dto.FeedDto;
import ac.kr.cau.dbsul.instagram.repository.FeedCommentRepository;
import ac.kr.cau.dbsul.instagram.repository.FeedRepository;
import ac.kr.cau.dbsul.instagram.repository.FollowRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class FeedServiceImpl implements FeedService {

	private final FeedRepository feedRepository;
	private final FeedCommentRepository feedCommentRepository;
	private final FollowRepository followRepository;

	@Override
	public String getFeedDetails() {
		return null;
	}

	@Override
	public String createFeed() {
		return null;
	}

	@Override
	public String searchFeedByTag() {
		return null;
	}

	@Override
	public String getClippingFeed() {
		return null;
	}

	@Override
	public String createFeedClipping() {
		return null;
	}

	@Override
	public String getFeedLikes() {
		return null;
	}

	@Override
	public String createFeedLike() {
		return null;
	}

	@Override
	public String getFeedComments() {
		return null;
	}

	@Override
	public String createComment() {
		return null;
	}

	@Override
	public String createCommentLike() {
		return null;
	}

	@Override
	public String createCommentReply() {
		return null;
	}

	@Override
	public List<FeedDto.Response> getFeedsByUserFollows(int userId) {
		return feedRepository.findFeedsByUserFollowing(userId)
				.stream()
				.map(entity -> FeedDto.Response.fromEntity(entity))
				.collect(Collectors.toList());
	}

	@Override
	public List<FeedCommentDto.Response> getFeedCommentsByFeedId(int feedId) {
		return feedCommentRepository.findAllByFeed_FeedId(feedId)
				.stream()
				.map(FeedCommentDto.Response::fromEntity)
				.collect(Collectors.toList());
	}

	@Override
	public String getFeeds() {
		return "hello world";
	}
}
