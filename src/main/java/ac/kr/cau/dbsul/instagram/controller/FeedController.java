package ac.kr.cau.dbsul.instagram.controller;

import ac.kr.cau.dbsul.instagram.service.FeedService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@NoArgsConstructor
@RequiredArgsConstructor
@RestController(value = "/feed")
public class FeedController {
	private FeedService feedService;
}
