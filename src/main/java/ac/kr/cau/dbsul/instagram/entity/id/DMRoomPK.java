package ac.kr.cau.dbsul.instagram.entity.id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DMRoomPK implements Serializable {
	private Long dmTo;
	private Long dmBy;
}
