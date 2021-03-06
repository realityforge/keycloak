/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.keycloak.storage.federated;

import org.keycloak.common.util.MultivaluedHashMap;
import org.keycloak.models.RealmModel;
import org.keycloak.models.UserModel;

import java.util.List;
import java.util.Map;

/**
 * @author <a href="mailto:bill@burkecentral.com">Bill Burke</a>
 * @version $Revision: 1 $
 */
public interface UserAttributeFederatedStorage {
    void setSingleAttribute(RealmModel realm, UserModel user, String name, String value);
    void setAttribute(RealmModel realm, UserModel user, String name, List<String> values);
    void removeAttribute(RealmModel realm, UserModel user, String name);
    MultivaluedHashMap<String, String> getAttributes(RealmModel realm, UserModel user);
}
