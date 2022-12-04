package ac.kr.cau.dbsul.instagram.entity.main;

import ac.kr.cau.dbsul.instagram.entity.BaseTimeEntity;
import ac.kr.cau.dbsul.instagram.entity.UserEntity;
import ac.kr.cau.dbsul.instagram.entity.id.BlockEntityPK;
import lombok.*;

import javax.persistence.*;

@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@IdClass(BlockEntityPK.class)
@Table(name = "BLOCK")
public class BlockEntity extends BaseTimeEntity {

    @Id
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "blocked_by_id", referencedColumnName = "user_id")
    private UserEntity blockedBy;

    @Id
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "block_to_id", referencedColumnName = "user_id")
    private UserEntity blockTo;
}
