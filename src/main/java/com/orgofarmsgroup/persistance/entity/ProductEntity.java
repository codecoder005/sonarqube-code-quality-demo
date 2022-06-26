package com.orgofarmsgroup.persistance.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(
        name = "products"
)
public class ProductEntity {
    @Id
    private Long pid;
    private String name;
    private String description;
    private Double price;
}
