package ru.gb.mall.inventory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.gb.mall.inventory.entity.Role;
import ru.gb.mall.inventory.repository.RoleRepository;

import java.util.Optional;

@Service
public class RoleService {
    private RoleRepository roleRepository;

    @Autowired
    public void setRoleRepository(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public Optional<Role> findRoleByName(String role){
        return roleRepository.findRoleByName(role);
    }
}