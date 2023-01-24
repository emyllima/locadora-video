package com.api.locadoravideo.repositories;

import com.api.locadoravideo.models.LocadoraModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface LocadoraRepository extends JpaRepository<LocadoraModel, UUID> {



}
