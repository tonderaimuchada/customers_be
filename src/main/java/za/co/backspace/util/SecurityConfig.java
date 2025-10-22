package za.co.backspace.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

/**
 * @author Tonderai Muchada on 22/10/2025 - 6:14 AM
 */
@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {
}
