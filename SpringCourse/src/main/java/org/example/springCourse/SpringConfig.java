package org.example.springCourse;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.example.springCourse")
@PropertySource("classpath:musicBean.properties")
public class SpringConfig {
}
