package com.example.practica.controller;

import com.example.practica.businnes.RoleBusinnes;
import com.example.practica.dto.RoleDto;
import com.example.practica.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.management.ObjectName;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/practica/roles",method = {RequestMethod.GET, RequestMethod.HEAD})
public class RoleController {
@Autowired
private RoleBusinnes roleBusinnes;

  private Map<String,Object> response =new HashMap<>();

@GetMapping("/findAll")
public ResponseEntity<Map<String, Object>> findAll() {
    List<RoleDto> rolesDtos = this.roleBusinnes.findAll();
    response.put("status","ok");
    response.put("data",rolesDtos)    ;
     return  new ResponseEntity<>(response,HttpStatus.OK);
}
@PostMapping("/add")
public  ResponseEntity<Map <String,Object>>  addRoles( @RequestBody Map<String, Object> request){
    RoleDto roleDto = new RoleDto();
    roleDto.setId(Long.parseLong(request.get("id").toString()));
    roleDto.setAbbreviation(request.get("abbreviation").toString());
    roleDto.setDescription(request.get("description").toString());
    roleDto.setState(Boolean.parseBoolean(request.get("state").toString()));
    roleDto.setName(request.get("name").toString());
    String message = this.roleBusinnes.addRole(roleDto);
    System.out.println(roleDto);
    response.put("status","ok");
     return  ResponseEntity.ok(response);
}
}
