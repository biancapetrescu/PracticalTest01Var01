package com.example.student.practicaltest01var01;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PracticalTest01Var01MainActivity extends Activity {

    private Button north = null;
    private Button south = null;
    private Button east = null;
    private Button west = null;
    public EditText editText = null;
    public EditText editText2 = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_var01_main);
        north = (Button)findViewById(R.id.north_button);
        south = (Button)findViewById(R.id.south_button);
        east = (Button)findViewById(R.id.east_button);
        west = (Button)findViewById(R.id.west_button);
        editText = (EditText)findViewById(R.id.edit_text);
        north.setOnClickListener(buttonClickListener);
        south.setOnClickListener(buttonClickListener);
        east.setOnClickListener(buttonClickListener);
        west.setOnClickListener(buttonClickListener);

        if (savedInstanceState != null) {
            if (savedInstanceState.containsKey("leftCount")) {
                editText2.setText(savedInstanceState.getString("leftCount"));
            } else {
                editText2.setText(String.valueOf(0));
            }

        } else {
            leftEditText.setText(String.valueOf(0));
            rightEditText.setText(String.valueOf(0));
        }

    }

    private ButtonClickListener buttonClickListener = new ButtonClickListener();
    private class ButtonClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            String s = "";
            switch(view.getId()) {
                case R.id.north_button:
                    if (s.compareTo("") != 0) {
                        s = s + ",North";
                        editText.setText(s);
                    }
                    else {
                        s = s + "North";
                        editText.setText(s);
                    }
                    break;
                case R.id.south_button:
                    if (s.compareTo("") != 0) {
                        s = s + ",South";
                        editText.setText(s);
                    }
                    else {
                        s = s + "South";
                        editText.setText(s);
                    }
                    break;
                case R.id.east_button:
                    if (s.compareTo("") != 0) {
                        s = s + ",East";
                        editText.setText(s);
                    }
                    else {
                        s = s + "East";
                        editText.setText(s);
                    }
                    break;
                case R.id.west_button:
                    if (s.compareTo("") != 0) {
                        s = s + ",West";
                        editText.setText(s);
                    }
                    else {
                        s = s + "West";
                        editText.setText(s);
                    }
                    break;
            }
        }
    }


}
