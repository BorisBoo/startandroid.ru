package ru.borisstartandroid.onclickbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button btnOk;
    Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find View elements
        textView = (TextView) findViewById(R.id.tvOut);
        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Нажата кнопка Ок");
            }
        };

        btnOk.setOnClickListener(listener);

        View.OnClickListener cancselListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Cancel");
            }
        };

        btnCancel.setOnClickListener(cancselListener);


    }
}
