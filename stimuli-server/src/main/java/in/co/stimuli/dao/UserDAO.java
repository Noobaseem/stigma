package in.co.stimuli.dao;

import in.co.stimuli.model.User;

import org.springframework.stereotype.Service;

public interface UserDAO {
	User findByUsername(String userName);
}
