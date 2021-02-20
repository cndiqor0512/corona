package com.cndiqor0512.service;

import com.cndiqor0512.entity.Corona;
import com.cndiqor0512.repository.CoronaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CoronaService {
    private final CoronaRepository coronaRepository;

    public List<Corona> getCoronaList(){
        return coronaRepository.findAll();
    }

}
