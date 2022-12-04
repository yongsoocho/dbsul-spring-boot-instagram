package ac.kr.cau.dbsul.instagram.service;

public interface StatisticService {
	String getFeedVisitorInfo();

	String createFeedVisitorInfo();

	String getMySearchHistory();

	String createMySearchHistory();

	String getVisitorEvent();

	String createVisitorEvent();
}
