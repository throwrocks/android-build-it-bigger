package pop.nfresh.jokes_activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;


/**
 * Created by JoseE on 12/13/2015.
 */
public class JokesActivity extends AppCompatActivity{


    @Override
    protected void onStart() {

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String joke = bundle.getString("joke");

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, joke, duration);
        toast.show();

        super.onStart();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}
