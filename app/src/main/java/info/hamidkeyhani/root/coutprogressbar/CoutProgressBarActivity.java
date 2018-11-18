package info.hamidkeyhani.root.coutprogressbar;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class CoutProgressBarActivity extends AppCompatActivity {

    private ConstraintLayout layout;
    private Button show;
    private Button dismis;
    private CoutProgressBar coutProgressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cout_progress_bar);

        // init views
        layout = findViewById(R.id.layout);
        show = findViewById(R.id.show);
        dismis = findViewById(R.id.dismis);

        coutProgressBar = new CoutProgressBar(layout , this);

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                coutProgressBar.show();
            }
        });
        dismis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                coutProgressBar.dismis();
            }
        });


    }
}
