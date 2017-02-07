package in.co.stimuli.services;

import in.co.stimuli.model.User;

import org.springframework.stereotype.Component;

/**
 * 
 * @author aseem
 *
 */
public interface UserService {
	
	User findByUsername(String userName);
	
}
