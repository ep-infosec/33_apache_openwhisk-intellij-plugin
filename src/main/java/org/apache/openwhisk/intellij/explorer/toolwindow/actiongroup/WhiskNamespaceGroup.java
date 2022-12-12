/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.openwhisk.intellij.explorer.toolwindow.actiongroup;

import com.intellij.openapi.actionSystem.DefaultActionGroup;
import org.apache.openwhisk.intellij.common.whisk.model.WhiskAuth;
import org.apache.openwhisk.intellij.common.whisk.model.WhiskEndpoint;
import org.apache.openwhisk.intellij.common.whisk.model.WhiskNamespace;
import org.apache.openwhisk.intellij.explorer.toolwindow.action.CreatePackageAction;
import org.apache.openwhisk.intellij.explorer.toolwindow.action.DeleteNamespaceAction;
import org.apache.openwhisk.intellij.explorer.toolwindow.action.EditNamespaceAction;
import org.apache.openwhisk.intellij.explorer.toolwindow.action.OpenActivationViewAction;

import java.util.List;
import java.util.Optional;

public class WhiskNamespaceGroup extends DefaultActionGroup {

    public WhiskNamespaceGroup(WhiskAuth whiskAuth, WhiskNamespace namespace, List<WhiskEndpoint> endpoints) {
        add(new EditNamespaceAction(whiskAuth, namespace));
        add(new DeleteNamespaceAction(namespace));
        add(new CreatePackageAction(whiskAuth));
        add(new OpenActivationViewAction(endpoints, Optional.of(whiskAuth), Optional.empty(), Optional.empty()));
    }
}
