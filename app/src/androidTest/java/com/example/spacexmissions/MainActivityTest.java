package com.example.spacexmissions;

import android.content.Context;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.rule.ActivityTestRule;

import com.example.spacexmissions.views.MainActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static java.lang.Thread.sleep;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testLoadingButtonIsDisplayed() {
        onView(withId(R.id.reload))
                .check(matches(isDisplayed()));
        assert(true);
    }

    @Test
    public void testButtonLoadsCard() throws InterruptedException{

        sleep(1000);

        onView(withId(R.id.reload)) //tries to load new mission card
                .perform(click());

        sleep(1200); //sleep to get it loaded in case the network is slow

        onView(withId(R.id.parent_layout))
                .check(matches(withId(R.id.parent_layout)));

        onView(withId(R.id.mission_patch_small))
                .check(matches(withId(R.id.mission_patch_small)));

        assert true;

    }

    @Test
    public void onListItemClick() throws InterruptedException {

        sleep(1000);


        onView(withId(R.id.reload)) //tries to load new mission card
                .perform(click());

        sleep(1200); //sleep to get it loaded in case the network is slow

        onView(withId(R.id.parent_layout))
                .check(matches(withId(R.id.parent_layout)));

        onView(withId(R.id.mission_patch_small))
                .check(matches(withId(R.id.mission_patch_small)));

        sleep(1000);

        onView(withId(R.id.parent_layout))
                .perform(click());

        onView(withId(R.id.details_layout))
                .check(matches(withId(R.id.details_layout)));

        assert true;
    }

    //ONLY PASSES IF THE MISSION HAS A LAUNCH SITE PROVIDED. SOME MISSIONS DO NOT HAVE THIS VALUE
    @Test
    public void onLaunchSiteClick() throws InterruptedException {

        sleep(1000);

        onView(withId(R.id.reload)) //tries to load new mission card
                .perform(click());

        sleep(1200); //sleep to get it loaded in case the network is slow

        onView(withId(R.id.parent_layout))
                .check(matches(withId(R.id.parent_layout)));

        onView(withId(R.id.mission_patch_small))
                .check(matches(withId(R.id.mission_patch_small)));

        sleep(1000);

        onView(withId(R.id.parent_layout))
                .perform(click());

        onView(withId(R.id.details_layout))
                .check(matches(withId(R.id.details_layout)));

        onView(withId(R.id.launch_site))
                .perform(click());

        onView(withId(R.id.map))
                .check(matches(withId(R.id.map)));

        assert true;
    }

    @Test
    public void checkAppContext() {
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();

        assertEquals("com.example.spacexmissions", appContext.getPackageName());
    }
}