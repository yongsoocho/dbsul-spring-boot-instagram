package ac.kr.cau.dbsul.instagram.controller;

import ac.kr.cau.dbsul.instagram.dto.StoryDto;
import ac.kr.cau.dbsul.instagram.dto.StoryLikeDto;
import ac.kr.cau.dbsul.instagram.dto.StoryReadDto;
import ac.kr.cau.dbsul.instagram.entity.story.StoryReadEntity;
import ac.kr.cau.dbsul.instagram.service.StoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController()
@RequestMapping(value = "/story")
public class StoryController {

	private final StoryService storyService;


	/**
	 * 팔로우하는 사람들의 스토리 불러오기
	 * 친한친구 (bestFriends)를 가장 앞으로 불러온다.
	 * @param userId 현재 사용자 id
	 * @return 스토리
	 */
	@GetMapping("/friends/{userId}")
	public List<StoryDto.Response> getStoriesByUserFollowing(@PathVariable("userId") Long userId) {
		List<StoryDto.Response> stories = storyService.getStoriesByUserFollowing(userId, true); // only best friends
		List<StoryDto.Response> storiesExcludeBestFriends = storyService.getStoriesByUserFollowing(userId, false);
		stories.addAll(storiesExcludeBestFriends);
		return stories;
	}

	// 스토리 생성
	@PostMapping()
	public StoryDto.Response createStory(@RequestBody() StoryDto.Request request) {
		return storyService.createStory(request);
	}

	// 스토리 하이라이트 생성
	@PostMapping("/highlight")
	public String createHighlight() {
		return storyService.createHighlight();
	}

	// 하이라이트에 스토리 추가
	@PostMapping("/highlight/{highlightId}")
	public String storyAddToHighlight(@PathVariable("highlightId") Long highlightId) {
		return storyService.storyAddToHighlight();
	}

	// 스토리 하이라이트 불러오기
	@GetMapping("/highlight/{highlightId}")
	public String getStoryHighlight(@PathVariable("highlightId") Long highlightId) {
		return storyService.getStoryHighlight();
	}

	// 스토리 읽기
	@PostMapping("/read")
	public StoryReadEntity storyRead(@RequestBody() StoryReadDto.Request request) {
		return storyService.storyRead(request);
	}

	// 스토리 좋아요 누르기
	@PostMapping("/like")
	public String likeStory(
			@RequestBody StoryLikeDto.Request request
			) {
		return storyService.likeStory(request);
	}
}
