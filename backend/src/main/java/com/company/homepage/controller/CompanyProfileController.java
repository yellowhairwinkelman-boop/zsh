package com.company.homepage.controller;

import com.company.homepage.dto.CompanyProfileResponse;
import com.company.homepage.service.CompanyProfileService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/company")
public class CompanyProfileController {
    private final CompanyProfileService companyProfileService;

    public CompanyProfileController(CompanyProfileService companyProfileService) {
        this.companyProfileService = companyProfileService;
    }

    @GetMapping("/profile")
    public CompanyProfileResponse getProfile() {
        return companyProfileService.getProfile();
    }
}
