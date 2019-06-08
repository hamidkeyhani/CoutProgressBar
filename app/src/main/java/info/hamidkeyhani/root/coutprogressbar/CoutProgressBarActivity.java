package info.hamidkeyhani.root.coutprogressbar;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.multidex.MultiDex;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CoutProgressBarActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(newBase);
        MultiDex.install(this);
    }

    private CoutProgressBar coutProgressBar;
    private Button change_color;
    private Button dismiss;
    private Button show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cout_progress_bar);

        // init views
        ConstraintLayout layout = findViewById(R.id.layout);
        show = findViewById(R.id.show);
        dismiss = findViewById(R.id.dismis);
        change_color = findViewById(R.id.change_color);

        coutProgressBar = new CoutProgressBar(layout, this);

        show.setOnClickListener(this);
        change_color.setOnClickListener(this);
        dismiss.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.change_color:
                coutProgressBar.setColor(R.color.colorAccent);
                break;
            case R.id.show:
                coutProgressBar.show();
                break;
            case R.id.dismis:
                coutProgressBar.dismiss();
                break;
        }
    }
}
