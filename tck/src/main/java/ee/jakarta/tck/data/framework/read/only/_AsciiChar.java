/*
 * Copyright (c) 2023,2024 Contributors to the Eclipse Foundation
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */
package ee.jakarta.tck.data.framework.read.only;

import jakarta.data.metamodel.Attribute;
import jakarta.data.metamodel.SortableAttribute;
import jakarta.data.metamodel.StaticMetamodel;
import jakarta.data.metamodel.TextAttribute;

/**
 * This static metamodel class tests what a user might explicitly provide,
 * in which case the Jakarta Data provider will need to initialize the attributes.
 */
@StaticMetamodel(AsciiCharacter.class)
public class _AsciiChar {
    public static final String ID = "id";
    public static final String HEXADECIMAL = "hexadecimal";
    public static final String NUMERICVALUE = "numericValue";

    public static volatile SortableAttribute<AsciiCharacter> id;
    public static volatile TextAttribute<AsciiCharacter> hexadecimal;
    public static volatile Attribute<AsciiCharacter> isControl; // user decided it didn't care about sorting for this one
    public static volatile SortableAttribute<AsciiCharacter> numericValue;
    public static volatile TextAttribute<AsciiCharacter> thisCharacter;

    // Avoids the checkstyle error,
    // HideUtilityClassConstructor: Utility classes should not have a public or default constructor
    private _AsciiChar() {
    }
}
