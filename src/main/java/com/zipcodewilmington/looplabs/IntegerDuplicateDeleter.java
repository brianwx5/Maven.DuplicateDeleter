package com.zipcodewilmington.looplabs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.stream.Stream;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        Stream<Integer> duplicateRemoved = Arrays.stream(array).filter(integer ->
                counter(integer) < maxNumberOfDuplications);
        Integer[] arrayWithoutDups = duplicateRemoved.toArray(Integer[]::new);
        return  arrayWithoutDups;

    }

    public Integer counter(Integer integer) {
        Integer counter = 0;
        for (Integer number :array) {
            if(number.equals(integer)){
                counter++;
            }
        }
        return  counter;
    }


    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Stream<Integer> duplicateRemoved = Arrays.stream(array).filter(integer ->
                counter(integer) != exactNumberOfDuplications);
        Integer[] arrayWithoutDups = duplicateRemoved.toArray(Integer[]::new);
        return  arrayWithoutDups;
    }
}
