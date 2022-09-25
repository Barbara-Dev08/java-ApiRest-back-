package com.example.ApiRest.controllers;

import com.example.ApiRest.entities.Localidad;
import com.example.ApiRest.services.LocalidadServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/localidades")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl>{


}
