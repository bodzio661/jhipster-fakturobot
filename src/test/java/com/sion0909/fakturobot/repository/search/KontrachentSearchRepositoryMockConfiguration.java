package com.sion0909.fakturobot.repository.search;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Configuration;

/**
 * Configure a Mock version of {@link KontrachentSearchRepository} to test the
 * application without starting Elasticsearch.
 */
@Configuration
public class KontrachentSearchRepositoryMockConfiguration {

    @MockBean
    private KontrachentSearchRepository mockKontrachentSearchRepository;

}
