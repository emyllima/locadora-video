package com.api.locadoravideo.services;

import com.api.locadoravideo.models.LocadoraModel;
import com.api.locadoravideo.repositories.LocadoraRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocadoraService {

    final LocadoraRepository locadoraRepository;

    public LocadoraService(LocadoraRepository locadoraRepository) {
        this.locadoraRepository = locadoraRepository;
    }

    @Transactional
    public LocadoraModel save(LocadoraModel locadoraModel) {
        return locadoraRepository.save(locadoraModel);
    }


}
