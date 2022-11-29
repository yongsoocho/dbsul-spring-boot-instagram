package ac.kr.cau.dbsul.instagram.service;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@NoArgsConstructor
@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {
	@Override
	public String getUsers() {
		return "hello world";
	}

	@Override
	public String getFollowerList() {
		return null;
	}

	@Override
	public String getFollowingList() {
		return null;
	}

	@Override
	public String getFollowRequestList() {
		return null;
	}

	@Override
	public String registerUser() {
		return null;
	}
}
