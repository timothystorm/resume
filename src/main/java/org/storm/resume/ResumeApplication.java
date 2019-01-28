package org.storm.resume;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.ApplicationPidFileWriter;

@SpringBootApplication
public class ResumeApplication {

    public static void main(String[] args) {
        SpringApplicationBuilder app = new SpringApplicationBuilder(ResumeApplication.class);
        app.web(WebApplicationType.REACTIVE);
        app.build().addListeners(new ApplicationPidFileWriter("./bin/shutdown.pid"));
        app.run(args);
    }
}

