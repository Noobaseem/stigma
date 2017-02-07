package in.co.stimuli.dao;

import in.co.stimuli.mapper.UserMapper;
import in.co.stimuli.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDAOImpl implements UserDAO{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User findByUsername(String userName) {
		return userMapper.findByUsername(userName);
	}
	
}
