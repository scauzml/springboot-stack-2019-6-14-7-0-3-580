//package com.tw.apistackbase.controller;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.logging.Logger;
//import java.util.stream.Collectors;
//
///**
// * Created by jxzhong on 18/08/2017.
// */
//@RestController
//@RequestMapping("/employees")
//public class HelloResource {
//
//    private final Logger log = Logger.getLogger(this.getClass().getName());
//    Map<Integer, Employee> map = new HashMap<>();
//
//
////    @GetMapping(path = "/{userName}", produces = {"application/json"})
////    public ResponseEntity<String> getAll(@PathVariable String userName) {
////
////        return ResponseEntity.ok("Hello:" + userName);
////    }
//
//    @GetMapping()
//    public ResponseEntity getAll() {
//
//
//        return ResponseEntity.ok().body(map);
//    }
//
//    @PostMapping()
//    public ResponseEntity create(@RequestBody Employee employee) {
//
//        map.put(employee.getId(), employee);
//
//        return ResponseEntity.status(HttpStatus.CREATED).build();
//    }
//
//    @PutMapping("/{userid}")
//    public ResponseEntity change(@RequestBody Employee employee,@PathVariable("userid")String id) {
//        System.out.println(employee.toString());
//        Employee employee1 = map.get(Integer.valueOf(id));
//        employee1=employee;
//        map.put(employee1.getId(), employee1);
//        return ResponseEntity.status(HttpStatus.CREATED).build();
//
//    }
//
//    @DeleteMapping("/{userid}")
//    public ResponseEntity delete(@PathVariable("userid") String id) {
//        map.remove(Integer.valueOf(id));
//        return ResponseEntity.ok().build();
//    }
//}
