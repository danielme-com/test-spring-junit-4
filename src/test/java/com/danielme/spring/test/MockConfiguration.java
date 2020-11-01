package com.danielme.spring.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@Profile(MockConfiguration.MOCK_PROFILE)
@Configuration
class MockConfiguration {

    static final String MOCK_PROFILE = "mockConfiguration";

    @Bean
    @Primary
    SubDependency subDependencyMocked() {
        SubDependency mock = mock(SubDependency.class);
        when(mock.getClassName()).thenReturn("mocked");
        return mock;
    }

}
