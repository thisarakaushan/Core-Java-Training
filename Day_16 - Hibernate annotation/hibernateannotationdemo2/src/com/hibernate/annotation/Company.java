package com.highradius.hibernate.annotation;

import javax.persistence.*;

@Entity
@Table
public class Company {
    
    @Id
    @Column(name = "company_id")
    private int companyId;
    
    @Column(name = "company_name")
    private String companyName;

    @OneToOne(mappedBy = "company", cascade = CascadeType.ALL)
    @JoinColumn(name = "client_id")
    private Client client;

    public Company(int companyId, String companyName) {
        this.companyId = companyId;
        this.companyName = companyName;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Company [companyId=" + companyId + ", companyName=" + companyName + "]";
    }
}