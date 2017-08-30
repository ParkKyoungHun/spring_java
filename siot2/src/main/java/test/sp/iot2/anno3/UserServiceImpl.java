package test.sp.iot2.anno3;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

	public String login(User user) {
		if("test".equals(user.getId())){
			if("test".equals(user.getPwd())){
				return user.getName() +"님 로그인에 성공 하셨습니다.";
			}
			return "비밀번호가 틀렸습니다.";
		}
		return "없는 아이디 입니다.";
	}

}
