package com.the_surfvivors.the_surfvivors.Models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "t_Spot")

public class Spot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String beach;
    private int difficulty_level;
    private String country;
    private String photos;
}


