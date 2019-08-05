package id.co.muf.okta.androidpemulacourse.home;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import id.co.muf.okta.androidpemulacourse.R;
import id.co.muf.okta.androidpemulacourse.hitung.MainActivity;
import id.co.muf.okta.androidpemulacourse.intent.IntentActivity;
import id.co.muf.okta.androidpemulacourse.intent.MoveActivity;
import id.co.muf.okta.androidpemulacourse.intent.MoveWithDataActivity;
import id.co.muf.okta.androidpemulacourse.recycleview.activity.RecycleViewActivity;
import id.co.muf.okta.androidpemulacourse.viewgroup.ViewGroupActivity;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Button btnCalculates = findViewById(R.id.btn_calculatess);
        btnCalculates.setOnClickListener(this);

        Button btnIntent = findViewById(R.id.btn_intent);
        btnIntent.setOnClickListener(this);

        Button btnViewGroup = findViewById(R.id.btn_viewgrup);
        btnViewGroup.setOnClickListener(this);

        Button btnRecycleview = findViewById(R.id.btn_rcyleview);
        btnRecycleview.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_calculatess:
                Intent calc = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(calc);
                break;

            case R.id.btn_intent:
                Intent inte = new Intent(HomeActivity.this, IntentActivity.class);
                startActivity(inte);
                break;

            case R.id.btn_viewgrup:
                Intent viewgrup = new Intent(HomeActivity.this, ViewGroupActivity.class);
                startActivity(viewgrup);
                break;

            case R.id.btn_rcyleview:
                Intent rv = new Intent(HomeActivity.this, RecycleViewActivity.class);
                startActivity(rv);
                break;
        }
    }
}
