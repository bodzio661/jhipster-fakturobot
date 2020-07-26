package com.sion0909.fakturobot.repository.search;

import com.sion0909.fakturobot.domain.Kontrachent;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


/**
 * Spring Data Elasticsearch repository for the {@link Kontrachent} entity.
 */
public interface KontrachentSearchRepository extends ElasticsearchRepository<Kontrachent, Long> {
}
