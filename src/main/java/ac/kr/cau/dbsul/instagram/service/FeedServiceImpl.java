package ac.kr.cau.dbsul.instagram.service;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@NoArgsConstructor
@RequiredArgsConstructor
@Service
public class FeedServiceImpl implements FeedService {
	@Override
	public String getFeeds() {
		return "hello world";
	}
}
