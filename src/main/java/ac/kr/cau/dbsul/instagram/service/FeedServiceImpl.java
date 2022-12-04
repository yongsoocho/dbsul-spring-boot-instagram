package ac.kr.cau.dbsul.instagram.service;

import ac.kr.cau.dbsul.instagram.dto.FeedCommentDto;
import ac.kr.cau.dbsul.instagram.dto.FeedCommentLikeDto;
import ac.kr.cau.dbsul.instagram.dto.FeedDto;
import ac.kr.cau.dbsul.instagram.entity.UserEntity;
import ac.kr.cau.dbsul.instagram.entity.feed.FeedCommentEntity;
import ac.kr.cau.dbsul.instagram.entity.feed.FeedCommentLikeEntity;
import ac.kr.cau.dbsul.instagram.entity.feed.FeedEntity;
import ac.kr.cau.dbsul.instagram.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class FeedServiceImpl implements FeedService {

	private final UserRepository userRepository;
	private final FeedRepository feedRepository;
	private final FeedCommentRepository feedCommentRepository;
	private final FeedCommentLikeRepository feedCommentLikeRepository;
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
	public Long createComment(FeedCommentDto.Request request) {
		UserEntity writer = userRepository.findById(request.getUserId())
				.orElseThrow();
		FeedEntity feed = feedRepository.findById(request.getFeedId())
				.orElseThrow();

		FeedCommentEntity feedComment = FeedCommentEntity.builder()
				.user(writer)
				.feed(feed)
				.build();

		feedCommentRepository.save(feedComment);
		return feedComment.getFeedCommentId();
	}

	@Override
	public void createCommentLike(FeedCommentLikeDto.Request request) {
		UserEntity user = userRepository.findById(request.getUserId())
				.orElseThrow();
		FeedCommentEntity comment = feedCommentRepository.findById(request.getFeedCommentId())
				.orElseThrow();

		FeedCommentLikeEntity newLike = FeedCommentLikeEntity.builder()
				.user(user)
				.feedComment(comment)
				.build();

		feedCommentLikeRepository.save(newLike);
	}

	@Override
	public String createCommentReply() {
		return null;
	}

	@Override
	public List<FeedDto.Response> getFeedsByUserFollows(int userId) {
		return feedRepository.findFeedsByUserFollowing(userId)
				.stream()
				.map(FeedDto.Response::fromEntity)
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
