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

/**
 * <fullname>AWS Marketplace Metering Service</fullname>
 * <p>
 * This reference provides descriptions of the low-level AWS Marketplace Metering Service API.
 * </p>
 * <p>
 * AWS Marketplace sellers can use this API to submit usage data for custom usage dimensions.
 * </p>
 * <p>
 * <b>Submitting Metering Records</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <i>MeterUsage</i>- Submits the metering record for a Marketplace product. MeterUsage is called from an EC2 instance.
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>BatchMeterUsage</i>- Submits the metering record for a set of customers. BatchMeterUsage is called from a
 * software-as-a-service (SaaS) application.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Accepting New Customers</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <i>ResolveCustomer</i>- Called by a SaaS application during the registration process. When a buyer visits your
 * website during the registration process, the buyer submits a Registration Token through the browser. The Registration
 * Token is resolved through this API to obtain a CustomerIdentifier and Product Code.
 * </p>
 * </li>
 * </ul>
 */
package com.amazonaws.services.marketplacemetering;

