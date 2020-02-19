package com.moonpi.swiftnotes;

import android.support.test.rule.ActivityTestRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withHint;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.CoreMatchers.allOf;

public class SimpleTest {
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void onClick() throws Exception {
        onView(withId(R.id.newNote)).perform(click());
        onView(allOf(withId(R.id.titleEdit), withHint("Title"))).check(matches(isDisplayed()));
        onView(allOf(withId(R.id.bodyEdit), withHint("Note"))).check(matches(isDisplayed()));
    }
}

