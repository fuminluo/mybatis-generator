package com.mybatis.model;

public class ApplicationUser {
    private Integer userId;

    private Integer applicationId;

    public ApplicationUser(Integer userId, Integer applicationId) {
        this.userId = userId;
        this.applicationId = applicationId;
    }

    public ApplicationUser() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Integer applicationId) {
        this.applicationId = applicationId;
    }
}