package com.crimereport.crimealertsystem.service;

import com.crimereport.crimealertsystem.model.CrimeReport;
import java.util.List;

public interface CrimeReportService {
    CrimeReport saveReport(CrimeReport report);
    List<CrimeReport> getAllReports();
}
