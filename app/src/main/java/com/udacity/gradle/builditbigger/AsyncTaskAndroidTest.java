package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.test.InstrumentationTestCase;
import android.util.Log;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * Created by shivam on 7/21/15.
 */
public class AsyncTaskAndroidTest extends InstrumentationTestCase implements AsyncResponse {
    CountDownLatch latch;
    EndpointsAsyncTask servletPostAsyncTask;
    Context context;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        latch = new CountDownLatch(1);
        context = getInstrumentation().getTargetContext();
        servletPostAsyncTask = new EndpointsAsyncTask();
    }

    public void testVerifyAsyncTaskResponse() throws Throwable {
        runTestOnUiThread(new Runnable() {
                              @Override
                              public void run() {
                                  servletPostAsyncTask.execute();
                                  try {
                                      latch.await(30, TimeUnit.SECONDS);
                                  } catch (InterruptedException e) {
                                      e.printStackTrace();
                                  }
                              }
                          }
        );
    }

    @Override
    public void processFinish(String output) throws IOException {
        Log.d(getClass().getSimpleName(), "Joke : " + output);
        if (output.equals("")) {
            assertTrue(false);
        } else {
            assertTrue(true);
        }
        latch.countDown();
    }
}