package com.sion0909.fakturobot.service.impl;

import com.sion0909.fakturobot.service.FakturaService;
import com.sion0909.fakturobot.domain.Faktura;
import com.sion0909.fakturobot.repository.FakturaRepository;
import com.sion0909.fakturobot.repository.search.FakturaSearchRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static org.elasticsearch.index.query.QueryBuilders.*;

/**
 * Service Implementation for managing {@link Faktura}.
 */
@Service
@Transactional
public class FakturaServiceImpl implements FakturaService {

    private final Logger log = LoggerFactory.getLogger(FakturaServiceImpl.class);

    private final FakturaRepository fakturaRepository;

    private final FakturaSearchRepository fakturaSearchRepository;

    public FakturaServiceImpl(FakturaRepository fakturaRepository, FakturaSearchRepository fakturaSearchRepository) {
        this.fakturaRepository = fakturaRepository;
        this.fakturaSearchRepository = fakturaSearchRepository;
    }

    @Override
    public Faktura save(Faktura faktura) {
        log.debug("Request to save Faktura : {}", faktura);
        Faktura result = fakturaRepository.save(faktura);
        fakturaSearchRepository.save(result);
        return result;
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Faktura> findAll(Pageable pageable) {
        log.debug("Request to get all Fakturas");
        return fakturaRepository.findAll(pageable);
    }


    @Override
    @Transactional(readOnly = true)
    public Optional<Faktura> findOne(Long id) {
        log.debug("Request to get Faktura : {}", id);
        return fakturaRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete Faktura : {}", id);
        fakturaRepository.deleteById(id);
        fakturaSearchRepository.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Faktura> search(String query, Pageable pageable) {
        log.debug("Request to search for a page of Fakturas for query {}", query);
        return fakturaSearchRepository.search(queryStringQuery(query), pageable);    }
}
