package ro.jademy.pbk.exception;

public class PkbError {
	
	int statusCode;
	String msg;
	
	
	
	public PkbError() {
		super();
	}



	public int getStatusCode() {
		return statusCode;
	}



	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}



	public String getMsg() {
		return msg;
	}



	public void setMsg(String msg) {
		this.msg = msg;
	}




	
	
	

}
