package in.co.stimuli.services;

import in.co.stimuli.dao.UserDAO;
import in.co.stimuli.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;
	
	@Override
	public User findByUsername(String userName) {
		return userDAO.findByUsername(userName);
	}

}
