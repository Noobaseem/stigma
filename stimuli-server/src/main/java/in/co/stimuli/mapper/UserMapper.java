package in.co.stimuli.mapper;

import in.co.stimuli.model.User;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserMapper {
	
	@Select("SELECT id as id, user_name as username, password as password, first_name as firstname, last_name as lastname, email as email, "
			+ "enabled as enabled, last_password_reset_date as lastpasswordresetdate FROM users where user_name = #{userName}")
	User findByUsername(String userName);
}
