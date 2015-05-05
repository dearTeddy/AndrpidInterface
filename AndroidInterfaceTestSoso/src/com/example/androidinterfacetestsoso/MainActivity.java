package com.example.androidinterfacetestsoso;

import com.example.interfaces.Btn;
import com.example.interfaces.TextChanged;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends Activity implements TextChanged, OnClickListener
	{
	private TextView tv;
	private Btn btn;
	TextChanged textChange;
	
	public TextChanged getTextChange() {
		return textChange;
	}

	public void setTextChange(TextChanged textChange) {
		this.textChange = textChange;
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();
	}

	private void initView() {
		tv = (TextView) findViewById(R.id.tv);
		this.setTextChange(this);
		this.setTextChange();
//		btn = new Btn();
//		btn.setTextChanged(new com.example.interfaces.TextChanged() {
//			
//			@Override
//			public void setTextChange() {
//				tv.setText("Text has changed.");
//			}
//		});
//		btn.click();
	}

	@Override
	public void setTextChange() {
		tv.setText("Text has changed.");
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
	
	
}
