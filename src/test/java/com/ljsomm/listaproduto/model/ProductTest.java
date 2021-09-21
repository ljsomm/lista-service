package com.ljsomm.listaproduto.model;


import com.ljsomm.listaproduto.models.Product;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;

import static org.junit.Assert.*;


public class ProductTest {


    @Test
    public void  teste001(){
        Product product = new Product();

        product.setId(1);
        product.setName("Garrafa");
        product.setQuantity(15);

        assertEquals("Garrafa", product.getName());
        assertThat(product.getId(), is(1));
        assertThat(product.getQuantity(), is(15));

    }

}
