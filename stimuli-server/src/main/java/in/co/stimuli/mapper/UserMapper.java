package in.co.stimuli.mapper;

import in.co.stimuli.model.Authority;
import in.co.stimuli.model.User;

import java.util.List;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserMapper {
	
	@Select("SELECT id as id, user_name as username, password as password, first_name as firstname, last_name as lastname, email as email, "
			+ "enabled as enabled, last_password_reset_date as lastpasswordresetdate FROM users where user_name = #{userName}")
	@Results(value = {
			@Result(column = "id", property = "authorities", javaType = List.class, many = @Many(select = "getUserAuthorities"))
	})
	User findByUsername(String userName);
	
	@Select("SELECT id, name FROM authority WHERE id IN (SELECT DISTINCT authority_id FROM user_authority WHERE user_id=#{userId})")
	List<Authority> getUserAuthorities(Integer userId);
}
