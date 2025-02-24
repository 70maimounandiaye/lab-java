package com.isi.maven.services.dto;

import jakarta.validation.constraints.NotNull;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Produit {
    private int id;
    @NotNull(message = "Le nom ne doit pas etre null")
    private String nom;
    @NotNull
    private double qtStock;

}
