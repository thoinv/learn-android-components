package com.d4n.learnandroidcomponents;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv_name)
    TextView tvName;
    private NameViewModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        model = ViewModelProviders.of(this).get(NameViewModel.class);


        final Observer<String> nameObserver = new Observer<String>() {
            @Override
            public void onChanged(@Nullable final String newName) {
                tvName.setText(newName);
            }
        };

        model.getCurrentName().observe(this, nameObserver);
    }

    @OnClick(R.id.bt_change_value)
    void onViewClicked() {
        String anotherName = "John Doe";
        if (model == null) {
            return;
        }
        model.getCurrentName().setValue(anotherName);
    }
}
