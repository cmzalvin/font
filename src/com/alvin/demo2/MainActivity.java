package com.alvin.demo2;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;
//必须引用widget.TextView借口才能在程序中声明TextView对象
import android.widget.TextView;

public class MainActivity extends Activity {
	private TextView mTextView1;
	private LinearLayout myLayout;
	private LinearLayout.LayoutParams layoutp;
	private int WC=LinearLayout.LayoutParams.WRAP_CONTENT;
	private TextView black_TV,blue_TV,cyan_TV,dkgray_TV,gray_TV,green_TV,ltgray_TV,
	magenta_TV,red_TV,transparent_TV,white_TV,yellow_TV;
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        mTextView1=(TextView)findViewById(R.id.TextView1);
        //设置TextView标签内容
        String str="欢迎来到android世界";
        mTextView1.setText(str);
        //实例化一个LinearLayout布局对象
        myLayout=new LinearLayout(this);
        //设置布局为垂直布局
        myLayout.setOrientation(LinearLayout.VERTICAL);
        //设置布局背景色
        myLayout.setBackgroundResource(R.drawable.bg);
        //加载主屏布局
        setContentView(myLayout);
        //实例化一个linearLayout布局参数，用来添加View
        layoutp=new LinearLayout.LayoutParams(WC,WC);
        //构成实例化TextView对象
        constructTextView();
        //吧TextView添加到LinearLayout布局中
        addTextView();
        //设置TextView文本颜色
        setTextViewColor();
        //设置TextView文本内容
        setTextViewText();
    }
	//设置TextView文本内容
	public void setTextViewText(){
		black_TV.setText("黑色");
		blue_TV.setText("蓝色");
		cyan_TV.setText("青绿色");
		dkgray_TV.setText("灰黑色");
		gray_TV.setText("灰色");
		green_TV.setText("绿色");
		ltgray_TV.setText("浅灰色");
		magenta_TV.setText("红紫色");
		red_TV.setText("红色");
		transparent_TV.setText("透明");
		white_TV.setText("白色");
		yellow_TV.setText("黄色");;
	}
	//设置TextView文本颜色
	public void setTextViewColor(){
		black_TV.setTextColor(Color.BLACK);
		blue_TV.setTextColor(Color.BLUE);
		cyan_TV.setTextColor(Color.CYAN);
		dkgray_TV.setTextColor(Color.DKGRAY);
		gray_TV.setTextColor(Color.GRAY);
		green_TV.setTextColor(Color.GREEN);
		ltgray_TV.setTextColor(Color.LTGRAY);
		magenta_TV.setTextColor(Color.MAGENTA);
		red_TV.setTextColor(Color.RED);
		transparent_TV.setTextColor(Color.TRANSPARENT);
		white_TV.setTextColor(Color.WHITE);
		yellow_TV.setTextColor(Color.YELLOW);
	}
	//构造实例化TextView对象
	public void constructTextView(){
		black_TV=new TextView(this);
		blue_TV=new TextView(this);
		cyan_TV=new TextView(this);
		dkgray_TV=new TextView(this);
		gray_TV=new TextView(this);
		green_TV=new TextView(this);
		ltgray_TV=new TextView(this);
		magenta_TV=new TextView(this);
		red_TV=new TextView(this);
		transparent_TV=new TextView(this);
		white_TV=new TextView(this);
		yellow_TV=new TextView(this);
	}
	//把TextView添加到LinearLayout布局中
	public void addTextView(){
		myLayout.addView(black_TV, layoutp);
		myLayout.addView(blue_TV, layoutp);
		myLayout.addView(cyan_TV, layoutp);
		myLayout.addView(dkgray_TV, layoutp);
		myLayout.addView(gray_TV, layoutp);
		myLayout.addView(green_TV, layoutp);
		myLayout.addView(ltgray_TV, layoutp);
		myLayout.addView(magenta_TV, layoutp);
		myLayout.addView(red_TV, layoutp);
		myLayout.addView(transparent_TV, layoutp);
		myLayout.addView(white_TV, layoutp);
		myLayout.addView(yellow_TV, layoutp);
	}
}