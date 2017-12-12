package com.harris.atm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class UserInfoActivity extends AppCompatActivity {
    private final static  int FUNC_BACK = 102;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
    }
    public  void back(View view){
//       Intent intent = new Intent(this , MainActivity.class);
//           /* startActivity(intent);*/
//        startActivityForResult(intent , FUNC_BACK);
        EditText edname = (EditText) findViewById(R.id.edname);
        EditText edphone = (EditText) findViewById(R.id.edphone);
        String name = edname.getText().toString();
        String phone = edname.getText().toString();
        getIntent().putExtra("Nick name", name);
        getIntent().putExtra("phonenumber", phone);
        setResult(RESULT_OK, getIntent());
        finish();
    }
}
