package com.example.securitytest.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户表
 * @TableName sys_user
 */
@Data
public class SysUser implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 账号
     */
    private String account;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 上一次登录时间
     */
    private Date lastLoginTime;

    /**
     * 账号是否可用。默认为1（可用）
     */
    private Integer enabled;

    /**
     * 是否过期。默认为1（没有过期）
     */
    private Integer notExpired;

    /**
     * 账号是否锁定。默认为1（没有锁定）
     */
    private Integer accountNotLocked;

    /**
     * 证书（密码）是否过期。默认为1（没有过期）
     */
    private Integer credentialsNotExpired;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 创建人
     */
    private Integer createUser;

    /**
     * 修改人
     */
    private Integer updateUser;

    private static final long serialVersionUID = 1L;

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
        SysUser other = (SysUser) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getLastLoginTime() == null ? other.getLastLoginTime() == null : this.getLastLoginTime().equals(other.getLastLoginTime()))
            && (this.getEnabled() == null ? other.getEnabled() == null : this.getEnabled().equals(other.getEnabled()))
            && (this.getNotExpired() == null ? other.getNotExpired() == null : this.getNotExpired().equals(other.getNotExpired()))
            && (this.getAccountNotLocked() == null ? other.getAccountNotLocked() == null : this.getAccountNotLocked().equals(other.getAccountNotLocked()))
            && (this.getCredentialsNotExpired() == null ? other.getCredentialsNotExpired() == null : this.getCredentialsNotExpired().equals(other.getCredentialsNotExpired()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getUpdateUser() == null ? other.getUpdateUser() == null : this.getUpdateUser().equals(other.getUpdateUser()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAccount() == null) ? 0 : getAccount().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getLastLoginTime() == null) ? 0 : getLastLoginTime().hashCode());
        result = prime * result + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        result = prime * result + ((getNotExpired() == null) ? 0 : getNotExpired().hashCode());
        result = prime * result + ((getAccountNotLocked() == null) ? 0 : getAccountNotLocked().hashCode());
        result = prime * result + ((getCredentialsNotExpired() == null) ? 0 : getCredentialsNotExpired().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getUpdateUser() == null) ? 0 : getUpdateUser().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", account=").append(account);
        sb.append(", userName=").append(userName);
        sb.append(", password=").append(password);
        sb.append(", lastLoginTime=").append(lastLoginTime);
        sb.append(", enabled=").append(enabled);
        sb.append(", notExpired=").append(notExpired);
        sb.append(", accountNotLocked=").append(accountNotLocked);
        sb.append(", credentialsNotExpired=").append(credentialsNotExpired);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createUser=").append(createUser);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}