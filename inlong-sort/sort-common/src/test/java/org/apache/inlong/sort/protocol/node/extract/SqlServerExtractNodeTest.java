/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.apache.inlong.sort.protocol.node.extract;

import org.apache.inlong.sort.SerializeBaseTest;
import org.apache.inlong.sort.formats.common.LongFormatInfo;
import org.apache.inlong.sort.formats.common.StringFormatInfo;
import org.apache.inlong.sort.protocol.FieldInfo;

import java.util.Arrays;
import java.util.List;

/**
 * Test for {@link SqlServerExtractNode} serialize
 */
public class SqlServerExtractNodeTest extends SerializeBaseTest<SqlServerExtractNode> {

    @Override
    public SqlServerExtractNode getTestObject() {
        List<FieldInfo> fields = Arrays.asList(new FieldInfo("id", new LongFormatInfo()),
                new FieldInfo("val_char", new StringFormatInfo()));
        return new SqlServerExtractNode("1", "sqlserver_out", fields,
                null, null, null,
                "localhost", 1433, "SA",
                "INLONG*123", "column_type_test",
                "dbo", "full_types", null);
    }
}
