/**
 * Copyright (c) 2014 Eclectic Logic LLC
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
package com.eclecticlogic.pedal.test.dm.dao;

import com.eclecticlogic.pedal.dm.DateTimeProvider;
import com.eclecticlogic.pedal.dm.TestableDAO;
import com.eclecticlogic.pedal.test.dm.Employee;

/**
 * @author kabram.
 *
 */
public class EmployeeDAO extends TestDAO<Employee, Integer> implements TestableDAO<Integer> {

    public EmployeeDAO() {
        super();
        setDateTimeProvider(new DateTimeProvider());
    }


    @Override
    public Class<Employee> getEntityClass() {
        return Employee.class;
    }


    @Override
    public Integer getPrototypicalPrimaryKey() {
        return 1;
    }
}
