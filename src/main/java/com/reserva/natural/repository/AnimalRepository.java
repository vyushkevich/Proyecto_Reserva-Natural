package com.reserva.natural.repository;

import java.util.List;

import com.reserva.natural.model.Animal;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {
    Page<Animal> findByFamilyFamilyName(String familyName, Pageable pageable);
    List<Animal> findByCountryCountryName(String countryName);
    List<Animal> findByFamilyFamilyNameAndTypeTypeName(String familyName, String typeName);

}