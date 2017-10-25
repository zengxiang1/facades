package org.zx.learn.dto;

import java.io.Serializable;

public class SysResourceDTO implements Serializable{

    private static final long serialVersionUID = 1L;
    private Integer id;

    private String resourceType;

    private String resourcePath;

    private String resourcePermission;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType == null ? null : resourceType.trim();
    }

    public String getResourcePath() {
        return resourcePath;
    }

    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath == null ? null : resourcePath.trim();
    }

    public String getResourcePermission() {
        return resourcePermission;
    }

    public void setResourcePermission(String resourcePermission) {
        this.resourcePermission = resourcePermission == null ? null : resourcePermission.trim();
    }

    @Override
    public String toString() {
        return "SysResourceDTO{" +
            "id=" + id +
            ", resourceType='" + resourceType + '\'' +
            ", resourcePath='" + resourcePath + '\'' +
            ", resourcePermission='" + resourcePermission + '\'' +
            '}';
    }
}