package ac.kr.cau.dbsul.instagram.controller;

import ac.kr.cau.dbsul.instagram.service.UserService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@NoArgsConstructor
@RequiredArgsConstructor
@RestController(value = "/user")
public class UserController {
	private UserService userService;

	@GetMapping()
	public String getUsers() {
		return userService.getUsers();
	}

	@PostMapping()
	public String registerUser() { return userService.registerUser(); }

}
