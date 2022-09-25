package com.example.ApiRest.services;

import com.example.ApiRest.entities.Autor;

import java.util.List;

public interface AutorService extends BaseService<Autor, Long> {

    List<Autor> search(String filtro) throws Exception;
}
