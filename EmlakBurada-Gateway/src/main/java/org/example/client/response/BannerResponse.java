package org.example.client.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.example.client.request.AddressRequest;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BannerResponse {

	private int advertNo;
	private String phone;
	private int total;
	private AddressRequest address;

}
