package com.ljsomm.listaproduto.models;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="tb_produto")
public class Product implements Serializable {

    private static Long serialVersionUID= 1L;

    @Id
    @Column(name="cd_produto")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name="nm_produto")
    private String name;
    @Column(name="qt_produto")
    private Integer quantity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

}
