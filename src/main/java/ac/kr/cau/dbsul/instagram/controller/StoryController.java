package ac.kr.cau.dbsul.instagram.controller;

import ac.kr.cau.dbsul.instagram.service.StoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController()
@RequestMapping(value = "/story")
public class StoryController {

	private final StoryService storyService;

	// 스토리 불러오기
	@GetMapping()
	public String getStories() {
		return storyService.getStories();
	}

	// 스토리 생성
	@PostMapping()
	public String createStory() {
		return storyService.createStory();
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
	@GetMapping("/read")
	public String storyRead() {
		return storyService.storyRead();
	}

	// 스토리 좋아요 누르기
	@PostMapping("/like")
	public String likeStory() {
		return storyService.likeStory();
	}
}
