package com.company.homepage.dto;

import com.company.homepage.domain.Partnership;
import com.company.homepage.domain.ProductCategory;

import java.util.List;

public record CompanyProfileResponse(
        String companyName,
        String slogan,
        String introduction,
        List<ProductCategory> products,
        List<Partnership> partnerships
) {
}
