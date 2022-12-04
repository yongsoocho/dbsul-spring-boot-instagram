package ac.kr.cau.dbsul.instagram.service;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {
	@Override
	public String userLogin() {
		return "hello world";
	}

	@Override
	public String registerUser() {
		return null;
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
	public String getSetting() {
		return null;
	}

	@Override
	public String setMyMemo() {
		return null;
	}

	@Override
	public String blockUser() {
		return null;
	}

	@Override
	public String getChatRooms() {
		return null;
	}

	@Override
	public String getChatRoomMessages() {
		return null;
	}

	@Override
	public String sendMessage() {
		return null;
	}
}
