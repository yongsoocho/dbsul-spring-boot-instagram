package ac.kr.cau.dbsul.instagram.controller;

import ac.kr.cau.dbsul.instagram.service.StatisticService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@NoArgsConstructor
@RequiredArgsConstructor
@RestController(value = "/statistic")
public class StatisticController {
	private StatisticService statisticService;
}
