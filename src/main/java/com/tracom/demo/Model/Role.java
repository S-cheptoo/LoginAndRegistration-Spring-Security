package com.tracom.demo.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "roles")
public class Role{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="role_id")
    private Integer id;

    @Column(name="name", unique=true, length=100)
    private String name;

    @ManyToMany(mappedBy="roles")
    private final Set<User> users = new HashSet<>();

    public Role(Integer id){
        this.id=id;
    }
    public Role(String name){
        this.name=name;
    }

    public Role() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
