package id.co.muf.okta.androidpemulacourse.viewgroup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import id.co.muf.okta.androidpemulacourse.R;

public class ViewGroupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_group);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Google Pixel");
        }
    }
}
