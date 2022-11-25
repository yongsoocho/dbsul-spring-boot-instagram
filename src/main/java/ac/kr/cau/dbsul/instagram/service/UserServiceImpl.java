package ac.kr.cau.dbsul.instagram.service;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	@Override
	public String getUser() {
		return "hello world";
	}
}
