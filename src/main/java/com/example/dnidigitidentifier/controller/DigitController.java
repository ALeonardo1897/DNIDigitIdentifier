package com.example.dnidigitidentifier.controller;

import com.example.dnidigitidentifier.business.IDigitService;
import com.example.dnidigitidentifier.model.DigitRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DigitController {

    @Autowired
    private IDigitService digitService;

    @PostMapping
    public String calculate(@RequestBody DigitRequest request){
        return digitService.calculate(request.getDni());
    }
}
