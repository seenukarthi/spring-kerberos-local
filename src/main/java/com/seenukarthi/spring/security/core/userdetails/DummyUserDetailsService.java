package com.seenukarthi.spring.security.core.userdetails;
 
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
 
public class DummyUserDetailsService implements UserDetailsService {
 
	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		return new User(username, username, AuthorityUtils.createAuthorityList("ROLE_USER"));
	}
 
}