package com.example.demo.models;

import javax.persistence.*;
import lombok.Setter;
import lombok.Getter;

@Entity
@Setter
@Getter
@Table(name="users")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String name;
    private String email;
    private Integer priority;

    public UserModel() {
    }

    public UserModel(long id, String name, int priority) {
        this.id = id;
        this.name = name;
        this.priority = priority;
    }

    @Override
    public String toString() {
    return String.format(
        "User[id=%d, name='%s', priority='%s']",
        id, name, priority);
    }

}
