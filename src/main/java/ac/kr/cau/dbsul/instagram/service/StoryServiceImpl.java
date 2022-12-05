package ac.kr.cau.dbsul.instagram.service;

import ac.kr.cau.dbsul.instagram.dto.StoryDto;
import ac.kr.cau.dbsul.instagram.dto.StoryLikeDto;
import ac.kr.cau.dbsul.instagram.dto.StoryReadDto;
import ac.kr.cau.dbsul.instagram.entity.UserEntity;
import ac.kr.cau.dbsul.instagram.entity.story.StoryEntity;
import ac.kr.cau.dbsul.instagram.entity.story.StoryLikeEntity;
import ac.kr.cau.dbsul.instagram.entity.story.StoryReadEntity;
import ac.kr.cau.dbsul.instagram.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class StoryServiceImpl implements StoryService {

	private final StoryRepository storyRepository;
	private final UserRepository userRepository;
	private final StoryReadRepository storyReadRepository;
	private final StoryLikeRepository storyLikeRepository;
	private final FilterRepository filterRepository;

	@Override
	public List<StoryDto.Response> getStoriesByUserFollowing(Long userId, boolean bestFriends) {
		return storyRepository.findStoriesByUserFollowing(userId, bestFriends)
				.stream()
				.map(entity -> StoryDto.Response.fromEntity(entity, bestFriends))
				.collect(Collectors.toList());
	}


	@Override
	public StoryDto.Response createStory(StoryDto.Request request) {
		UserEntity exUser = userRepository
				.findById(request.getUserId())
				.orElseThrow();

		StoryEntity newStory = StoryEntity.builder()
				.mediaURL(request.getMediaURL())
				.user(exUser)
				.build();

		storyRepository.save(newStory);

		return StoryDto.Response.fromEntity(newStory, null);
	}

	@Override
	public String createHighlight() {
		return null;
	}

	@Override
	public String storyAddToHighlight() {
		return null;
	}

	@Override
	public String getStoryHighlight() {
		return null;
	}

	@Override
	public StoryReadEntity storyRead(StoryReadDto.Request request) {
		StoryEntity exStory = storyRepository.findById(request.getStoryId()).orElseThrow();

		UserEntity exUser = userRepository.findById(request.getUserId()).orElseThrow();

		StoryReadEntity newStoryRead = StoryReadEntity.builder()
				.story(exStory)
				.user(exUser)
				.build();

		storyReadRepository.save(newStoryRead);

		return newStoryRead;
	}

	@Override
	public String likeStory(StoryLikeDto.Request request) {
		UserEntity user = userRepository.findById(request.getUserId())
				.orElseThrow();
		StoryEntity story = storyRepository.findById(request.getStoryId())
				.orElseThrow();

		StoryLikeEntity newLike = StoryLikeEntity.builder()
				.user(user)
				.story(story)
				.build();

		storyLikeRepository.save(newLike);

		return "success";
	}
}
