package ac.kr.cau.dbsul.instagram.entity.feed;

import ac.kr.cau.dbsul.instagram.entity.BaseTimeEntity;
import lombok.*;

import javax.persistence.*;

@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "FEED_LOCATION")
public class FeedLocationEntity extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "feed_location_id")
    private Long feedLocationId;

    @Column
    private String alias;

    @Column(name = "coordinate_x")
    private float coordinateX;

    @Column(name = "coordinate_y")
    private float coordinateY;

    @OneToOne
    @JoinColumn(name = "feed_id")
    private FeedEntity feed;
}
