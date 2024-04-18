# aui
Android常用UI、动画集合

# Usage

```aidl
implementation 'com.github.swxctx:aui:v0.0.1'
```

# 组件

- 可移动的view

```aidl
<com.swxctx.aui.MoveFrameLayout
        android:layout_width="match_parent"
        android:layout_height="100dp"
        android:background="#80000000">

    <TextView
        android:id="@+id/tv_html"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="20dp"
        android:paddingHorizontal="10dp"
        android:paddingTop="5dp"
        android:paddingBottom="5dp"
        tools:text="hello"
        tools:textColor="#000"
        tools:textSize="14sp" />
</com.swxctx.aui.MoveFrameLayout>
```

- 打字机效果

```
<com.swxctx.aui.PrinterTextView
    android:id="@+id/p_tv"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:layout_marginHorizontal="20dp"
    android:layout_marginTop="20dp"
    android:textColor="@color/white"/>

private PrinterTextView printerTextView;
printerTextView = findViewById(R.id.p_tv);

// 设置打字文本
printerTextView.setPrintText("安卓（Android）是一种基于Linux内核（不包含GNU组件）的自由及开放源代码的移动操作系统。主要应用于移动设备，如智能手机和平板电脑，由美国Google公司和开放手机联盟领导及开发。");
// 开始打字
printerTextView.startPrint();
```
