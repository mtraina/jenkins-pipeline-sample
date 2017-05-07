package com.mtraina;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

public class HelloControllerTest {
    private final HelloController helloController = new HelloController();
    private final MockMvc mockMvc = MockMvcBuilders.standaloneSetup(helloController).build();

    @Test
    public void should() throws Exception {
        final MvcResult mvcResult = mockMvc.perform(get("/greeting")).andReturn();
        assertThat(mvcResult.getResponse().getContentAsString()).isEqualTo("{\"text\":\"hello world\"}");
    }
}
