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

package io.microsphere.alibaba.sentinel.spring.boot.autoconfigure;


import io.microsphere.alibaba.sentinel.alibaba.druid.SentinelAlibabaDruidFilter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.autoconfigure.AutoConfigurations.of;

/**
 * {@link SentinelAlibabaDruidAutoConfiguration} Test
 *
 * @author <a href="mailto:mercyblitz@gmail.com">Mercy</a>
 * @see SentinelAlibabaDruidAutoConfiguration
 * @since 1.0.0
 */
class SentinelAlibabaDruidAutoConfigurationTest {

    ApplicationContextRunner applicationContextRunner;

    @BeforeEach
    void setUp() {
        this.applicationContextRunner = new ApplicationContextRunner()
                .withConfiguration(of(SentinelAlibabaDruidAutoConfiguration.class));
    }

    @Test
    void testDefaults() {
        this.applicationContextRunner.run(context -> {
            assertThat(context).hasSingleBean(SentinelAlibabaDruidAutoConfiguration.class)
                    .hasSingleBean(SentinelAlibabaDruidFilter.class);
        });
    }

    @Test
    void testDisabledProperty() {
        assertDisabledProperty("microsphere.sentinel.enabled=false");
    }

    void assertDisabledProperty(String... propertyValues) {
        this.applicationContextRunner.withPropertyValues(propertyValues)
                .run(context -> {
                    assertThat(context).doesNotHaveBean(SentinelAlibabaDruidAutoConfiguration.class)
                            .doesNotHaveBean(SentinelAlibabaDruidFilter.class);
                });
    }
}