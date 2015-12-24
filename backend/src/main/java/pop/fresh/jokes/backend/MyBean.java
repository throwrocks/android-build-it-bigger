package pop.fresh.jokes.backend;

import com.udacity.gradle.jokes.Joker;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private String myData;

    public String getData() {
        return myData;
    }

    public void setData(String data) {
        myData = data;
    }

    /**
     * getJoke
     * This method returns a joke from the Joker Class
     * @return the joke
     */
    public String getJoke(){
        // Get a joke
        Joker newJoke = new Joker();
        String joke = newJoke.getJoke();
        return joke;
    }
}