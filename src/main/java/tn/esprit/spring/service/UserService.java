package tn.esprit.spring.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.repository.UserRepository;
import tn.esprit.spring.serviceInterface.IUserService;

@Service
@Slf4j
public class UserService implements IUserService {

	@Autowired
	UserRepository userRepositoryepository;


}