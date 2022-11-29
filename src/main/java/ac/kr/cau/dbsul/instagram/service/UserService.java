package ac.kr.cau.dbsul.instagram.service;

public interface UserService {
//	유저 가져오기
	String getUsers();

//	유저 회원가입
	String registerUser();

	String getFollowerList();

	String getFollowingList();

	String getFollowRequestList();

}
