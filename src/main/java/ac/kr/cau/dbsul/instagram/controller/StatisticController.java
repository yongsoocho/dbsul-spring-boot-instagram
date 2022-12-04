package ac.kr.cau.dbsul.instagram.controller;

import ac.kr.cau.dbsul.instagram.service.StatisticService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController(value = "statistic")
public class StatisticController {

	private final StatisticService statisticService;

	// 피드 방문자 세션시간
	@GetMapping("/visit")
	public String getFeedVisitorInfo() {
		return statisticService.getFeedVisitorInfo();
	}

	// 피드 방문자 세션시간 생성
	@PostMapping("/visit")
	public String createFeedVisitorInfo() {
		return statisticService.createFeedVisitorInfo();
	}

	// 내 검색 기록
	@GetMapping("/history")
	public String getMySearchHistory() {
		return statisticService.getMySearchHistory();
	}

	// 내 검색 생성
	@PostMapping("/history")
	public String createMySearchHistory() {
		return statisticService.createMySearchHistory();
	}

	// 사람들이 내 피드 들어와서 하는 행동
	@GetMapping("/history")
	public String getVisitorEvent() {
		return statisticService.getVisitorEvent();
	}

	// 사람들이 내 피드 들어와서 하는 행동
	@PostMapping("/history")
	public String createVisitorEvent() {
		return statisticService.createVisitorEvent();
	}
}
