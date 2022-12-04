package ac.kr.cau.dbsul.instagram.entity.feed;

import ac.kr.cau.dbsul.instagram.entity.BaseTimeEntity;
import ac.kr.cau.dbsul.instagram.entity.UserEntity;
import lombok.*;

import javax.persistence.*;

@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "FEED_COMMENT_REPLY")
public class FeedCommentReplyEntity extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "feed_comment_reply_id")
    private Long feedCommentReplyId;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private UserEntity user;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "feed_comment_id", referencedColumnName = "feed_comment_id")
    private FeedCommentEntity feedComment;

    @Column()
    private String content;
}
