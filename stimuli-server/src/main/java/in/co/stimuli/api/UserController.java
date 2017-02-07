package in.co.stimuli.api;

import in.co.stimuli.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author aseem
 *
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/basic", method = RequestMethod.GET)
	public String getUser() {
		return userService.findByUsername("admin").getFirstname();
	}
	
}
