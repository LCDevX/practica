package com.example.practica.businnes;

import com.example.practica.dto.RoleDto;
import com.example.practica.entities.Role;
import com.example.practica.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class RoleBusinnes {


    @Autowired
    private RoleService roleService;




    public List<RoleDto> findAll(){
        List<Role> rolesList = new ArrayList<>();
        List<RoleDto> roleDtos = new ArrayList<>();
        rolesList= roleService.findAll();
        rolesList.forEach(role -> {
            RoleDto roleDto = new RoleDto();
            roleDto.setId(role.getId());
            roleDto.setName(role.getName());
            roleDto.setDescription(role.getDescription());
            roleDto.setState(role.getState());
            roleDto.setAbbreviation(role.getAbbreviation());
          roleDtos.add(roleDto);
        });
        return roleDtos;
    }

public String addRole(RoleDto roleDto){

        Role role = new Role();
        role.setName(roleDto.getName());
        role.setId(roleDto.getId());
        role.setDescription(roleDto.getDescription());
        role.setState(roleDto.getState());
        role.setAbbreviation(roleDto.getAbbreviation());

        if (role.getId()!= null ){
            this.roleService.save(role);
           return "Role added";
        }else {
           return "fallo el registro";
        }
}


}
