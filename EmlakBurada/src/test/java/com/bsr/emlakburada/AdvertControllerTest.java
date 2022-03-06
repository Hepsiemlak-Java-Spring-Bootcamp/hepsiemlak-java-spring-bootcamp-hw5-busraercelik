package com.bsr.emlakburada;


import com.bsr.emlakburada.client.request.AdvertRequest;
import com.bsr.emlakburada.controller.AdvertController;
import com.bsr.emlakburada.model.Advert;
import com.bsr.emlakburada.model.Person;
import com.bsr.emlakburada.model.Property;
import com.bsr.emlakburada.repository.AdvertRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.math.BigDecimal;

@WebMvcTest(AdvertController.class)
public class AdvertControllerTest {
    @Autowired
    MockMvc mockMvc;

    @MockBean
    AdvertRepository advertRepository;

    @MockBean
    Property property;

    @MockBean
    Person person;

    AdvertRequest advert = new AdvertRequest("new house", BigDecimal.valueOf(4500000), 30,
            false, true, true, property.getId(), person.getId());

    @Test
    void getAllAdvertTest_thenSuccess() {
        
    }

}
