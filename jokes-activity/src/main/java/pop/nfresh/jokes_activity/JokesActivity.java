package pop.nfresh.jokes_activity;

import com.udacity.gradle.jokes.Joker;


/**
 * Created by JoseE on 12/13/2015.
 */
public class JokesActivity {


    public String getJoke(){

        Joker newJoke = new Joker();
        String joke = newJoke.getJoke();
        return joke;

    }


}
