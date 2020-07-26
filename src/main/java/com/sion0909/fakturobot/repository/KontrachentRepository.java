package com.sion0909.fakturobot.repository;

import com.sion0909.fakturobot.domain.Kontrachent;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the Kontrachent entity.
 */
@SuppressWarnings("unused")
@Repository
public interface KontrachentRepository extends JpaRepository<Kontrachent, Long> {
}
