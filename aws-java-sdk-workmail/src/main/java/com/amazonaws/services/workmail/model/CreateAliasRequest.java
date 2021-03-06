/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/CreateAlias" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAliasRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The organization under which the member exists.
     * </p>
     */
    private String organizationId;
    /**
     * <p>
     * The alias is added to this Amazon WorkMail entity.
     * </p>
     */
    private String entityId;
    /**
     * <p>
     * The alias to add to the user.
     * </p>
     */
    private String alias;

    /**
     * <p>
     * The organization under which the member exists.
     * </p>
     * 
     * @param organizationId
     *        The organization under which the member exists.
     */

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The organization under which the member exists.
     * </p>
     * 
     * @return The organization under which the member exists.
     */

    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * <p>
     * The organization under which the member exists.
     * </p>
     * 
     * @param organizationId
     *        The organization under which the member exists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAliasRequest withOrganizationId(String organizationId) {
        setOrganizationId(organizationId);
        return this;
    }

    /**
     * <p>
     * The alias is added to this Amazon WorkMail entity.
     * </p>
     * 
     * @param entityId
     *        The alias is added to this Amazon WorkMail entity.
     */

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * <p>
     * The alias is added to this Amazon WorkMail entity.
     * </p>
     * 
     * @return The alias is added to this Amazon WorkMail entity.
     */

    public String getEntityId() {
        return this.entityId;
    }

    /**
     * <p>
     * The alias is added to this Amazon WorkMail entity.
     * </p>
     * 
     * @param entityId
     *        The alias is added to this Amazon WorkMail entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAliasRequest withEntityId(String entityId) {
        setEntityId(entityId);
        return this;
    }

    /**
     * <p>
     * The alias to add to the user.
     * </p>
     * 
     * @param alias
     *        The alias to add to the user.
     */

    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * <p>
     * The alias to add to the user.
     * </p>
     * 
     * @return The alias to add to the user.
     */

    public String getAlias() {
        return this.alias;
    }

    /**
     * <p>
     * The alias to add to the user.
     * </p>
     * 
     * @param alias
     *        The alias to add to the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAliasRequest withAlias(String alias) {
        setAlias(alias);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getOrganizationId() != null)
            sb.append("OrganizationId: ").append(getOrganizationId()).append(",");
        if (getEntityId() != null)
            sb.append("EntityId: ").append(getEntityId()).append(",");
        if (getAlias() != null)
            sb.append("Alias: ").append(getAlias());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAliasRequest == false)
            return false;
        CreateAliasRequest other = (CreateAliasRequest) obj;
        if (other.getOrganizationId() == null ^ this.getOrganizationId() == null)
            return false;
        if (other.getOrganizationId() != null && other.getOrganizationId().equals(this.getOrganizationId()) == false)
            return false;
        if (other.getEntityId() == null ^ this.getEntityId() == null)
            return false;
        if (other.getEntityId() != null && other.getEntityId().equals(this.getEntityId()) == false)
            return false;
        if (other.getAlias() == null ^ this.getAlias() == null)
            return false;
        if (other.getAlias() != null && other.getAlias().equals(this.getAlias()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        hashCode = prime * hashCode + ((getEntityId() == null) ? 0 : getEntityId().hashCode());
        hashCode = prime * hashCode + ((getAlias() == null) ? 0 : getAlias().hashCode());
        return hashCode;
    }

    @Override
    public CreateAliasRequest clone() {
        return (CreateAliasRequest) super.clone();
    }

}
