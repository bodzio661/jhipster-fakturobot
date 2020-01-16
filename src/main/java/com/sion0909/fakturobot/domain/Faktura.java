package com.sion0909.fakturobot.domain;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.*;

import org.springframework.data.elasticsearch.annotations.FieldType;
import java.io.Serializable;
import java.time.LocalDate;

import com.sion0909.fakturobot.domain.enumeration.Type;

import com.sion0909.fakturobot.domain.enumeration.Status;

import com.sion0909.fakturobot.domain.enumeration.Zaleglosc;

/**
 * A Faktura.
 */
@Entity
@Table(name = "faktura")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@org.springframework.data.elasticsearch.annotations.Document(indexName = "faktura")
public class Faktura implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @org.springframework.data.elasticsearch.annotations.Field(type = FieldType.Keyword)
    private Long id;

    @NotNull
    @Column(name = "numer_faktury", nullable = false)
    private String numerFaktury;

    @NotNull
    @Column(name = "kwota_faktury", nullable = false)
    private Float kwotaFaktury;

    @NotNull
    @Column(name = "data_faktury", nullable = false)
    private LocalDate dataFaktury;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "typ_faktury", nullable = false)
    private Type typFaktury;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "status_faktury", nullable = false)
    private Status statusFaktury;

    @Enumerated(EnumType.STRING)
    @Column(name = "zaleglosc_faktury")
    private Zaleglosc zalegloscFaktury;

    @ManyToOne
    @JsonIgnoreProperties("fakturas")
    private Kontrachent kontrachent;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumerFaktury() {
        return numerFaktury;
    }

    public Faktura numerFaktury(String numerFaktury) {
        this.numerFaktury = numerFaktury;
        return this;
    }

    public void setNumerFaktury(String numerFaktury) {
        this.numerFaktury = numerFaktury;
    }

    public Float getKwotaFaktury() {
        return kwotaFaktury;
    }

    public Faktura kwotaFaktury(Float kwotaFaktury) {
        this.kwotaFaktury = kwotaFaktury;
        return this;
    }

    public void setKwotaFaktury(Float kwotaFaktury) {
        this.kwotaFaktury = kwotaFaktury;
    }

    public LocalDate getDataFaktury() {
        return dataFaktury;
    }

    public Faktura dataFaktury(LocalDate dataFaktury) {
        this.dataFaktury = dataFaktury;
        return this;
    }

    public void setDataFaktury(LocalDate dataFaktury) {
        this.dataFaktury = dataFaktury;
    }

    public Type getTypFaktury() {
        return typFaktury;
    }

    public Faktura typFaktury(Type typFaktury) {
        this.typFaktury = typFaktury;
        return this;
    }

    public void setTypFaktury(Type typFaktury) {
        this.typFaktury = typFaktury;
    }

    public Status getStatusFaktury() {
        return statusFaktury;
    }

    public Faktura statusFaktury(Status statusFaktury) {
        this.statusFaktury = statusFaktury;
        return this;
    }

    public void setStatusFaktury(Status statusFaktury) {
        this.statusFaktury = statusFaktury;
    }

    public Zaleglosc getZalegloscFaktury() {
        return zalegloscFaktury;
    }

    public Faktura zalegloscFaktury(Zaleglosc zalegloscFaktury) {
        this.zalegloscFaktury = zalegloscFaktury;
        return this;
    }

    public void setZalegloscFaktury(Zaleglosc zalegloscFaktury) {
        this.zalegloscFaktury = zalegloscFaktury;
    }

    public Kontrachent getKontrachent() {
        return kontrachent;
    }

    public Faktura kontrachent(Kontrachent kontrachent) {
        this.kontrachent = kontrachent;
        return this;
    }

    public void setKontrachent(Kontrachent kontrachent) {
        this.kontrachent = kontrachent;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Faktura)) {
            return false;
        }
        return id != null && id.equals(((Faktura) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "Faktura{" +
            "id=" + getId() +
            ", numerFaktury='" + getNumerFaktury() + "'" +
            ", kwotaFaktury=" + getKwotaFaktury() +
            ", dataFaktury='" + getDataFaktury() + "'" +
            ", typFaktury='" + getTypFaktury() + "'" +
            ", statusFaktury='" + getStatusFaktury() + "'" +
            ", zalegloscFaktury='" + getZalegloscFaktury() + "'" +
            "}";
    }
}
