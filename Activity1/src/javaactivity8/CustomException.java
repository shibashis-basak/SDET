package javaactivity8;

public class CustomException extends Exception {
	
	private String message;

	public CustomException(String message) {
		super();
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}

	
	

}
