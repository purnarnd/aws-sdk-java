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
package com.amazonaws.services.greengrass.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.greengrass.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateResourceDefinitionVersionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateResourceDefinitionVersionRequestMarshaller {

    private static final MarshallingInfo<String> AMZNCLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("X-Amzn-Client-Token").build();
    private static final MarshallingInfo<String> RESOURCEDEFINITIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("ResourceDefinitionId").build();
    private static final MarshallingInfo<List> RESOURCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Resources").build();

    private static final CreateResourceDefinitionVersionRequestMarshaller instance = new CreateResourceDefinitionVersionRequestMarshaller();

    public static CreateResourceDefinitionVersionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateResourceDefinitionVersionRequest createResourceDefinitionVersionRequest, ProtocolMarshaller protocolMarshaller) {

        if (createResourceDefinitionVersionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createResourceDefinitionVersionRequest.getAmznClientToken(), AMZNCLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(createResourceDefinitionVersionRequest.getResourceDefinitionId(), RESOURCEDEFINITIONID_BINDING);
            protocolMarshaller.marshall(createResourceDefinitionVersionRequest.getResources(), RESOURCES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
