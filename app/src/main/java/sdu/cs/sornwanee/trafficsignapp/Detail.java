package sdu.cs.sornwanee.trafficsignapp;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.CaseMap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {

    //Ex[licit
    TextView titleTextview,detailTextview;
    ImageView iconImageView;
    Button backButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        // `ผูกตัวแปล จาวา กับ เอกเอมเอล
        titleTextview = findViewById(R.id.tvtitle);
        detailTextview = findViewById(R.id.tvdetail);
        iconImageView = findViewById(R.id.imvIcon);
        backButton = findViewById(R.id.btback);

        titleTextview.setText(getIntent().getStringExtra("Title"));
        detailTextview.setText(getIntent().getStringExtra("Detail"));
        iconImageView.setImageResource(getIntent().getIntExtra("Icon",R.drawable.traffic_01));

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    

    }// end method



}// end class
