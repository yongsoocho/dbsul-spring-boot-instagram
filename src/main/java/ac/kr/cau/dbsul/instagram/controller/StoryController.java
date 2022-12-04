package ac.kr.cau.dbsul.instagram.controller;

import ac.kr.cau.dbsul.instagram.dto.StoryDto;
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

	// 스토리 불러오기
	@GetMapping()
	public List<StoryDto.Response> getStories() {
		return storyService.getStories();
	}

	// 스토리 생성
	@PostMapping()
	public StoryDto.Response createStory(@RequestBody() StoryDto.Request request) {
		return storyService.createStory(request);
	}

	// 스토리 필터 불러오기
	@GetMapping("/filter")
	public String getStoryFilters() {
		return storyService.getStoryFilters();
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
	public String likeStory() {
		return storyService.likeStory();
	}
}
