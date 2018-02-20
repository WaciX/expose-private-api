package com.macieju.exposeprivateapi;

import com.macieju.exposeprivateapi.config.MainConfiguration;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class MainApplication extends Application<MainConfiguration> {
    public static void main(String[] args) throws Exception {
        new MainApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<MainConfiguration> bootstrap) {
        // TODO
    }

    @Override
    public void run(MainConfiguration configuration, Environment environment) {
        // TODO
    }
}
