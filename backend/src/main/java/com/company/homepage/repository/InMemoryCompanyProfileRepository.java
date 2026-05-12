package com.company.homepage.repository;

import com.company.homepage.domain.Partnership;
import com.company.homepage.domain.ProductCategory;
import com.company.homepage.dto.CompanyProfileResponse;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InMemoryCompanyProfileRepository implements CompanyProfileRepository {
    @Override
    public CompanyProfileResponse fetchProfile() {
        return new CompanyProfileResponse(
                "AURA TRIMS",
                "Define Detail, Elevate Fashion",
                "专注服装辅料行业20余年，主营各类纽扣、链条及定制辅件，为高端时装、轻奢品牌、运动品牌提供快速打样与稳定量产服务。",
                List.of(
                        new ProductCategory("时装纽扣", "树脂扣、金属扣、贝壳扣，支持纹理与色彩定制"),
                        new ProductCategory("精品链条", "箱包链、服饰装饰链、功能链，兼顾强度与时尚感"),
                        new ProductCategory("品牌定制辅件", "LOGO压铸、激光雕刻、电镀工艺一体化解决方案")
                ),
                List.of(
                        new Partnership("LuxeWear", "年度联名辅料开发"),
                        new Partnership("UrbanMotion", "运动系列功能辅件共创"),
                        new Partnership("NOVA Atelier", "高定系列材料工艺合作")
                )
        );
    }
}
