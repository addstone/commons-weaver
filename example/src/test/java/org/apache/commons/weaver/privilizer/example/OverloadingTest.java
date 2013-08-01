/*
 *  Copyright the original author or authors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.apache.commons.weaver.privilizer.example;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class OverloadingTest {
    private Overloading overloading;

    @Before
    public void setUp() throws Exception {
        Setup.setProperty("foo", "foo-value");
        Setup.setProperty("bar", "bar-value");
        Setup.setProperty("baz", "baz-value");
        overloading = new Overloading();
    }

    @Test
    public void testNoArgs() {
        assertEquals("foo-value", overloading.get());
    }

    @Test
    public void testStringArg() {
        assertEquals("bar-value", overloading.get("bar"));
    }

    @Test
    public void testCharishArgs() {
        assertEquals("baz-value", overloading.get('b', 'a', (short) 'z'));
    }
}
