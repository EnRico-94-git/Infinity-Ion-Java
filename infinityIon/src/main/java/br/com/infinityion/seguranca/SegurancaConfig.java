package br.com.infinityion.seguranca;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SegurancaConfig {
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		
		http.
		authorizeHttpRequests((requests) -> requests. requestMatchers("/retornaFormCadTime",
				"/atualizar_jogador/{id}","/remover_jogador/{id}").hasAuthority("ROLE_ADMIN")
				.anyRequest().authenticated())
			.formLogin((form) -> form.loginPage("/login")
					.defaultSuccessUrl("/retorna_lista_jogadores").failureUrl("/login?falha=true").permitAll())
			.logout((logout) -> logout.logoutUrl("/logout").logoutSuccessUrl("/login?logout=true").permitAll())
			.exceptionHandling((exception) -> 
			exception.accessDeniedHandler(
					(request,response,AccessDeniedException) -> {response.sendRedirect("/acesso_negado");}));
		
		return http.build();
		
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
}

