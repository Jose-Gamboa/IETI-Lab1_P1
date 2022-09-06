package com.ieti.controller;

import java.util.ArrayList;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.ieti.dto.UserDto;
import com.ieti.entities.User;
import com.ieti.service.UserService;

@RestController
@RequestMapping( "/users" )
public class UserController {

    private final UserService userService;
    private final ModelMapper modelMapper = new ModelMapper();

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<UserDto>> getAll() {
        List<User> response = userService.getAll();
        List<UserDto> converse = new ArrayList<UserDto>();
        for (User user:response){
            converse.add(modelMapper.map(user, UserDto.class));
        }
        return new ResponseEntity<>(converse, HttpStatus.ACCEPTED);
    }

    @GetMapping( "/{id}" )
    public ResponseEntity<UserDto> findById( @PathVariable String id ) {
        UserDto response = modelMapper.map(userService.findById(id), UserDto.class);
        return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
    }


    @PostMapping
    public ResponseEntity<UserDto> create( @RequestBody UserDto userDto ) {
        userService.create(modelMapper.map(userDto, User.class));
        return new ResponseEntity<>(userDto, HttpStatus.ACCEPTED);
    }

    @PutMapping( "/{id}" )
    public ResponseEntity<UserDto> update( @RequestBody UserDto user, @PathVariable String id ) {
        userService.update(modelMapper.map(user, User.class), id);
        return new ResponseEntity<>(user, HttpStatus.ACCEPTED);
    }

    @DeleteMapping( "/{id}" )
    public ResponseEntity<Boolean> delete( @PathVariable String id ) {
        boolean delete = false;
        if(userService.findById(id) == null){return new ResponseEntity<>(delete, HttpStatus.ACCEPTED);}
        userService.deleteById(id);
        delete = true;
        return new ResponseEntity<>(delete, HttpStatus.ACCEPTED);
    }
    
}
