package Member;

import java.io.Serializable;
import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberVO implements Serializable {
	private static final long serialVersionUID = 5783936267253111186L;
	
	private String user_id;
	private String user_name;
	private String user_pwd;
	private String user_phone;
	private String user_email;
	private String user_sex;
	private String user_birth;
	private String user_condition;

    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MemberVO other = (MemberVO) obj;
		return Objects.equals(user_id, other.user_id);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(user_id);
	}
}
