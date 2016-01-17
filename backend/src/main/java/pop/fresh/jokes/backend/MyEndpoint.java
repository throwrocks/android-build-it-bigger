/*
   For step-by-step instructions on connecting your Android application to this backend module,
   see "App Engine Java Endpoints Module" template documentation at
   https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints
*/

package pop.fresh.jokes.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.udacity.gradle.jokes.Joker;

import javax.inject.Named;

/** An endpoint class we are exposing */
@Api(
  name = "myApi",
  version = "v1",
  namespace = @ApiNamespace(
    ownerDomain = "backend.jokes.fresh.pop",
    ownerName = "backend.jokes.fresh.pop",
    packagePath=""
  )
)
public class MyEndpoint {

    /** A simple endpoint method that gets a joke from the jokes lib and returns it*/
    @ApiMethod(name = "tellJoke")
    public MyBean tellJoke() {

        // Get a joke
        Joker newJoke = new Joker();
        String joke = newJoke.getJoke();

        MyBean response = new MyBean();
        response.setData(joke);
        return response;
    }

}
