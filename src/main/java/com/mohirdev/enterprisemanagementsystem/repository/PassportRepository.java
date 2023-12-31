package com.mohirdev.enterprisemanagementsystem.repository;

import com.mohirdev.enterprisemanagementsystem.entity.Passport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassportRepository extends JpaRepository<Passport, Long> {
}
