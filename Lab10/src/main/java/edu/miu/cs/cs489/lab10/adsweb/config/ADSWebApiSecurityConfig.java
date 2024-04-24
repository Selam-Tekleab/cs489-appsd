package edu.miu.cs.cs489.lab10.adsweb.config;
import edu.miu.cs.cs489.lab10.adsweb.filter.JWTAuthFilter;
import edu.miu.cs.cs489.lab10.adsweb.service.Implementation.AppUserDetailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class ADSWebApiSecurityConfig {
    private final AppUserDetailService appUserDetailService;
    private final JWTAuthFilter jwtAuthFilter;

    public ADSWebApiSecurityConfig(AppUserDetailService appUserDetailService,
                                   JWTAuthFilter jwtAuthFilter) {
        this.appUserDetailService = appUserDetailService;
        this.jwtAuthFilter = jwtAuthFilter;
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                .csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(
                        auth -> {
                            //      /adsweb/api/v1/patient
//                            auth.requestMatchers("/adsweb/api/v1/patient/**").permitAll()
//                                    .requestMatchers("/adsweb/api/v1/**").permitAll()
//                                    .requestMatchers("/adsweb/api/v1/patient/admin/**").hasRole("ADMIN")
                            auth.requestMatchers("/adsweb/api/v1/service/public/authenticate").permitAll()
                                    .requestMatchers("/adsweb/api/v1/**").authenticated()
                            ;
                        }
                )
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .authenticationProvider(authenticationProvider())
                .addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class)
                .build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
        authenticationProvider.setUserDetailsService(appUserDetailService);
        authenticationProvider.setPasswordEncoder(passwordEncoder());
        return authenticationProvider;
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
        return config.getAuthenticationManager();
    }
}
