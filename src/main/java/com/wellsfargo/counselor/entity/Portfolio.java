package com.wellsfargo.counselor.entity;

import javax.persistence.*;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long portfolioId;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @Column(nullable = false)
    private String creationDate;

    protected Portfolio() {
    }

    public Portfolio(Client client, String creationDate) {
        this.client = client;
        this.creationDate = creationDate;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
}
