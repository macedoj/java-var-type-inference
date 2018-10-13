# New features from Java 10 and 11
Code examples to demonstrate the new features from Java 10 and 11 release.

Develop:
[![Build Status](https://travis-ci.org/macedoj/java-new-features.svg?branch=develop)](https://travis-ci.org/macedoj/java-new-features)
[![Quality Gate](https://sonarcloud.io/api/project_badges/measure?project=macedoj_java-new-features&metric=alert_status)](https://sonarcloud.io/dashboard?id=macedoj_java-new-features)

Master:
[![Build Status](https://travis-ci.org/macedoj/java-new-features.svg?branch=master)](https://travis-ci.org/macedoj/java-new-features)

## New Features

### Local Variable Type Inference

The <code>LocalVariableTypeInference.java</code> class have some code examples to demonstrate 
the Java 10 capability to infer the local variable type.

### Code exemples:
```java
    var list = new ArrayList<String>();  // infers ArrayList<String>
```

```java
    var hashMap = new HashMap<String, String>();  // infers HashMap<String, String>
```

```java
    var stringBuilder = new StringBuilder();  // infers StringBuilder()
```

### Unit test

To ensure TypeInference from Java 10, the <code>LocalVariableTypeInference.java</code> class 
are fully reviewed by unit tests, that can be found in class <code>HaversineAlgorithmTest.java</code>.

#### Unit test example:
```java
    @Test
    void localVariableTypeInferenceArrayList() {

        var optional = variableTypeInference.localVariableTypeInferenceArrayList();
        var someObject = optional.isPresent() ? optional.get() : Optional.empty();

        assertAll("localVariableTypeInference",
                () -> assertTrue(someObject instanceof ArrayList),
                () -> assertNotEquals(someObject, null)
        );
    }
```

___
### Run the code

Just open a terminal and paste the commands below:

```gradle
    gradle clean build --stacktrace
```

#### For Intellij IDEA
```gradle
    gradle clean build cleanidea idea --stacktrace
```

#### For Eclipse IDE
```gradle
    gradle clean build cleaneclipse eclipse --stacktrace
```

___
**License**

[![License (MIT)](https://img.shields.io/badge/license-MIT-brightgreen.svg?style=flat-square)](http://opensource.org/licenses/MIT)

Copyright 2018, Juliano Macedo.
See LICENSE file for details.
