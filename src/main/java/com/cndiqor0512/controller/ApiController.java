package com.cndiqor0512.controller;

import com.cndiqor0512.entity.Corona;
import com.cndiqor0512.service.CoronaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@AllArgsConstructor
public class ApiController {
    private CoronaService coronaService;

    @GetMapping(value ="/api/list")
    public List<Corona> getCoronaList() {return coronaService.getCoronaList(); }



}
