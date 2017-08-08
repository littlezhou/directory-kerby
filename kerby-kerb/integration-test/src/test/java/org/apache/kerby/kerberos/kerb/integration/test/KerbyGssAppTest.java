/**
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 */
package org.apache.kerby.kerberos.kerb.integration.test;

import org.apache.kerby.kerberos.kerb.gss.KerbyGssProvider;
import org.junit.Before;
import org.junit.Test;

import java.security.Provider;

public class KerbyGssAppTest extends GssAppTest {
    private int option = 0;  // 0 - all_jdk; 1 - client_jdk ; 2 - server_jdk; 3 - non_jdk

    @Before
    @Override
    public void setUp() throws Exception {
//        Provider provider = new KerbyGssProvider();
//        java.security.Security.insertProviderAt(provider, 1);
        super.setUp();
    }

    @Test
    public void mytest() throws Exception {
        Provider provider = new KerbyGssProvider();
        java.security.Security.insertProviderAt(provider, 1);
//        Provider provider = new KerbyGssProvider();
//        java.security.Security.removeProvider(provider.getName());
        super.test();
    }

    private void deployProvider() {

    }

}
