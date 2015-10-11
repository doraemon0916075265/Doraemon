package modeldao;

import model.MemberBean;

public interface MemberDAO {
	public abstract MemberBean select(String custid);
}
