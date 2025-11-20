package com.prashanth.docker_demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "docker_demo_table")
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DockerDemoEntity {

    @Id
    @GeneratedValue()
    long id;
    String name;
    String description;
    public DockerDemoEntity(String name, String description){
        this.name = name;
        this.description = description;
    }

}
