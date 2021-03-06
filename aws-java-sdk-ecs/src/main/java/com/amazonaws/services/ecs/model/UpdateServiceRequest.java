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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/UpdateService" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateServiceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that your service is running on. If you do not
     * specify a cluster, the default cluster is assumed.
     * </p>
     */
    private String cluster;
    /**
     * <p>
     * The name of the service to update.
     * </p>
     */
    private String service;
    /**
     * <p>
     * The number of instantiations of the task to place and keep running in your service.
     * </p>
     */
    private Integer desiredCount;
    /**
     * <p>
     * The <code>family</code> and <code>revision</code> (<code>family:revision</code>) or full ARN of the task
     * definition to run in your service. If a <code>revision</code> is not specified, the latest <code>ACTIVE</code>
     * revision is used. If you modify the task definition with <code>UpdateService</code>, Amazon ECS spawns a task
     * with the new version of the task definition and then stops an old task after the new version is running.
     * </p>
     */
    private String taskDefinition;
    /**
     * <p>
     * Optional deployment parameters that control how many tasks run during the deployment and the ordering of stopping
     * and starting tasks.
     * </p>
     */
    private DeploymentConfiguration deploymentConfiguration;
    /**
     * <p>
     * The network configuration for the service. This parameter is required for task definitions that use the
     * <code>awsvpc</code> network mode to receive their own Elastic Network Interface, and it is not supported for
     * other network modes. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task Networking</a> in the
     * <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * Updating a service to add a subnet to a list of existing subnets does not trigger a service deployment. For
     * example, if your network configuration change is to keep the existing subnets and simply add another subnet to
     * the network configuration, this does not trigger a new service deployment.
     * </p>
     * </note>
     */
    private NetworkConfiguration networkConfiguration;
    /**
     * <p>
     * The platform version you want to update your service to run.
     * </p>
     */
    private String platformVersion;
    /**
     * <p>
     * Whether or not to force a new deployment of the service.
     * </p>
     */
    private Boolean forceNewDeployment;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that your service is running on. If you do not
     * specify a cluster, the default cluster is assumed.
     * </p>
     * 
     * @param cluster
     *        The short name or full Amazon Resource Name (ARN) of the cluster that your service is running on. If you
     *        do not specify a cluster, the default cluster is assumed.
     */

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that your service is running on. If you do not
     * specify a cluster, the default cluster is assumed.
     * </p>
     * 
     * @return The short name or full Amazon Resource Name (ARN) of the cluster that your service is running on. If you
     *         do not specify a cluster, the default cluster is assumed.
     */

    public String getCluster() {
        return this.cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that your service is running on. If you do not
     * specify a cluster, the default cluster is assumed.
     * </p>
     * 
     * @param cluster
     *        The short name or full Amazon Resource Name (ARN) of the cluster that your service is running on. If you
     *        do not specify a cluster, the default cluster is assumed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceRequest withCluster(String cluster) {
        setCluster(cluster);
        return this;
    }

    /**
     * <p>
     * The name of the service to update.
     * </p>
     * 
     * @param service
     *        The name of the service to update.
     */

    public void setService(String service) {
        this.service = service;
    }

    /**
     * <p>
     * The name of the service to update.
     * </p>
     * 
     * @return The name of the service to update.
     */

    public String getService() {
        return this.service;
    }

    /**
     * <p>
     * The name of the service to update.
     * </p>
     * 
     * @param service
     *        The name of the service to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceRequest withService(String service) {
        setService(service);
        return this;
    }

    /**
     * <p>
     * The number of instantiations of the task to place and keep running in your service.
     * </p>
     * 
     * @param desiredCount
     *        The number of instantiations of the task to place and keep running in your service.
     */

    public void setDesiredCount(Integer desiredCount) {
        this.desiredCount = desiredCount;
    }

    /**
     * <p>
     * The number of instantiations of the task to place and keep running in your service.
     * </p>
     * 
     * @return The number of instantiations of the task to place and keep running in your service.
     */

    public Integer getDesiredCount() {
        return this.desiredCount;
    }

    /**
     * <p>
     * The number of instantiations of the task to place and keep running in your service.
     * </p>
     * 
     * @param desiredCount
     *        The number of instantiations of the task to place and keep running in your service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceRequest withDesiredCount(Integer desiredCount) {
        setDesiredCount(desiredCount);
        return this;
    }

    /**
     * <p>
     * The <code>family</code> and <code>revision</code> (<code>family:revision</code>) or full ARN of the task
     * definition to run in your service. If a <code>revision</code> is not specified, the latest <code>ACTIVE</code>
     * revision is used. If you modify the task definition with <code>UpdateService</code>, Amazon ECS spawns a task
     * with the new version of the task definition and then stops an old task after the new version is running.
     * </p>
     * 
     * @param taskDefinition
     *        The <code>family</code> and <code>revision</code> (<code>family:revision</code>) or full ARN of the task
     *        definition to run in your service. If a <code>revision</code> is not specified, the latest
     *        <code>ACTIVE</code> revision is used. If you modify the task definition with <code>UpdateService</code>,
     *        Amazon ECS spawns a task with the new version of the task definition and then stops an old task after the
     *        new version is running.
     */

    public void setTaskDefinition(String taskDefinition) {
        this.taskDefinition = taskDefinition;
    }

    /**
     * <p>
     * The <code>family</code> and <code>revision</code> (<code>family:revision</code>) or full ARN of the task
     * definition to run in your service. If a <code>revision</code> is not specified, the latest <code>ACTIVE</code>
     * revision is used. If you modify the task definition with <code>UpdateService</code>, Amazon ECS spawns a task
     * with the new version of the task definition and then stops an old task after the new version is running.
     * </p>
     * 
     * @return The <code>family</code> and <code>revision</code> (<code>family:revision</code>) or full ARN of the task
     *         definition to run in your service. If a <code>revision</code> is not specified, the latest
     *         <code>ACTIVE</code> revision is used. If you modify the task definition with <code>UpdateService</code>,
     *         Amazon ECS spawns a task with the new version of the task definition and then stops an old task after the
     *         new version is running.
     */

    public String getTaskDefinition() {
        return this.taskDefinition;
    }

    /**
     * <p>
     * The <code>family</code> and <code>revision</code> (<code>family:revision</code>) or full ARN of the task
     * definition to run in your service. If a <code>revision</code> is not specified, the latest <code>ACTIVE</code>
     * revision is used. If you modify the task definition with <code>UpdateService</code>, Amazon ECS spawns a task
     * with the new version of the task definition and then stops an old task after the new version is running.
     * </p>
     * 
     * @param taskDefinition
     *        The <code>family</code> and <code>revision</code> (<code>family:revision</code>) or full ARN of the task
     *        definition to run in your service. If a <code>revision</code> is not specified, the latest
     *        <code>ACTIVE</code> revision is used. If you modify the task definition with <code>UpdateService</code>,
     *        Amazon ECS spawns a task with the new version of the task definition and then stops an old task after the
     *        new version is running.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceRequest withTaskDefinition(String taskDefinition) {
        setTaskDefinition(taskDefinition);
        return this;
    }

    /**
     * <p>
     * Optional deployment parameters that control how many tasks run during the deployment and the ordering of stopping
     * and starting tasks.
     * </p>
     * 
     * @param deploymentConfiguration
     *        Optional deployment parameters that control how many tasks run during the deployment and the ordering of
     *        stopping and starting tasks.
     */

    public void setDeploymentConfiguration(DeploymentConfiguration deploymentConfiguration) {
        this.deploymentConfiguration = deploymentConfiguration;
    }

    /**
     * <p>
     * Optional deployment parameters that control how many tasks run during the deployment and the ordering of stopping
     * and starting tasks.
     * </p>
     * 
     * @return Optional deployment parameters that control how many tasks run during the deployment and the ordering of
     *         stopping and starting tasks.
     */

    public DeploymentConfiguration getDeploymentConfiguration() {
        return this.deploymentConfiguration;
    }

    /**
     * <p>
     * Optional deployment parameters that control how many tasks run during the deployment and the ordering of stopping
     * and starting tasks.
     * </p>
     * 
     * @param deploymentConfiguration
     *        Optional deployment parameters that control how many tasks run during the deployment and the ordering of
     *        stopping and starting tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceRequest withDeploymentConfiguration(DeploymentConfiguration deploymentConfiguration) {
        setDeploymentConfiguration(deploymentConfiguration);
        return this;
    }

    /**
     * <p>
     * The network configuration for the service. This parameter is required for task definitions that use the
     * <code>awsvpc</code> network mode to receive their own Elastic Network Interface, and it is not supported for
     * other network modes. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task Networking</a> in the
     * <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * Updating a service to add a subnet to a list of existing subnets does not trigger a service deployment. For
     * example, if your network configuration change is to keep the existing subnets and simply add another subnet to
     * the network configuration, this does not trigger a new service deployment.
     * </p>
     * </note>
     * 
     * @param networkConfiguration
     *        The network configuration for the service. This parameter is required for task definitions that use the
     *        <code>awsvpc</code> network mode to receive their own Elastic Network Interface, and it is not supported
     *        for other network modes. For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task Networking</a>
     *        in the <i>Amazon Elastic Container Service Developer Guide</i>.</p> <note>
     *        <p>
     *        Updating a service to add a subnet to a list of existing subnets does not trigger a service deployment.
     *        For example, if your network configuration change is to keep the existing subnets and simply add another
     *        subnet to the network configuration, this does not trigger a new service deployment.
     *        </p>
     */

    public void setNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
    }

    /**
     * <p>
     * The network configuration for the service. This parameter is required for task definitions that use the
     * <code>awsvpc</code> network mode to receive their own Elastic Network Interface, and it is not supported for
     * other network modes. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task Networking</a> in the
     * <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * Updating a service to add a subnet to a list of existing subnets does not trigger a service deployment. For
     * example, if your network configuration change is to keep the existing subnets and simply add another subnet to
     * the network configuration, this does not trigger a new service deployment.
     * </p>
     * </note>
     * 
     * @return The network configuration for the service. This parameter is required for task definitions that use the
     *         <code>awsvpc</code> network mode to receive their own Elastic Network Interface, and it is not supported
     *         for other network modes. For more information, see <a
     *         href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task
     *         Networking</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.</p> <note>
     *         <p>
     *         Updating a service to add a subnet to a list of existing subnets does not trigger a service deployment.
     *         For example, if your network configuration change is to keep the existing subnets and simply add another
     *         subnet to the network configuration, this does not trigger a new service deployment.
     *         </p>
     */

    public NetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    /**
     * <p>
     * The network configuration for the service. This parameter is required for task definitions that use the
     * <code>awsvpc</code> network mode to receive their own Elastic Network Interface, and it is not supported for
     * other network modes. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task Networking</a> in the
     * <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * Updating a service to add a subnet to a list of existing subnets does not trigger a service deployment. For
     * example, if your network configuration change is to keep the existing subnets and simply add another subnet to
     * the network configuration, this does not trigger a new service deployment.
     * </p>
     * </note>
     * 
     * @param networkConfiguration
     *        The network configuration for the service. This parameter is required for task definitions that use the
     *        <code>awsvpc</code> network mode to receive their own Elastic Network Interface, and it is not supported
     *        for other network modes. For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task Networking</a>
     *        in the <i>Amazon Elastic Container Service Developer Guide</i>.</p> <note>
     *        <p>
     *        Updating a service to add a subnet to a list of existing subnets does not trigger a service deployment.
     *        For example, if your network configuration change is to keep the existing subnets and simply add another
     *        subnet to the network configuration, this does not trigger a new service deployment.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceRequest withNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        setNetworkConfiguration(networkConfiguration);
        return this;
    }

    /**
     * <p>
     * The platform version you want to update your service to run.
     * </p>
     * 
     * @param platformVersion
     *        The platform version you want to update your service to run.
     */

    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
    }

    /**
     * <p>
     * The platform version you want to update your service to run.
     * </p>
     * 
     * @return The platform version you want to update your service to run.
     */

    public String getPlatformVersion() {
        return this.platformVersion;
    }

    /**
     * <p>
     * The platform version you want to update your service to run.
     * </p>
     * 
     * @param platformVersion
     *        The platform version you want to update your service to run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceRequest withPlatformVersion(String platformVersion) {
        setPlatformVersion(platformVersion);
        return this;
    }

    /**
     * <p>
     * Whether or not to force a new deployment of the service.
     * </p>
     * 
     * @param forceNewDeployment
     *        Whether or not to force a new deployment of the service.
     */

    public void setForceNewDeployment(Boolean forceNewDeployment) {
        this.forceNewDeployment = forceNewDeployment;
    }

    /**
     * <p>
     * Whether or not to force a new deployment of the service.
     * </p>
     * 
     * @return Whether or not to force a new deployment of the service.
     */

    public Boolean getForceNewDeployment() {
        return this.forceNewDeployment;
    }

    /**
     * <p>
     * Whether or not to force a new deployment of the service.
     * </p>
     * 
     * @param forceNewDeployment
     *        Whether or not to force a new deployment of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceRequest withForceNewDeployment(Boolean forceNewDeployment) {
        setForceNewDeployment(forceNewDeployment);
        return this;
    }

    /**
     * <p>
     * Whether or not to force a new deployment of the service.
     * </p>
     * 
     * @return Whether or not to force a new deployment of the service.
     */

    public Boolean isForceNewDeployment() {
        return this.forceNewDeployment;
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
        if (getCluster() != null)
            sb.append("Cluster: ").append(getCluster()).append(",");
        if (getService() != null)
            sb.append("Service: ").append(getService()).append(",");
        if (getDesiredCount() != null)
            sb.append("DesiredCount: ").append(getDesiredCount()).append(",");
        if (getTaskDefinition() != null)
            sb.append("TaskDefinition: ").append(getTaskDefinition()).append(",");
        if (getDeploymentConfiguration() != null)
            sb.append("DeploymentConfiguration: ").append(getDeploymentConfiguration()).append(",");
        if (getNetworkConfiguration() != null)
            sb.append("NetworkConfiguration: ").append(getNetworkConfiguration()).append(",");
        if (getPlatformVersion() != null)
            sb.append("PlatformVersion: ").append(getPlatformVersion()).append(",");
        if (getForceNewDeployment() != null)
            sb.append("ForceNewDeployment: ").append(getForceNewDeployment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateServiceRequest == false)
            return false;
        UpdateServiceRequest other = (UpdateServiceRequest) obj;
        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getService() == null ^ this.getService() == null)
            return false;
        if (other.getService() != null && other.getService().equals(this.getService()) == false)
            return false;
        if (other.getDesiredCount() == null ^ this.getDesiredCount() == null)
            return false;
        if (other.getDesiredCount() != null && other.getDesiredCount().equals(this.getDesiredCount()) == false)
            return false;
        if (other.getTaskDefinition() == null ^ this.getTaskDefinition() == null)
            return false;
        if (other.getTaskDefinition() != null && other.getTaskDefinition().equals(this.getTaskDefinition()) == false)
            return false;
        if (other.getDeploymentConfiguration() == null ^ this.getDeploymentConfiguration() == null)
            return false;
        if (other.getDeploymentConfiguration() != null && other.getDeploymentConfiguration().equals(this.getDeploymentConfiguration()) == false)
            return false;
        if (other.getNetworkConfiguration() == null ^ this.getNetworkConfiguration() == null)
            return false;
        if (other.getNetworkConfiguration() != null && other.getNetworkConfiguration().equals(this.getNetworkConfiguration()) == false)
            return false;
        if (other.getPlatformVersion() == null ^ this.getPlatformVersion() == null)
            return false;
        if (other.getPlatformVersion() != null && other.getPlatformVersion().equals(this.getPlatformVersion()) == false)
            return false;
        if (other.getForceNewDeployment() == null ^ this.getForceNewDeployment() == null)
            return false;
        if (other.getForceNewDeployment() != null && other.getForceNewDeployment().equals(this.getForceNewDeployment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode());
        hashCode = prime * hashCode + ((getService() == null) ? 0 : getService().hashCode());
        hashCode = prime * hashCode + ((getDesiredCount() == null) ? 0 : getDesiredCount().hashCode());
        hashCode = prime * hashCode + ((getTaskDefinition() == null) ? 0 : getTaskDefinition().hashCode());
        hashCode = prime * hashCode + ((getDeploymentConfiguration() == null) ? 0 : getDeploymentConfiguration().hashCode());
        hashCode = prime * hashCode + ((getNetworkConfiguration() == null) ? 0 : getNetworkConfiguration().hashCode());
        hashCode = prime * hashCode + ((getPlatformVersion() == null) ? 0 : getPlatformVersion().hashCode());
        hashCode = prime * hashCode + ((getForceNewDeployment() == null) ? 0 : getForceNewDeployment().hashCode());
        return hashCode;
    }

    @Override
    public UpdateServiceRequest clone() {
        return (UpdateServiceRequest) super.clone();
    }

}
