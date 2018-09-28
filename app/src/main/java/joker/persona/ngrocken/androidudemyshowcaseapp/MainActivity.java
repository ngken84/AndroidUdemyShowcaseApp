package joker.persona.ngrocken.androidudemyshowcaseapp;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FrgTasks.OnFragmentInteractionListener {

    private FrgTasks taskFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        taskFragment = new FrgTasks();
        setUpFragment(taskFragment);

    }

    private void setUpFragment(Fragment fragment) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        if(fragment.isAdded()) {
            return;
        }
        ft.replace(R.id.main_fragment_cont, fragment);
        ft.commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
