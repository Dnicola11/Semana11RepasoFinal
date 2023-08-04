package com.example.RepasoSem9;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "musicos", path = "musicos")
public interface MusicoRepository extends CrudRepository<Musico, Long> { 
}
