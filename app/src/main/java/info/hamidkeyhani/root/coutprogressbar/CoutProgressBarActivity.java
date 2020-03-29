package info.hamidkeyhani.root.coutprogressbar;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.multidex.MultiDex;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CoutProgressBarActivity extends AppCompatActivity implements View.OnClickListener {

    private CoutProgressBar coutProgressBar;

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(newBase);
        MultiDex.install(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cout_progress_bar);

        // init views
        ConstraintLayout layout = findViewById(R.id.layout);
        Button show = findViewById(R.id.show);
        Button dismiss = findViewById(R.id.dismis);
        Button change_color = findViewById(R.id.change_color);
        Button speed = findViewById(R.id.speed);

        coutProgressBar = new CoutProgressBar(layout, this);

        show.setOnClickListener(this);
        change_color.setOnClickListener(this);
        dismiss.setOnClickListener(this);
        speed.setOnClickListener(this);
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
            case R.id.speed:
                coutProgressBar.enCreaseSpeed(2);
                break;
        }
    }
}
