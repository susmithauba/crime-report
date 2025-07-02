package com.crimereport.crimealertsystem.controller;

import com.crimereport.crimealertsystem.model.CrimeReport;
import com.crimereport.crimealertsystem.service.CrimeReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reports")
public class CrimeReportController {

    @Autowired
    private CrimeReportService crimeReportService;

    @PostMapping("/report")
    public CrimeReport reportCrime(@RequestBody CrimeReport report) {
        return crimeReportService.saveReport(report);
    }

    @GetMapping("/all")
    public List<CrimeReport> getAllReports() {
        return crimeReportService.getAllReports();
    }
}
