package com.example.CarRentalSystem.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "modelName may not be blank or null or has spaces")
    private String modelName;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "brand_id")
    @NotNull(message = "Brand may not be null")
    private Brand brand;

    public Model() {
    }

    public Model(String modelName, Brand brand) {
        this.modelName = modelName;
        this.brand = brand;
    }
}
