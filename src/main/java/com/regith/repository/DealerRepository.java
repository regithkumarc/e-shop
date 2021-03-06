package com.regith.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.regith.model.Dealer;

@Repository
public interface DealerRepository extends JpaRepository<Dealer, Integer> {

}
