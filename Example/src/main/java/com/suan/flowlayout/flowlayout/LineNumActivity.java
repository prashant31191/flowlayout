package com.suan.flowlayout.flowlayout;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Gravity;
import android.widget.Button;

import com.suan.flowlayout.FlowLayout;


public class LineNumActivity extends Activity {

  /**
   * function to show :
   * 1.normal flow ,textView + Button + Layout
   * 2.gravity ,weight
   * 3.lineNum
   */

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_line_num);
  }
}
