package ac.kr.cau.dbsul.instagram.controller;

import ac.kr.cau.dbsul.instagram.service.UserService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@NoArgsConstructor
@RequiredArgsConstructor
@RestController(value = "/user")
public class UserController {
	private UserService userService;

	// 로그인
	@GetMapping()
	public String userLogin() {
		return userService.userLogin();
	}

	// 회원가입
	@PostMapping()
	public String registerUser() {
		return userService.registerUser();
	}

	// 팔로워 불러오기
	@GetMapping("/follower")
	public String getFollowerList() {
		return userService.getFollowerList();
	}

	// 팔로잉 불러오기
	@GetMapping("/following")
	public String getFollowingList() {
		return userService.getFollowingList();
	}

	// 팔로잉 요청 불러오기
	@GetMapping("/follower/list")
	public String getFollowRequestList() {
		return userService.getFollowRequestList();
	}

	// 설정 불러오기
	@GetMapping("/setting")
	public String getSetting() {
		return userService.getSetting();
	}

	// 메모 설정
	@PostMapping("/memo")
	public String setMyMemo() {
		return userService.setMyMemo();
	}

	// 유저 차단
	@PostMapping("/block")
	public String blockUser() {
		return userService.blockUser();
	}

	// 채팅방 목록 불러오기
	@GetMapping("/dm/room")
	public String getChatRooms() {
		return userService.getChatRooms();
	}

	// 채팅방 메세지 불러오기
	@GetMapping("/dm/{roomId}")
	public String getChatRoomMessages(@PathVariable("roomId") Long roomId) {
		return userService.getChatRoomMessages();
	}

	// 메세지 보내기
	@PostMapping("/dm/{roomId}")
	public String sendMessage(@PathVariable("roomId") Long roomId) {
		return userService.sendMessage();
	}

}