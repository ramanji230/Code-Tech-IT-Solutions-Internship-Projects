package customException;

//@SuppressWarnings("serial")
public class InvaildChoiceExpection extends RuntimeException{

	private String message;

	public  InvaildChoiceExpection(String message) {
		this.message=message;
		
	}
	
	@Override
	public String getMessage() {
		return message;
	}
	

}
