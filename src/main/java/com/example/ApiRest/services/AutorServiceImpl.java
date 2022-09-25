package com.example.ApiRest.services;

import com.example.ApiRest.entities.Autor;
import com.example.ApiRest.repositories.AutorRepository;
import com.example.ApiRest.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService{

    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<Autor> search(String filtro) throws Exception {
        try {
            //jpql:
            List<Autor> autores = autorRepository.search(filtro);
            return autores;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
