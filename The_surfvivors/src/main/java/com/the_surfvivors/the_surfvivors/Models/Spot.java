package com.the_surfvivors.the_surfvivors.Models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "t_Spot")

public class Spot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    public String beach;
    public int difficulty_level;
    public String country;
    public String photos;
}


