package org.example.client.response;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class Advert {
    private long id;
    private int adNo;
    private String description;
    private Property property;
    private String title;
    private Person postedBy;
    private String[] imageList = new String[5];
    private BigDecimal cost;
    private int duration;
    private boolean shouldHighlighted = false;
    private boolean isReviewed = false;
    private LocalDate postedDate;
    private boolean isActive;
}
