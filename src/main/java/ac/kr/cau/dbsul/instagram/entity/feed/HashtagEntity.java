package ac.kr.cau.dbsul.instagram.entity.feed;

import ac.kr.cau.dbsul.instagram.entity.BaseTimeEntity;
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
@Table(name = "HASHTAG")
public class HashtagEntity extends BaseTimeEntity {

    @Id
    @Column(name = "hashtag_name")
    private String hashtagName;

    @OneToMany(mappedBy = "hashtag")
    private List<FeedHashtagEntity> feedHashtags = new ArrayList<>();
}
