package com.mindhub.fulbo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ClubPatrocinadorRepository extends JpaRepository<ClubPatrocinador,Long> {
}