package tech.tystnad.joblog.secruity;

import java.util.List;
import java.util.stream.Collectors;

import tech.tystnad.joblog.user.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

public final class JwtUserFactory {

	private JwtUserFactory() {
	}

	public static JwtUser create(User user) {
		return new JwtUser(user.getId(), user.getUsername(), user.getPassword(), user.getEmail(),
				mapToGrantedAuthorities(user.getRoles()), user.getLastPasswordResetDate());
	}

	private static List<GrantedAuthority> mapToGrantedAuthorities(List<String> authorities) {
		return authorities.stream().map(e -> new SimpleGrantedAuthority(e)).collect(Collectors.toList());
	}
}
