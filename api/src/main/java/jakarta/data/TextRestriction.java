/*
 * Copyright (c) 2024 Contributors to the Eclipse Foundation
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
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package jakarta.data;

public interface TextRestriction<T> extends BasicRestriction<T> {
    TextRestriction<T> ignoreCase();

    // TODO can mention in the JavaDoc that a value of true will be ignored
    // if the database is not not capable of case sensitive comparisons
    boolean isCaseSensitive();

    boolean isEscaped();

    @Override
    TextRestriction<T> negate();

    @Override
    String value();
}
