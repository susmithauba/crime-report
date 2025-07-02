package com.crimereport.crimealertsystem.service;

import com.crimereport.crimealertsystem.model.CrimeReport;
import com.crimereport.crimealertsystem.repository.CrimeReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrimeReportServiceImpl implements CrimeReportService {

    @Autowired
    private CrimeReportRepository crimeReportRepository;

    @Override
    public CrimeReport saveReport(CrimeReport report) {
        return crimeReportRepository.save(report);
    }

    @Override
    public List<CrimeReport> getAllReports() {
        return crimeReportRepository.findAll();
    }
}
