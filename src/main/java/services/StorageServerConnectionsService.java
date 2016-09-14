/*
Copyright (c) 2015 Red Hat, Inc.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package services;

import annotations.Area;
import org.ovirt.api.metamodel.annotations.In;
import org.ovirt.api.metamodel.annotations.Out;
import org.ovirt.api.metamodel.annotations.Service;
import types.StorageConnection;

@Service
@Area("Storage")
public interface StorageServerConnectionsService {
    /**
     * Creates a new storage connection.
     *
     * For example, to create a new storage connection for the NFS server `mynfs.example.com` and NFS share
     * `/export/mydata` send a request like this:
     *
     * [source]
     * ----
     * POST /ovirt-engine/api/storageconnections
     * ----
     *
     * With a request body like this:
     *
     * [source,xml]
     * ----
     * <storage_connection>
     *   <type>nfs</type>
     *   <address>mynfs.example.com</address>
     *   <path>/export/mydata</path>
     *   <host>
     *     <name>myhost</name>
     *   </host>
     * </storage_connection>
     * ----
     *
     * @author Daniel Erez <derez@redhat.com>
     * @date 14 Sep 2016
     * @status added
     */
    interface Add {
        @In @Out StorageConnection connection();
    }

    interface List {
        @Out StorageConnection[] connections();

        /**
         * Sets the maximum number of connections to return. If not specified all the connections are returned.
         */
        @In Integer max();
    }

    @Service StorageServerConnectionService storageConnection(String id);
}
