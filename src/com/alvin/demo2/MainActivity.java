package com.alvin.demo2;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;
//��������widget.TextView��ڲ����ڳ���������TextView����
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
        //����TextView��ǩ����
        String str="��ӭ����android����";
        mTextView1.setText(str);
        //ʵ����һ��LinearLayout���ֶ���
        myLayout=new LinearLayout(this);
        //���ò���Ϊ��ֱ����
        myLayout.setOrientation(LinearLayout.VERTICAL);
        //���ò��ֱ���ɫ
        myLayout.setBackgroundResource(R.drawable.bg);
        //������������
        setContentView(myLayout);
        //ʵ����һ��linearLayout���ֲ������������View
        layoutp=new LinearLayout.LayoutParams(WC,WC);
        //����ʵ����TextView����
        constructTextView();
        //��TextView��ӵ�LinearLayout������
        addTextView();
        //����TextView�ı���ɫ
        setTextViewColor();
        //����TextView�ı�����
        setTextViewText();
    }
	//����TextView�ı�����
	public void setTextViewText(){
		black_TV.setText("��ɫ");
		blue_TV.setText("��ɫ");
		cyan_TV.setText("����ɫ");
		dkgray_TV.setText("�Һ�ɫ");
		gray_TV.setText("��ɫ");
		green_TV.setText("��ɫ");
		ltgray_TV.setText("ǳ��ɫ");
		magenta_TV.setText("����ɫ");
		red_TV.setText("��ɫ");
		transparent_TV.setText("͸��");
		white_TV.setText("��ɫ");
		yellow_TV.setText("��ɫ");;
	}
	//����TextView�ı���ɫ
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
	//����ʵ����TextView����
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
	//��TextView��ӵ�LinearLayout������
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