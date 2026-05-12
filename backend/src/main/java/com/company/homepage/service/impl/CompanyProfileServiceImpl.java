package com.company.homepage.service.impl;

import com.company.homepage.dto.CompanyProfileResponse;
import com.company.homepage.repository.CompanyProfileRepository;
import com.company.homepage.service.CompanyProfileService;
import org.springframework.stereotype.Service;

@Service
public class CompanyProfileServiceImpl implements CompanyProfileService {
    private final CompanyProfileRepository repository;

    public CompanyProfileServiceImpl(CompanyProfileRepository repository) {
        this.repository = repository;
    }

    @Override
    public CompanyProfileResponse getProfile() {
        return repository.fetchProfile();
    }
}
