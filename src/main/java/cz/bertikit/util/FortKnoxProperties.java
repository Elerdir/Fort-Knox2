package cz.bertikit.util;

import lombok.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Author ladik
 * @create 20.05.2021 21:11
 */
@Getter
@Component
@PropertySource("classpath:fort-knox-${spring.profiles.active}.properties")
public class FortKnoxProperties {

    private static Logger logger = LoggerFactory.getLogger(FortKnoxProperties.class);

    @Value("@project.version@")
    private String version;

    @Value("@buildTimestampLabel@")
    private String buildTimestampLabel;
}
