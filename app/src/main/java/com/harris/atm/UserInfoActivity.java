package com.harris.atm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class UserInfoActivity extends AppCompatActivity {

    private static final String TAG = UserInfoActivity.class.getSimpleName();
    private EditText edphone;
    private EditText edname;
    private Spinner ages;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
        edname = (EditText) findViewById(R.id.edname);
        edphone = (EditText) findViewById(R.id.edphone);
        String edName = getSharedPreferences("info",MODE_PRIVATE).getString("Name","");
        String edPhone = getSharedPreferences("info",MODE_PRIVATE).getString("Phone","");
        edname.setText(edName);
        edphone.setText(edPhone);
        ages = (Spinner) findViewById(R.id.ages);
        ArrayList<String> data = new ArrayList<>();
        for (int i = 15 ; i<=40; i++){
            data.add(i+"");
        }
        ArrayAdapter adapter = new ArrayAdapter(
                this , android.R.layout.simple_list_item_1 , data
        );
        ages.setAdapter(adapter);


    }
    public  void back(View view){
//       Intent intent = new Intent(this , MainActivity.class);
//           /* startActivity(intent);*/
//        startActivityForResult(intent , FUNC_BACK);

        Log.d(TAG , "ok"+ ages.getSelectedItem().toString());
        String name = edname.getText().toString();
        String phone = edname.getText().toString();
        getIntent().putExtra("Nick name", name);
        getIntent().putExtra("phonenumber", phone);
        setResult(RESULT_OK, getIntent());
        finish();
    }
}
