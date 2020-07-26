package com.sion0909.fakturobot.repository.search;

import com.sion0909.fakturobot.domain.Faktura;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


/**
 * Spring Data Elasticsearch repository for the {@link Faktura} entity.
 */
public interface FakturaSearchRepository extends ElasticsearchRepository<Faktura, Long> {
}
