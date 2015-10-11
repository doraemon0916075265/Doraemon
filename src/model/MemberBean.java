package model;

import java.util.Arrays;

public class MemberBean {

	private String custid;
	private byte[] password;
	private String email;

	public String getCustid() {
		return custid;
	}

	public void setCustid(String custid) {
		this.custid = custid;
	}

	public byte[] getPassword() {
		return password;
	}

	public void setPassword(byte[] password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "MemberBean [custid=" + custid + ", password=" + Arrays.toString(password) + ", email=" + email + "]";
	}

}
