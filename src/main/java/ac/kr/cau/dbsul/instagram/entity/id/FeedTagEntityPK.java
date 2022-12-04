package ac.kr.cau.dbsul.instagram.entity.id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FeedTagEntityPK implements Serializable {

    private Long user;
    private Long feed;
}
