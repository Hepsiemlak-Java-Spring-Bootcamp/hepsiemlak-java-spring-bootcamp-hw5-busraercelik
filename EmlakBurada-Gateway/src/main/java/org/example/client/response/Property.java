package org.example.client.response;

import lombok.Data;

@Data
public class Property {
    private long id;
    private int cost;
    private float grossSquareMeter;
    private boolean isForSale;
    private Location location;
}
