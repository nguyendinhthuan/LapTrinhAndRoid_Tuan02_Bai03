package com.example.student.laptrinhandroid_tuan02_bai03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private EditText et_NamDuongLich;
    private TextView tv_NamAmLich;
    private Button bt_ChuyenDoi;
    private ArrayList<String> listTuoi = new ArrayList<>();
    private ArrayList<String> listMenh = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();
        ThemDuLieu();
        ChuyenDoi();
    }

    public void AnhXa() {
        et_NamDuongLich = (EditText) findViewById(R.id.et_NamDuongLich);

        tv_NamAmLich = (TextView) findViewById(R.id.tv_NamAmLich);

        bt_ChuyenDoi = (Button) findViewById(R.id.bt_ChuyenDoi);
    }

    public void ThemDuLieu() {
        listTuoi.add("Tí");
        listTuoi.add("Sửu");
        listTuoi.add("Dần");
        listTuoi.add("Mẹo");
        listTuoi.add("Thìn");
        listTuoi.add("Tỵ");
        listTuoi.add("Ngọ");
        listTuoi.add("Mùi");
        listTuoi.add("Thân");
        listTuoi.add("Dậu");
        listTuoi.add("Tuất");
        listTuoi.add("Hợi");

        listMenh.add("Giáp");
        listMenh.add("Ất");
        listMenh.add("Bính");
        listMenh.add("Đinh");
        listMenh.add("Mậu");
        listMenh.add("Kỷ");
        listMenh.add("Canh");
        listMenh.add("Tân");
        listMenh.add("Nhâm");
        listMenh.add("Qúy");
    }

    public void ChuyenDoi() {
        bt_ChuyenDoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int namduonglich = Integer.parseInt(et_NamDuongLich.getText().toString());
                tv_NamAmLich.setText(listMenh.get((namduonglich + 6) % 10) +" "+ listTuoi.get((namduonglich + 8) % 12));
            }
        });
    }
}
