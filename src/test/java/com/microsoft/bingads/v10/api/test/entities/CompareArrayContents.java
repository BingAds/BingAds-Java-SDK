package com.microsoft.bingads.v10.api.test.entities;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class CompareArrayContents extends TypeSafeMatcher<Object[]> {

    List<Object> objs;

    private static Comparator<Object> UseEquals = new Comparator<Object>() {

        @Override
        public int compare(Object o1, Object o2) {
            return o1.equals(o2) ? 0 : -1;
        }
    };

    public CompareArrayContents(Object[] objs) {
        this.objs = Arrays.asList(objs);
        Collections.sort(this.objs, UseEquals);
    }

    @Override
    public void describeTo(Description desc) {
        desc.appendText("Two arrays contains different values. Should have contained: " + this.objs);
    }

    @Override
    protected boolean matchesSafely(Object[] inputs) {
        if (inputs.length != this.objs.size()) {
            return false;
        }

        Arrays.sort(inputs, UseEquals);

        for (int i = 0; i < inputs.length; i++) {
            if (UseEquals.compare(inputs[i], this.objs.get(i)) == 0) {
                return false;
            }
        }

        return true;
    }

    @Factory
    public static <T> Matcher<Object[]> equalInValue(Object[] objs) {
        return new CompareArrayContents(objs);
    }

}
