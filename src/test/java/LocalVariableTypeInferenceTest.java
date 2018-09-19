/*
 * The MIT License
 *
 * Copyright 2018, Juliano Macedo.
 * See LICENSE file for details.
 *
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;

import static org.hamcrest.Matchers.instanceOf;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.hamcrest.MatcherAssert.assertThat;

class LocalVariableTypeInferenceTest {

    private LocalVariableTypeInference variableTypeInference;

    @BeforeEach
    void setUp() {
        variableTypeInference = new LocalVariableTypeInference();
    }

    @Test
    void localVariableTypeInferenceArrayList() {

        Optional<?> optional = variableTypeInference.localVariableTypeInferenceArrayList();
        var someObject = optional.isPresent() ? optional.get() : Optional.empty();

        assertAll("localVariableTypeInference",
                () -> assertThat(someObject, instanceOf(ArrayList.class)),
                () -> assertNotEquals(someObject, null)
        );
    }

    @Test
    void localVariableTypeInferenceHashMap() {
        Optional<?> optional = variableTypeInference.localVariableTypeInferenceHashMap();
        var someObject = optional.isPresent() ? optional.get() : Optional.empty();

        assertAll("localVariableTypeInferenceStream",
                () -> assertThat(someObject, instanceOf(HashMap.class)),
                () -> assertNotEquals(someObject, null)
        );

    }

    @Test
    void localVariableTypeInferenceStringBuilder() {
        Optional<?> optional = variableTypeInference.localVariableTypeInferenceStringBuilder();
        var someObject = optional.isPresent() ? optional.get() : Optional.empty();

        assertAll("localVariableTypeInferenceIterator",
                () -> assertThat(someObject, instanceOf(StringBuilder.class)),
                () -> assertNotEquals(someObject, null)
        );
    }
}