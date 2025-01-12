package com.example.hotel.models;

import javax.persistence.*;

@Entity
@Table(name = "type_room")
public class Type_room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_type_room")
    private Long id;
    @Column(name = "name_type_room")
    private String name;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
