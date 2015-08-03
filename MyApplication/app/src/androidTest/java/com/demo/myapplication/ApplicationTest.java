package com.demo.myapplication;

import android.test.ActivityInstrumentationTestCase2;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ActivityInstrumentationTestCase2<MainActivity> {

    MainActivity mainActivity;

    public ApplicationTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        mainActivity = getActivity();
    }

    public void testPreconditions() {
        assertEquals(1, 1);
    }

    public void testPreconditions2() {
        assertEquals(1, 1);
    }

}