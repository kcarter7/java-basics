package inheritance;

public final class ChangePassword {
	String passCode;
	
	public ChangePassword() {
		passCode = "abc@123";
	}
	
	public void encryptPassword() {
		passCode = "xyz@123";
	}
}
