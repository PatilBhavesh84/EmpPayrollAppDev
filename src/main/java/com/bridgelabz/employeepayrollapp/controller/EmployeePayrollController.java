package com.bridgelabz.employeepayrollapp.controller;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
public class EmployeePayrollController {
   //localhost:8080/get
    @RequestMapping(value = {"", "/", "/get"})
    public ResponseEntity<String> getEmployeePayrollData() {
        return new ResponseEntity<String>("Get Call Success", HttpStatus.OK);
    }
    //localhost:8080/get/2
    @GetMapping("/get/{empId}")
    public ResponseEntity<String> getEmployeePayrollData(@PathVariable("empId") int empId) {
        return new ResponseEntity<String>("Get Call Success for id: " + empId, HttpStatus.OK);
    }
    //localhost:8080/create
    @PostMapping("/create")
    public ResponseEntity<String> addEmployeePayrollData(
            @RequestBody EmployeePayrollDTO employeePayrollDTO) {
        return new ResponseEntity<String>("Created Employee Payroll Data for: "+ employeePayrollDTO, HttpStatus.OK);
    }
    //localhost:8080/update
    @PutMapping("/update")
    public ResponseEntity<String> updateEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO){
        return new ResponseEntity<String>("Updated Employee Payroll Data for: "+ employeePayrollDTO, HttpStatus. OK);
    }
    //localhost:8080/delete/1
    @DeleteMapping("/delete/{empId}")
    public ResponseEntity<String> deleteEmployeePayrollData(@PathVariable("empId") int empId){
        return new ResponseEntity<String>("Delete Call Success for id: "+empId, HttpStatus. OK);
    }
}