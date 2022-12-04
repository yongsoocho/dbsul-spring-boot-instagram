package ac.kr.cau.dbsul.instagram.service;

import ac.kr.cau.dbsul.instagram.dto.UserDto;

public interface UserService {
//	유저 가져오기
	String userLogin();

//	유저 회원가입
	UserDto.Response registerUser(UserDto.Request request);

	String getFollowerList();

	String getFollowingList();

	String getFollowRequestList();

	String getSetting();

	String setMyMemo();

	String blockUser();

	String getChatRooms();

	String getChatRoomMessages();

	String sendMessage();
}
