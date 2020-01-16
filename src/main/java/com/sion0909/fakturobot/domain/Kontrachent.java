package com.sion0909.fakturobot.domain;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import org.springframework.data.elasticsearch.annotations.FieldType;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * A Kontrachent.
 */
@Entity
@Table(name = "kontrachent")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@org.springframework.data.elasticsearch.annotations.Document(indexName = "kontrachent")
public class Kontrachent implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @org.springframework.data.elasticsearch.annotations.Field(type = FieldType.Keyword)
    private Long id;

    @Column(name = "nazwa_kontrachenta")
    private String nazwaKontrachenta;

    @Column(name = "email_kontrachenta")
    private String emailKontrachenta;

    @Column(name = "numer_kontrachenta")
    private String numerKontrachenta;

    @Column(name = "termin_kontrachenta")
    private Integer terminKontrachenta;

    @OneToMany(mappedBy = "kontrachent")
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<Faktura> fakturas = new HashSet<>();

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNazwaKontrachenta() {
        return nazwaKontrachenta;
    }

    public Kontrachent nazwaKontrachenta(String nazwaKontrachenta) {
        this.nazwaKontrachenta = nazwaKontrachenta;
        return this;
    }

    public void setNazwaKontrachenta(String nazwaKontrachenta) {
        this.nazwaKontrachenta = nazwaKontrachenta;
    }

    public String getEmailKontrachenta() {
        return emailKontrachenta;
    }

    public Kontrachent emailKontrachenta(String emailKontrachenta) {
        this.emailKontrachenta = emailKontrachenta;
        return this;
    }

    public void setEmailKontrachenta(String emailKontrachenta) {
        this.emailKontrachenta = emailKontrachenta;
    }

    public String getNumerKontrachenta() {
        return numerKontrachenta;
    }

    public Kontrachent numerKontrachenta(String numerKontrachenta) {
        this.numerKontrachenta = numerKontrachenta;
        return this;
    }

    public void setNumerKontrachenta(String numerKontrachenta) {
        this.numerKontrachenta = numerKontrachenta;
    }

    public Integer getTerminKontrachenta() {
        return terminKontrachenta;
    }

    public Kontrachent terminKontrachenta(Integer terminKontrachenta) {
        this.terminKontrachenta = terminKontrachenta;
        return this;
    }

    public void setTerminKontrachenta(Integer terminKontrachenta) {
        this.terminKontrachenta = terminKontrachenta;
    }

    public Set<Faktura> getFakturas() {
        return fakturas;
    }

    public Kontrachent fakturas(Set<Faktura> fakturas) {
        this.fakturas = fakturas;
        return this;
    }

    public Kontrachent addFaktura(Faktura faktura) {
        this.fakturas.add(faktura);
        faktura.setKontrachent(this);
        return this;
    }

    public Kontrachent removeFaktura(Faktura faktura) {
        this.fakturas.remove(faktura);
        faktura.setKontrachent(null);
        return this;
    }

    public void setFakturas(Set<Faktura> fakturas) {
        this.fakturas = fakturas;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Kontrachent)) {
            return false;
        }
        return id != null && id.equals(((Kontrachent) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "Kontrachent{" +
            "id=" + getId() +
            ", nazwaKontrachenta='" + getNazwaKontrachenta() + "'" +
            ", emailKontrachenta='" + getEmailKontrachenta() + "'" +
            ", numerKontrachenta='" + getNumerKontrachenta() + "'" +
            ", terminKontrachenta=" + getTerminKontrachenta() +
            "}";
    }
}
