package com.cndiqor0512.repository;

import com.cndiqor0512.entity.Corona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoronaRepository extends JpaRepository<Corona, Long> {
}
