/*
 * (c) Copyright 2018 Palantir Technologies Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.palantir.gradle.conjure;

import java.io.File;
import org.gradle.api.tasks.CacheableTask;

@CacheableTask
public class ConjureLocalGenerateTask extends ConjureGeneratorTask {

    @Override
    protected final File outputDirectoryFor(File file) {
        // Strip extension and version
        return new File(
                getOutputDirectory(),
                file.getName().substring(0, file.getName().lastIndexOf("-")));
    }
}
