// path: com.crimereport.crimealertsystem.repository.CrimeReportRepository.java

package com.crimereport.crimealertsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.crimereport.crimealertsystem.model.CrimeReport;

public interface CrimeReportRepository extends JpaRepository<CrimeReport, Long> {
}
