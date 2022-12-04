package ac.kr.cau.dbsul.instagram.entity.id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FollowRequestEntityPK implements Serializable {
	private Long requestBy;
	private Long requestTo;
}
