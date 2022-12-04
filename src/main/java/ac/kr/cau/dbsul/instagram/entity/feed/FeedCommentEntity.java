package ac.kr.cau.dbsul.instagram.entity.feed;

import ac.kr.cau.dbsul.instagram.entity.BaseTimeEntity;
import ac.kr.cau.dbsul.instagram.entity.UserEntity;
import ac.kr.cau.dbsul.instagram.entity.id.FeedCommentEntityPK;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "FEED_COMMENT")
public class FeedCommentEntity extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "feed_comment_id")
    private Long feedCommentId;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private UserEntity user;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "feed_id", referencedColumnName = "feed_id")
    private FeedEntity feed;

    @Column()
    private String content;

    @OneToMany(mappedBy = "feedComment")
    private List<FeedCommentLikeEntity> likes = new ArrayList<>();

    @OneToMany(mappedBy = "feedComment")
    private List<FeedCommentReplyEntity> replies = new ArrayList<>();

}
