package com.example.securitytest.domain;

import java.io.Serializable;

/**
 * 权限表
 * @TableName sys_permission
 */
public class SysPermission implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 权限code
     */
    private String permissionCode;

    /**
     * 权限名
     */
    private String permissionName;

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 权限code
     */
    public String getPermissionCode() {
        return permissionCode;
    }

    /**
     * 权限code
     */
    public void setPermissionCode(String permissionCode) {
        this.permissionCode = permissionCode;
    }

    /**
     * 权限名
     */
    public String getPermissionName() {
        return permissionName;
    }

    /**
     * 权限名
     */
    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SysPermission other = (SysPermission) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPermissionCode() == null ? other.getPermissionCode() == null : this.getPermissionCode().equals(other.getPermissionCode()))
            && (this.getPermissionName() == null ? other.getPermissionName() == null : this.getPermissionName().equals(other.getPermissionName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPermissionCode() == null) ? 0 : getPermissionCode().hashCode());
        result = prime * result + ((getPermissionName() == null) ? 0 : getPermissionName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", permissionCode=").append(permissionCode);
        sb.append(", permissionName=").append(permissionName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}