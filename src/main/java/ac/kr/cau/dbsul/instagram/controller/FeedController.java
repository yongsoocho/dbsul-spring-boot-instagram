package ac.kr.cau.dbsul.instagram.controller;

import ac.kr.cau.dbsul.instagram.dto.*;
import ac.kr.cau.dbsul.instagram.service.FeedService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController()
@RequestMapping(value = "/feed")
public class FeedController {

	private final FeedService feedService;

	@GetMapping("/{feedId}")
	public FeedDto.Response getFeed(
			@PathVariable("feedId") Long feedId) {
		return feedService.getFeedDetail(1l, feedId);
	}

	// 내가 팔로우하는 사람들의 피드목록
	@GetMapping("/user/{userId}")
	public List<FeedDto.Response> getFeeds(@PathVariable("userId") Long userId) {
		return feedService.getFeedsByUserFollows(userId);
	}

	// 피드 생성
	@PostMapping()
	public String createFeed(
			@RequestBody FeedDto.Request request
	) {
		return feedService.createFeed(request).toString();
	}

	// 피드 태그 검색
	@GetMapping("/search")
	public String searchFeedByTag() {
		return feedService.searchFeedByTag();
	}

	@GetMapping("/clipping")
	public String getClippingFeed() {
		return feedService.getClippingFeed();
	}

	// 피드 클리핑(저장)
	@PostMapping("/clipping")
	public String createFeedClipping() {
		return feedService.createFeedClipping();
	}

	// 피드 좋아요
	@PostMapping("/like")
	public String createFeedLike(
			@RequestBody FeedLikeDto.Request request
			) {
		feedService.createFeedLike(request);
		return "success";
	}

	// 댓글 목록
	@GetMapping("/comment/{feedId}")
	public List<FeedCommentDto.Response> getFeedComments(@PathVariable("feedId") Long feedId) {
		return feedService.getFeedCommentsByFeedId(feedId);
	}

	// 댓글 달기
	@PostMapping("/comment")
	public String createComment(
			@RequestBody FeedCommentDto.Request request) {
		return feedService.createComment(request).toString();
	}

	// 댓글에 좋아요
	@GetMapping("/comment/{commentId}")
	public String createCommentLike(
			@RequestBody FeedCommentLikeDto.Request request
			) {
		feedService.createCommentLike(request);
		return "success";
	}

	// 대댓글 달기
	@PostMapping("/comment/{commentId}")
	public String createCommentReply(
			@RequestBody FeedCommentReplyDto.Request request
			) {
		return feedService.createCommentReply(request).toString();
	}
}
