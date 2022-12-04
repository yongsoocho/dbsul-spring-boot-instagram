package ac.kr.cau.dbsul.instagram.service;

public interface StoryService {
	String getStories();

	String createStory();

	String getStoryFilters();

	String createHighlight();

	String storyAddToHighlight();

	String getStoryHighlight();

	String storyRead();

	String likeStory();
}
