package com.example.todaylook.component;

import com.maxmind.geoip2.DatabaseReader;
import com.maxmind.geoip2.exception.GeoIp2Exception;
import com.maxmind.geoip2.model.CityResponse;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;

@Component
public class GeoComponent {
    private DatabaseReader reader;

    public GeoComponent() throws IOException {
        ClassPathResource geoDB = new ClassPathResource("GeoLite2-City.mmdb");
        File dbFile = new File(geoDB.getURI());
        reader = new DatabaseReader.Builder(dbFile).build();
    }

public CityResponse city(InetAddress ipAddress) {
        CityResponse response = null;

        try {
            response = reader.city(ipAddress);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (GeoIp2Exception e) {
            e.printStackTrace();
        }
        return response;
    }
}
