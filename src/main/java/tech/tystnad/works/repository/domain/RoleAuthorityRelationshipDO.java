package tech.tystnad.works.repository.domain;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table role_authority_relationship
 */
public class RoleAuthorityRelationshipDO {
    /**
     * Database Column Remarks:
     *   角色ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_authority_relationship.role_id
     *
     * @mbg.generated
     */
    private Long roleId;

    /**
     * Database Column Remarks:
     *   权限ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_authority_relationship.auth_id
     *
     * @mbg.generated
     */
    private Integer authId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_authority_relationship.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_authority_relationship.role_id
     *
     * @return the value of role_authority_relationship.role_id
     *
     * @mbg.generated
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_authority_relationship.role_id
     *
     * @param roleId the value for role_authority_relationship.role_id
     *
     * @mbg.generated
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_authority_relationship.auth_id
     *
     * @return the value of role_authority_relationship.auth_id
     *
     * @mbg.generated
     */
    public Integer getAuthId() {
        return authId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_authority_relationship.auth_id
     *
     * @param authId the value for role_authority_relationship.auth_id
     *
     * @mbg.generated
     */
    public void setAuthId(Integer authId) {
        this.authId = authId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_authority_relationship.create_time
     *
     * @return the value of role_authority_relationship.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_authority_relationship.create_time
     *
     * @param createTime the value for role_authority_relationship.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}