package com.activity.JuvylynChua;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/users")
    public ResponseEntity<String> getMapping(){
        return new ResponseEntity<String>("get all users", HttpStatus.OK);
    }

    @PostMapping(value = "/users")
    public ResponseEntity<User> postMapping(@RequestBody User user){
        return ResponseEntity.ok(userService.getUser(user));
    }

    @PutMapping(value = "/users/{id}")
    public ResponseEntity<String> putMapping(@PathVariable("id") String test) {
        return new ResponseEntity<>(test + " This is a put mapping", HttpStatus.OK);
    }

    @DeleteMapping(value = "/users")
    public ResponseEntity<String> deleteMapping(@RequestParam(value = "personId", defaultValue = "12345") String personId) {
        return new ResponseEntity<>(personId + " Delete Success", HttpStatus.OK);
    }
}
