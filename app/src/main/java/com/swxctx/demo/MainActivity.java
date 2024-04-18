package com.swxctx.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.swxctx.aui.PrinterTextView;

public class MainActivity extends AppCompatActivity {
    private PrinterTextView printerTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initData();
    }

    private void initView(){
        printerTextView = findViewById(R.id.p_tv);
    }

    private void initData(){
        // 设置打字文本
        printerTextView.setPrintText("安卓（Android）是一种基于Linux内核（不包含GNU组件）的自由及开放源代码的移动操作系统。主要应用于移动设备，如智能手机和平板电脑，由美国Google公司和开放手机联盟领导及开发。");
        // 开始打字
        printerTextView.startPrint();
    }
}