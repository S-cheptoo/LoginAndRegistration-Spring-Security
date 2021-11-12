package com.tracom.demo.Service;

import com.tracom.demo.Model.Role;
import com.tracom.demo.Repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;

    public List<Role> getRoles(){
        return roleRepository.findAll();
    }
//    public Role get(Long id){
//        return roleRepository.findById(id).get();
//    }
}
