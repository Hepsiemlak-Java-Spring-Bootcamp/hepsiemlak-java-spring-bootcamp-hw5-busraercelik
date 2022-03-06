package org.example.client;

import org.example.client.request.AdvertRequest;
import org.example.client.request.BannerRequest;
import org.example.client.response.AdvertResponseDTO;
import org.example.client.response.BannerResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "emlakburada-gateway", url = "http://localhost:8081")
public interface GatewayClient {
    @PostMapping(value = "/banner")
    BannerResponse saveBanner(@RequestBody BannerRequest request);

    @PostMapping(value = "/advert")
    ResponseEntity<AdvertResponseDTO> createAdvert(@RequestBody AdvertRequest request);
}
