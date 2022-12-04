package ac.kr.cau.dbsul.instagram.service;

import ac.kr.cau.dbsul.instagram.dto.UserDto;
import ac.kr.cau.dbsul.instagram.entity.UserEntity;
import ac.kr.cau.dbsul.instagram.repository.UserRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;

	@Override
	public String userLogin() {
		return "hello world";
	}

	@Override
	public UserDto.Response registerUser(UserDto.Request request) {
		UserEntity newUser = UserEntity.builder()
				.email(request.getEmail())
				.nickname(request.getNickname())
				.profileURL(request.getProfileURL())
				.build();

		userRepository.save(newUser);

		return UserDto.Response.fromEntity(newUser);
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
