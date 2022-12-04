package ac.kr.cau.dbsul.instagram.service;

import ac.kr.cau.dbsul.instagram.dto.UserDto;
import ac.kr.cau.dbsul.instagram.entity.UserEntity;
import ac.kr.cau.dbsul.instagram.entity.feed.FeedCommentEntity;
import ac.kr.cau.dbsul.instagram.entity.feed.FeedEntity;
import ac.kr.cau.dbsul.instagram.entity.story.StoryEntity;
import ac.kr.cau.dbsul.instagram.repository.*;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import net.datafaker.Faker;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;
	private final FeedRepository feedRepository;
	private final StoryRepository storyReadRepository;
	private final CommentRepository commentRepository;

	@Override
	public String userLogin() {

		Faker faker = new Faker();

		// 유저 10명 생성 각각 피드, 스토리 20개 씩
		for(int i = 0; i < 10; i++) {
			UserEntity newUser = UserEntity.builder()
					.email(faker.address().mailBox())
					.nickname(faker.funnyName().name())
					.profileURL(faker.aws().albARN())
					.build();

			userRepository.save(newUser);

			for(int j = 0; j < 20; j++) {
				FeedEntity newFeed = FeedEntity.builder()
						.mediaURL(faker.aws().albARN())
						.content(faker.funnyName().name())
						.user(newUser)
						.build();

				feedRepository.save(newFeed);

				StoryEntity newStory = StoryEntity.builder()
						.mediaURL(faker.aws().albARN())
						.user(newUser)
						.build();

				storyReadRepository.save(newStory);
			}
		}

		// 유저 25명 각각 댓글 1개씩
		for(int k = 1; k < 11; k++) {
			UserEntity exUser = userRepository.findById(Long.valueOf(k)).orElseThrow();

			for(int a = 1; a < 21; a++) {
				FeedEntity exFeed = feedRepository.findById(Long.valueOf(a)).orElseThrow();

				FeedCommentEntity newComment = FeedCommentEntity.builder()
						.user(exUser)
						.feed(exFeed)
						.content(faker.book().title())
						.build();
			}

		}


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
