package com.itcs4155.haveyourbac;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
 
public class SingleItemViewAlcohol extends Activity {
	// Declare Variables
	String drink2;
	String type2;
	String alcoholContent6;
	Context context;
 
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Get the view from singleitemview.xml
		setContentView(R.layout.activity_single_item_view_alcohol);
 
		Intent i = getIntent();
		drink2 = i.getStringExtra("drink");
		type2 = i.getStringExtra("type");
		alcoholContent6 = i.getStringExtra("alcoholContent");
 
		// Locate the TextViews in singleitemview.xml
		final TextView txtdrink = (TextView) findViewById(R.id.drink2);
		final TextView txttype = (TextView) findViewById(R.id.type2);
		final TextView txtalcoholcontent = (TextView) findViewById(R.id.alcoholcontent6);
 
		// Set results to the TextViews
		txtdrink.setText(drink2);
		txttype.setText(type2);
		txtalcoholcontent.setText(alcoholContent6);
		
final Button cancel = (Button)findViewById(R.id.cancelAlcohol);
final Button add = (Button)findViewById(R.id.addAlcohol);

			add.setOnClickListener(new View.OnClickListener(){
				
				public void onClick(View arg0) {
					Intent intent = new Intent(getBaseContext(), MyTab.class);
					intent.putExtra("drink", txtdrink.getText());
					intent.putExtra("brand", txttype.getText());
					intent.putExtra("alcoholContent", txtalcoholcontent.getText());
					startActivity(intent);
				}
			
			});
		
        cancel.setOnClickListener(new View.OnClickListener(){
        	
        	public void onClick(View view){
        		//Used to goto my UserLoginPage
        		finish();
        	}
        
      });
	}
}