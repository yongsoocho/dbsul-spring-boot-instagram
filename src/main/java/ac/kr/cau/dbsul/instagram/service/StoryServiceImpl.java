package ac.kr.cau.dbsul.instagram.service;

import ac.kr.cau.dbsul.instagram.dto.StoryDto;
import ac.kr.cau.dbsul.instagram.dto.StoryReadDto;
import ac.kr.cau.dbsul.instagram.entity.UserEntity;
import ac.kr.cau.dbsul.instagram.entity.story.StoryEntity;
import ac.kr.cau.dbsul.instagram.entity.story.StoryReadEntity;
import ac.kr.cau.dbsul.instagram.repository.StoryReadRepository;
import ac.kr.cau.dbsul.instagram.repository.StoryRepository;
import ac.kr.cau.dbsul.instagram.repository.UserRepository;
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

	@Override
	public List<StoryDto.Response> getStories() {
		List<StoryEntity> stories = storyRepository.getStories();

		return stories.stream()
				.map(StoryDto.Response::fromEntity)
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

		return StoryDto.Response.fromEntity(newStory);
	}

	@Override
	public String getStoryFilters() {
		return null;
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
	public String likeStory() {
		return null;
	}
}
