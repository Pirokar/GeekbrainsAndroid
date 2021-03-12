package com.geekbrains.androidlevel1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private ImageView imageView;
    private Button button;
    private EditText editText;
    private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        setNewText();
        changeTextColor();
        setHeartImageToImageView();
        setOnBtnClickListener();
        setCheckboxBehavior();
    }

    //Давайте методам и переменным нормальные имена
    private void initViews() {
        textView = findViewById(R.id.textView);
        imageView = findViewById(R.id.imageView);
        button = findViewById(R.id.button);
        editText = findViewById(R.id.editText);
        checkBox = findViewById(R.id.checkbox);
    }

    private void setNewText() {
        String appNameStr = getString(R.string.app_name);
        textView.setText(R.string.new_text);
    }

    private void changeTextColor() {
        int colorRes = R.color.teal_700;
        int color = ContextCompat.getColor(getApplicationContext(), colorRes);
        textView.setTextColor(color);
    }

    private void setHeartImageToImageView() {
        /*try {
            Drawable drawable = ContextCompat.getDrawable(getApplicationContext(), imageRes);
        } catch (NullPointerException ignored) {

        }*/
        imageView.setImageResource(R.drawable.ic_baseline_favorite_border_24);
    }

    private void setOnBtnClickListener() {
        button.setOnClickListener(v -> {
            String string = editText.getText().toString();
            textView.setText(string);
        });
    }

    private void setCheckboxBehavior() {
        boolean isChecked = checkBox.isChecked();
        checkBox.setOnCheckedChangeListener((buttonView, isChecked1) -> {
             //чего-то делаем
        });
    }
}