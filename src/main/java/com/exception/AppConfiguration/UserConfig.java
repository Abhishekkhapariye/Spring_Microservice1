//package com.exception.AppConfiguration;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//public class UserConfig {
//	
//	@Bean
//	public UserDetailsService userDetailsService() {
//		return new CustomUserDetails();
//		
//	}
//	@Bean
//    public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
//        return config.getAuthenticationManager();
//    }
//	@Bean
//    public AuthenticationProvider authenticationProvider(){
//        DaoAuthenticationProvider authenticationProvider=new DaoAuthenticationProvider();
//        authenticationProvider.setUserDetailsService(userDetailsService());
////        authenticationProvider.setPasswordEncoder(passwordEncoder());
//        return authenticationProvider;
//    }
////	 @Bean
////	    public PasswordEncoder passwordEncoder() {
////	        return new BCryptPasswordEncoder();
////	    }
//	 @Bean
//	    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
//	        httpSecurity.csrf().disable()
//	                .authorizeHttpRequests()
//	                .requestMatchers("/customer").permitAll()
//	                .anyRequest()
//	                .authenticated()
//	                .and()
//	                .authenticationProvider(authenticationProvider())
////	                .addFilterBefore(jwtauthfilter, UsernamePasswordAuthenticationFilter.class)
//	                 .httpBasic();
//	        return httpSecurity.build();
//	    }
//
//
//}
