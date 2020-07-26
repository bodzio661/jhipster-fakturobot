package com.sion0909.fakturobot.repository;

import com.sion0909.fakturobot.domain.Faktura;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the Faktura entity.
 */
@SuppressWarnings("unused")
@Repository
public interface FakturaRepository extends JpaRepository<Faktura, Long> {
}
