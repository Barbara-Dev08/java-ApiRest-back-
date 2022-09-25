package com.example.ApiRest.repositories;


import com.example.ApiRest.entities.Localidad;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocalidadRepository extends BaseRepository<Localidad, Long>{


}
