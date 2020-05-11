package com.bp.apirestbrprev.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "order")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    private float amount;

    private Integer id_customer;

    private String orderDate;

    public Order(){

    }

    public static long getSerialVersionUID() { return serialVersionUID; }
    public void setId(long id) { this.id = id; }

    public String getOrderDate() { return orderDate; }
    public void setOrderDate(String orderDate) { this.orderDate = orderDate; }

    public float getAmount() { return amount; }
    public void setAmount(float amount) { this.amount = amount; }

    public Integer getId_customer() { return id_customer; }
    public void setId_customer(Integer id_customer) { this.id_customer = id_customer; }

}
