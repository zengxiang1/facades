package org.zx.learn.dto;

import java.io.Serializable;

public class SysRoleDTO implements Serializable{

    private static final long serialVersionUID = 1L;
    private Integer id;

    private String roleName;

    private String resource;

    private Integer parentId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource == null ? null : resource.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return "SysRoleDTO{" +
            "id=" + id +
            ", roleName='" + roleName + '\'' +
            ", resource='" + resource + '\'' +
            ", parentId=" + parentId +
            '}';
    }
}