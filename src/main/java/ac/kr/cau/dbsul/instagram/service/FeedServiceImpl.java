package ac.kr.cau.dbsul.instagram.service;

import ac.kr.cau.dbsul.instagram.dto.FeedDto;
import ac.kr.cau.dbsul.instagram.repository.FeedRepository;
import ac.kr.cau.dbsul.instagram.repository.main.FollowRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class FeedServiceImpl implements FeedService {

	private final FeedRepository feedRepository;
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
	public List<FeedDto> getFeedsByUserFollows(int userId) {

//		followRepository.findAllByFollowedBy_UserId(userId)
//				.
		return List.of();

	}

	@Override
	public String getFeeds() {
		return "hello world";
	}
}
