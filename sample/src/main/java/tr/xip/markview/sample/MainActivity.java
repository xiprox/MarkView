package tr.xip.markview.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import tr.xip.markview.MarkView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MarkView markView = (MarkView) findViewById(R.id.mark);
        final EditText max = (EditText) findViewById(R.id.max);
        Button plusOne = (Button) findViewById(R.id.plus_one);
        Button minusOne = (Button) findViewById(R.id.minus_one);
        final TextView currentMark = (TextView) findViewById(R.id.current_mark);

        max.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                /* do nothing */
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                /* do nothing */
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (max.getText().toString().trim().length() != 0) {
                    markView.setMax(Integer.parseInt(max.getText().toString()));
                }
            }
        });

        plusOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                markView.setMark(markView.getMark() + 1);
                currentMark.setText(markView.getMark() + "");
            }
        });

        minusOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                markView.setMark(markView.getMark() - 1);
                currentMark.setText(markView.getMark() + "");
            }
        });
    }
}
