package com.javasa.rest;

import com.javasa.rest.constants.AppConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author: ismael.sadeghi
 * @email: ismaelsadeghi111@gmail.com
 * @date: 09/04/2018
 */
@SpringBootApplication
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) throws UnknownHostException {
        SpringApplication app = new SpringApplication(Application.class);
        addDefultProfile(app);
        Environment env = app.run(args).getEnvironment();
        log.info("\n----------------------------------------------------------\n\t" +
                        "Application '{}' is running! Access URLs:\n\t" +
                        "Local: \t\thttp://localhost:{}\n\t" +
                        "External: \thttp://{}:{}\n----------------------------------------------------------",
                env.getProperty("spring.application.name"),
                env.getProperty("server.port"),
                InetAddress.getLocalHost().getHostAddress(),
                env.getProperty("server.port"));
    }

    public static void addDefultProfile(SpringApplication application) {
        Map<String, Object> defProfile = new HashMap<String, Object>();

        defProfile.put(AppConstants.SPRING_PROFILE_DEFAULT, AppConstants.SPRING_PROFILE_DEVELOPMENT);
        application.setDefaultProperties(defProfile);
    }
}