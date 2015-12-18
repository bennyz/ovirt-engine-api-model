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

package org.ovirt.api.metamodel.concepts;

/**
 * This class represents a single value of an enumerated type.
 */
public class EnumValue extends Concept {
    // Reference to the type that declared this attribute:
    private EnumType declaringType;

    /**
     * Returns the enumerated type where this value is declared.
     */
    public EnumType getDeclaringType() {
        return declaringType;
    }

    /**
     * Sets the enumerated type where this value is declared.
     */
    public void setDeclaringType(EnumType newDeclaringType) {
        declaringType = newDeclaringType;
    }
}

