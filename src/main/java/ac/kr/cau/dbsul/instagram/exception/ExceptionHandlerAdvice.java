package ac.kr.cau.dbsul.instagram.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerAdvice {

	@ExceptionHandler(Exception.class)
	public String exceptionAll() {
		return "exception";
	}

}
