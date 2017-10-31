package com.alexolmedo.buttonclickcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText userInput;
    private Button button;
    private TextView textView;
    private int numTimesClicked = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userInput = (EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);
        textView.setText("");
        textView.setMovementMethod(new ScrollingMovementMethod());
        View.OnClickListener ourOnClickedListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numTimesClicked = numTimesClicked +1;
                String result = "El botón fue presionado " + numTimesClicked;
                if (numTimesClicked == 1){
                    result += " vez.\n";
                } else {
                    result += " veces.\n";
                }
                textView.append(result);

            }
        };
        button.setOnClickListener(ourOnClickedListener);
    }
}
