package com.example.testsqldata.repository;

import com.example.testsqldata.entity.Testyy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestyyRepository extends JpaRepository<Testyy, Long> {
}
