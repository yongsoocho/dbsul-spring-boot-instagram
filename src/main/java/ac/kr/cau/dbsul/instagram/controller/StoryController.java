package ac.kr.cau.dbsul.instagram.controller;

import ac.kr.cau.dbsul.instagram.service.StoryService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@NoArgsConstructor
@RequiredArgsConstructor
@RestController(value = "/story")
public class StoryController {
	private StoryService storyService;
}
