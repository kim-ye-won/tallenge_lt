package com.example.tallenge_lt;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MyInfoActivity extends AppCompatActivity {
    ImageButton bt_home;
    ImageButton bt_chat;
    ImageButton  bt_alarm;
    ImageButton bt_mypage;
    Button btn_back, btn_exp, btn_checklist, btn_interest, btn_modifyinfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myinfo);

        btn_back = (Button) findViewById(R.id.btn_back);
        btn_exp = (Button) findViewById(R.id.btn_go_exp);
        btn_checklist = (Button)findViewById(R.id.btn_go_checklist);
        btn_interest = (Button)findViewById(R.id.btn_go_itr);
        btn_modifyinfo = (Button)findViewById(R.id.btn_go_modifyinfo);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyInfoActivity.this, MainActivity.class) ;
                startActivity( intent );
            }
        });
        btn_exp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyInfoActivity.this, ChooseExpActivity.class) ;
                startActivity( intent );
            }
        });
        btn_checklist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyInfoActivity.this, SetCheckListActivity.class) ;
                startActivity( intent );
            }
        });
        btn_interest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyInfoActivity.this, InterestActivity.class) ;
                startActivity( intent );
            }
        });
        btn_modifyinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyInfoActivity.this, ModifyInfoActivity.class) ;
                startActivity( intent );
            }
        });


        // MainActivity로 이동
        bt_home = (ImageButton) findViewById(R.id.home);
        bt_chat = (ImageButton) findViewById(R.id.chat);
        bt_alarm = (ImageButton) findViewById(R.id.alarm);
        bt_mypage = (ImageButton) findViewById(R.id.mypage);

        bt_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( getApplicationContext(), MainActivity.class );
                startActivity( intent );
            }
        });
        bt_chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( getApplicationContext(), ChatActivity.class );
                startActivity( intent );
            }
        });
        bt_alarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( getApplicationContext(), SetAlarmActivity.class );
                startActivity( intent );
            }
        });
        bt_mypage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( getApplicationContext(), MyInfoActivity.class );
                startActivity( intent );
            }
        });

    }



}