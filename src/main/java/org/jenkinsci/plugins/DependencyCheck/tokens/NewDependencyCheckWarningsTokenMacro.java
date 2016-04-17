/*
 * This file is part of Dependency-Check Jenkins plugin.
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
package org.jenkinsci.plugins.DependencyCheck.tokens;

import hudson.Extension;
import hudson.plugins.analysis.tokens.AbstractNewAnnotationsTokenMacro;
import org.jenkinsci.plugins.DependencyCheck.DependencyCheckResultAction;

/**
 * Provides a token that evaluates to the number of new Dependency-Check warnings.
 *
 * @author Steve Springett (steve.springett@owasp.org), based on NewPmdTokenMacro by Ulli Hafner
 */
@Extension(optional = true)
public class NewDependencyCheckWarningsTokenMacro extends AbstractNewAnnotationsTokenMacro {

    /**
     * Creates a new instance of {@link NewDependencyCheckWarningsTokenMacro}.
     */
    @SuppressWarnings("unchecked")
    public NewDependencyCheckWarningsTokenMacro() {
        super("DEPENDENCYCHECK_NEW", DependencyCheckResultAction.class);
    }

}


