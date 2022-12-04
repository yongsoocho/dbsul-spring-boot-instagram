package ac.kr.cau.dbsul.instagram.service;

import ac.kr.cau.dbsul.instagram.dto.*;
import ac.kr.cau.dbsul.instagram.entity.UserEntity;
import ac.kr.cau.dbsul.instagram.entity.feed.*;
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
	private final FeedLikeRepository feedLikeRepository;
	private final FeedCommentRepository feedCommentRepository;
	private final FeedCommentLikeRepository feedCommentLikeRepository;
	private final FeedCommentReplyRepository feedCommentReplyRepository;
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
	public void createFeedLike(FeedLikeDto.Request request) {
		UserEntity user = userRepository.findById(request.getUserId())
				.orElseThrow();
		FeedEntity feed = feedRepository.findById(request.getFeedId())
				.orElseThrow();

		FeedLikeEntity newLike = FeedLikeEntity
				.builder()
				.user(user)
				.feed(feed)
				.build();

		feedLikeRepository.save(newLike);
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
	public Long createCommentReply(FeedCommentReplyDto.Request request) {
		FeedCommentEntity comment = feedCommentRepository.findById(request.getFeedCommentId())
				.orElseThrow();
		UserEntity writer = userRepository.findById(request.getUserId())
				.orElseThrow();

		FeedCommentReplyEntity newReply = FeedCommentReplyEntity.builder()
				.feedComment(comment)
				.user(writer)
				.content(request.getContent())
				.build();

		feedCommentReplyRepository.save(newReply);
		return newReply.getFeedCommentReplyId();
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
