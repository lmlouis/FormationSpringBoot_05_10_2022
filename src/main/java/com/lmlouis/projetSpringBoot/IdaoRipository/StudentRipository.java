package com.lmlouis.projetSpringBoot.IdaoRipository;

import com.lmlouis.projetSpringBoot.EntitiesOrModel.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // data access
public interface StudentRipository
        extends JpaRepository <Student, Long> {
}
