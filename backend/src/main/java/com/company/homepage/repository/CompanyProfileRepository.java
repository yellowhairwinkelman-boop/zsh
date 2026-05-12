package com.company.homepage.repository;

import com.company.homepage.dto.CompanyProfileResponse;

public interface CompanyProfileRepository {
    CompanyProfileResponse fetchProfile();
}
