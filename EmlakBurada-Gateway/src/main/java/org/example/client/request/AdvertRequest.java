package org.example.client.request;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@AllArgsConstructor
@Data
public class AdvertRequest {
	private String title;
	private BigDecimal cost;
	private int duration;
	private boolean shouldHighlighted;
	private boolean isReviewed;
	private boolean isActive;
	private long propertyId;
	private long userId;
}
