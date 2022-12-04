package ac.kr.cau.dbsul.instagram.service;

import ac.kr.cau.dbsul.instagram.dto.StoryDto;
import ac.kr.cau.dbsul.instagram.dto.StoryReadDto;
import ac.kr.cau.dbsul.instagram.entity.story.StoryReadEntity;

import java.util.List;

public interface StoryService {
	List<StoryDto.Response> getStories();

	StoryDto.Response createStory(StoryDto.Request request);

	String getStoryFilters();

	String createHighlight();

	String storyAddToHighlight();

	String getStoryHighlight();

	StoryReadEntity storyRead(StoryReadDto.Request request);

	String likeStory();
}
