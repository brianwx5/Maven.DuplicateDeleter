package com.zipcodewilmington.looplabs;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        Stream<String> stringStream = Arrays.stream(array).filter(string -> counter(string) < maxNumberOfDuplications);
        String[] arrayWithoutDuplicates = stringStream.toArray(String[]::new);
        return arrayWithoutDuplicates;
    }

    public Integer counter(String string) {
        int counter = 0;
        for (String word: array) {
            if(word.equals(string)) {
                counter++;
            }
        } return counter;
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Stream<String> stringStream = Arrays.stream(array).filter(string -> counter(string) != exactNumberOfDuplications);
        String[] arrayWithoutDuplicates = stringStream.toArray(String[]::new);
        return arrayWithoutDuplicates;
    }
}
