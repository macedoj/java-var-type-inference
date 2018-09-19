/*
 * The MIT License
 *
 * Copyright 2018, Juliano Macedo.
 * See LICENSE file for details.
 * */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;

public class LocalVariableTypeInference {

    public Optional<?> localVariableTypeInferenceArrayList(){
        var list = new ArrayList<String>();  // infers ArrayList<String>

        return Optional.of(list);
    }

    public Optional<?> localVariableTypeInferenceHashMap(){
        var hashMap = new HashMap<String, String>();  // infers HashMap<String, String>

        return Optional.of(hashMap);
    }

    public Optional<?> localVariableTypeInferenceStringBuilder(){
        var stringBuilder = new StringBuilder();  // infers StringBuilder()

        return Optional.of(stringBuilder);
    }
}
