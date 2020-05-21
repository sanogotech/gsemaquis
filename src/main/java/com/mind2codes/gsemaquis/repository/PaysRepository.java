package com.mind2codes.gsemaquis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mind2codes.gsemaquis.domain.Pays;

@Repository
public interface PaysRepository extends JpaRepository<Pays, Long> {

}
