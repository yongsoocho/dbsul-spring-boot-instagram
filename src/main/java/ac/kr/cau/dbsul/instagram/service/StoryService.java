package ac.kr.cau.dbsul.instagram.service;

import ac.kr.cau.dbsul.instagram.dto.StoryDto;

import java.util.List;

public interface StoryService {
	List<StoryDto.Response> getStories();

	StoryDto.Response createStory(StoryDto.Request request);

	String getStoryFilters();

	String createHighlight();

	String storyAddToHighlight();

	String getStoryHighlight();

	String storyRead();

	String likeStory();
}
