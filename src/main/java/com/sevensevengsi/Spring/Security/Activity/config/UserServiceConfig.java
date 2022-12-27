package com.sevensevengsi.Spring.Security.Activity.config;

import com.sevensevengsi.Spring.Security.Activity.model.User;
import com.sevensevengsi.Spring.Security.Activity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceConfig implements UserDetailsService {

    @Autowired
    private UserRepository userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepo.findByUsername(username);

        if (user != null && user.isEnabled()) {
            return new UserConfig(user);
        }else{

        }

        throw new UsernameNotFoundException("user not available");
    }

}
