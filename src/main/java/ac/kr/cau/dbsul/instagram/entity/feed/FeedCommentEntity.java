package ac.kr.cau.dbsul.instagram.entity.feed;

import ac.kr.cau.dbsul.instagram.entity.BaseTimeEntity;
import ac.kr.cau.dbsul.instagram.entity.UserEntity;
import ac.kr.cau.dbsul.instagram.entity.id.FeedCommentEntityPK;
import lombok.*;

import javax.persistence.*;

@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@IdClass(FeedCommentEntityPK.class)
@Table(name = "FEED_COMMENT")
public class FeedCommentEntity extends BaseTimeEntity {

    @Id
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private UserEntity user;

    @Id
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "feed_id", referencedColumnName = "feed_id")
    private FeedEntity feed;

}
