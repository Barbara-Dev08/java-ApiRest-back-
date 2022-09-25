package com.example.ApiRest.services;

import com.example.ApiRest.entities.Localidad;
import com.example.ApiRest.entities.Persona;
import com.example.ApiRest.repositories.BaseRepository;
import com.example.ApiRest.repositories.LocalidadRepository;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService{

    private LocalidadRepository localidadRepository;

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }


}
