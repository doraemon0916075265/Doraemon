package service;

import model.MemberBean;

public interface MemberService {
	public abstract MemberBean selectAll(String custid);
}
