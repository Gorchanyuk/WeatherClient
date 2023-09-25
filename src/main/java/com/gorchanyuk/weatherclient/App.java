package com.gorchanyuk.weatherclient;

import com.gorchanyuk.weatherclient.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class App implements CommandLineRunner {

    private final ClientService clientService;

    @Override
    public void run(String... args) throws Exception {
        clientService.getWeatherInCity();
    }
}
