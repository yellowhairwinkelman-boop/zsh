package com.company.homepage.domain;

public class Partnership {
    private final String brandName;
    private final String cooperationType;

    public Partnership(String brandName, String cooperationType) {
        this.brandName = brandName;
        this.cooperationType = cooperationType;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getCooperationType() {
        return cooperationType;
    }
}
