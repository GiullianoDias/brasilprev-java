package com.bp.apirestbrprev.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "customer")
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    private String cpf;

    private String name;

    private String address;

    private String phone;

    public Customer() {

    }

    public static long getSerialVersionUID() { return serialVersionUID; }
    public void setId(long id) { this.id = id; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getName() { return name; }
    public void setName(String nome) { this.name = name; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

}
