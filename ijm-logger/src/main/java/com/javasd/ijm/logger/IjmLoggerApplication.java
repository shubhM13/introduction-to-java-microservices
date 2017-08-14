package com.javasd.ijm.logger;

import com.javasd.ijm.commons.utils.Utils;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IjmLoggerApplication
        implements CommandLineRunner
{

    public static void main(String[] args)
    {
        SpringApplication.run(IjmLoggerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception
    {
        Utils.consoleMsg( "Logger Microservice up and Running!");
    }
}