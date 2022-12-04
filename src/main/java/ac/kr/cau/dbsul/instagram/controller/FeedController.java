package ac.kr.cau.dbsul.instagram.controller;

import ac.kr.cau.dbsul.instagram.dto.FeedCommentDto;
import ac.kr.cau.dbsul.instagram.service.FeedService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController()
@RequestMapping(value = "/feed")
public class FeedController {

	private final FeedService feedService;

	// 피드 가져오기
	@GetMapping()
	public String getFeeds() {
		return feedService.getFeeds();
	}

	// 피드 상세 가져오기
	@GetMapping("/{feedId}")
	public String getFeedDetails(@PathVariable("feedId") Long feedId) {
		return feedService.getFeedDetails();
	}

	// 피드 생성
	@PostMapping()
	public String createFeed() {
		return feedService.createFeed();
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

	// 피드 좋아요 목록
	@GetMapping("/like/{feedId}")
	public String getFeedLikes(@PathVariable("feedId") Long feeId) {
		return feedService.getFeedLikes();
	}

	// 피드 좋아요
	@PostMapping("/like")
	public String createFeedLike() {
		return feedService.createFeedLike();
	}

	// 댓글 목록
	@GetMapping("/comment/{feedId}")
	public String getFeedComments(@PathVariable("feedId") Long feeId) {
		return feedService.getFeedComments();
	}

	// 댓글 달기
	@PostMapping("/comment")
	public String createComment(
			@RequestBody FeedCommentDto.Request request) {
		return feedService.createComment(request)
				.toString();
	}

	// 댓글에 좋아요
	@GetMapping("/comment/{commentId}")
	public String createCommentLike() {
		return feedService.createCommentLike();
	}

	// 대댓글 달기
	@PostMapping("/comment/{commentId}")
	public String createCommentReply() {
		return feedService.createCommentReply();
	}
}
