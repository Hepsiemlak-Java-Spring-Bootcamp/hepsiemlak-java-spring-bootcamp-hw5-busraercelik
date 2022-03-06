package org.example.client.response;

import lombok.Data;

@Data
public class Location {
    private long id;
    private String city;
    private String district;
    private String country;
}
