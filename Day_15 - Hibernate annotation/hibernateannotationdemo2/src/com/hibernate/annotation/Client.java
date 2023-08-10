package com.highradius.hibernate.annotation;

import javax.persistence.*;

@Entity
@Table
public class Client {
    
    @Id
    @Column(name = "client_id")
    private int clientId;
    
    @Column(name = "client_name")
    private String clientName;

    @OneToOne(cascade = CascadeType.ALL)
    private Company company;
  
    public Client(int clientId, String clientName) {
        this.clientId = clientId;
        this.clientName = clientName;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Client [clientId=" + clientId + ", clientName=" + clientName + "]";
    }
}