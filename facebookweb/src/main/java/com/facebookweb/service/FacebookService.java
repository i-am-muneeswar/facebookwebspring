package com.facebookweb.service;

import com.facebookweb.dao.FacebookDAO;
import com.facebookweb.dao.FacebookDAOInterface;
import com.facebookweb.entity.FacebookUser;

public class FacebookService implements FacebookServiceInterface {

	public int createProfileService(FacebookUser fu) {
		
		FacebookDAOInterface fd = new FacebookDAO();
		return fd.createProfileDAO(fu);
		
	}

}
