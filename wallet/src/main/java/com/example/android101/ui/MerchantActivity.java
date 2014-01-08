package com.example.android101.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.android101.R;
import com.example.android101.WalletActivity;
import com.example.android101.data.MockData;
import com.example.android101.data.model.User;

/**
 * Created by square on 1/8/14.
 */
public class MerchantActivity extends WalletActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (isFinishing()) return;
        setContentView(R.layout.merchant_activity);
        TextView name = (TextView) findViewById(R.id.merchant_name);
        TextView number = (TextView) findViewById(R.id.merchant_number);
        Button button = (Button) findViewById(R.id.merchant_button);

        int position = getIntent().getIntExtra("user_position", 0);
        User user = MockData.MERCHANTS[position];


        name.setText(user.name);


//        button.setOnClickListener(new View.OnClickListener() {
//            @Override public void onClick(View view) {
//                ;
//                )
    }
}