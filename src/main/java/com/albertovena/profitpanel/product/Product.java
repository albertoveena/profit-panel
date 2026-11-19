package com.albertovena.profitpanel.product;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String sku;

    @Column(nullable = false)
    private String name;

    @Column(name = "unit_cost", nullable = false, precision = 10, scale = 2)
    private BigDecimal unitCost;

    protected Product() {
    }

    public Product(String sku, String name, BigDecimal unitCost) {
        this.sku = sku;
        this.name = name;
        this.unitCost = unitCost;
    }

    public Long getId() { return id; }
    public String getSku() { return sku; }
    public String getName() { return name; }
    public BigDecimal getUnitCost() { return unitCost; }

    public void setName(String name) { this.name = name; }
    public void setUnitCost(BigDecimal unitCost) { this.unitCost = unitCost; }
}