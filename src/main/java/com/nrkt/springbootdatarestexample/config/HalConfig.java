package com.nrkt.springbootdatarestexample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.hateoas.LinkRelation;
import org.springframework.hateoas.mediatype.hal.HalConfiguration;

@Configuration
public class HalConfig {
    @Bean
    public HalConfiguration globalPolicy() {
        return new HalConfiguration()
                .withRenderSingleLinks(HalConfiguration.RenderSingleLinks.AS_SINGLE)
                .withRenderSingleLinksFor(LinkRelation.of("self"), HalConfiguration.RenderSingleLinks.AS_ARRAY);
    }
}
