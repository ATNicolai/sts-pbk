package ro.jademy.pbk.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND/*, reason="No contact"*/)
public class NoSuchContactException extends RuntimeException {

	private static final long serialVersionUID = -2800844257524498729L;

	public NoSuchContactException(String message) {
		super(message);
	}

	public NoSuchContactException(Throwable cause) {
		super(cause);
	}
	
	public NoSuchContactException(String message, Throwable cause) {
		super(message, cause);
	}
	
	

}
