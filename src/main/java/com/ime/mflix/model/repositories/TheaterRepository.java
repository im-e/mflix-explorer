package com.ime.mflix.model.repositories;

import com.ime.mflix.model.entities.Theater;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;
import java.util.Optional;

public interface TheaterRepository extends ListCrudRepository<Theater, String> {

    List<Theater> findByLocationAddressState(String statue);

    List<Theater> findByLocationAddressCity(String city);
    List<Theater> findByLocationAddressZipcode(String zipcode);
    List<Theater> findByLocationAddressStreet1(String street);
    Optional<Theater> findByTheaterId(Integer theaterId);
}
