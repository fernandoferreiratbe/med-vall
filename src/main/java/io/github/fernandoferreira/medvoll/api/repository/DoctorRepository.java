package io.github.fernandoferreira.medvoll.api.repository;

import io.github.fernandoferreira.medvoll.api.domain.doctor.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
