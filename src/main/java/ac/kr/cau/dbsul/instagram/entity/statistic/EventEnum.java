package ac.kr.cau.dbsul.instagram.entity.statistic;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EventEnum {
	CLICK("CLICK"),
	SCROLL("SCROLL"),
	;

	private final String event;

}
