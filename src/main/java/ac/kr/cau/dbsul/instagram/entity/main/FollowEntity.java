package ac.kr.cau.dbsul.instagram.entity.main;

import ac.kr.cau.dbsul.instagram.entity.BaseTimeEntity;
import ac.kr.cau.dbsul.instagram.entity.UserEntity;
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
    @JoinColumn(name = "user_id")
    private UserEntity followedBy;

    @Id
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private UserEntity followTo;

    @Column()
    private boolean favorite;

    @Column(name = "best_friend")
    private boolean bestFriend;
}
