package com.udacity.gradle.builditbigger;

import java.io.IOException;

/**
 * Created by josel on 12/27/2015.
 */
// AsyncResponse interface
public interface AsyncResponse {
    void processFinish(String output) throws IOException;
}