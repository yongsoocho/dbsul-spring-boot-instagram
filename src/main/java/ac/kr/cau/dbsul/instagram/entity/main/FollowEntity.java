package ac.kr.cau.dbsul.instagram.entity.main;

import ac.kr.cau.dbsul.instagram.entity.BaseTimeEntity;
import ac.kr.cau.dbsul.instagram.entity.UserEntity;
import ac.kr.cau.dbsul.instagram.entity.id.DMRoomPK;
import ac.kr.cau.dbsul.instagram.entity.id.FollowEntityPK;
import lombok.*;

import javax.persistence.*;

@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@IdClass(FollowEntityPK.class)
@Table(name = "FOLLOW")
public class FollowEntity extends BaseTimeEntity {

    @Id
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "follow_to_id", referencedColumnName = "user_id")
    private UserEntity followTo;

    @Id
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "followed_by_id", referencedColumnName = "user_id")
    private UserEntity followedBy;

    @Column()
    private boolean favorite;

    @Column(name = "best_friend")
    private boolean bestFriend;
}
