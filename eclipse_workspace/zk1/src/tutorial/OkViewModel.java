package tutorial;

import org.zkoss.bind.annotation.*;
import pckUtil.*;

public class OkViewModel {
	
	private String Username;
	private String Password;
	private String Result;

	public String getResult() {
		return Result;
	}

	public void setResult(String result) {
		Result = result;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String Username() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	// public void OKs(){
	// this.setResult(this.getUsername());
	// }

	@Command ("OkResult")
	@NotifyChange("result")
	public void OkResult() {
		util1 u1 = new util1();
		String resU1 = u1.concatString(this.getUsername());
		
		this.setResult("data username is " + resU1);
		
	}
}
