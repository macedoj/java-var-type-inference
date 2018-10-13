/*
  The MIT License

  Copyright 2018, Juliano Macedo.
  See LICENSE file for details.
 */



import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;

/**
 * <p>
 *
 * </p>
 *
 * @author Juliano Macedo < @macedoj at GitHub >
 * @version 0.2
 */
public class LocalVariableTypeInference {

    public Optional<ArrayList> localVariableTypeInferenceArrayList() {
        var list = new ArrayList<String>();  // infers ArrayList<String>

        return Optional.of(list);
    }

    public Optional<HashMap> localVariableTypeInferenceHashMap() {
        var hashMap = new HashMap<String, String>();  // infers HashMap<String, String>

        return Optional.of(hashMap);
    }

    public Optional<StringBuilder> localVariableTypeInferenceStringBuilder() {
        var stringBuilder = new StringBuilder();  // infers StringBuilder()

        return Optional.of(stringBuilder);
    }

    public Optional<Integer> localVariableTypeInferenceInteger() {
        var intInference = 10;

        return Optional.of(intInference);
    }

}
