package com.example.androidhelloworld;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainPage extends Activity {
	
	public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        
        //Useless Button
        Button uselessButton = (Button)findViewById(R.id.button2);
        //Onlclick method
        uselessButton.setOnClickListener(new OnClickListener(){
        	
        	@Override
			public void onClick(View v) {
				TextView title = (TextView)findViewById(R.id.helloWorld);
				//Setting the string
				title.setText("My First App");
				
			}
			
        });
        
    }
    
    //Send name method.
    public void sendMessage(View view) {
    	//Create new Intent
        Intent intent = new Intent(this, Hello_Name.class);
        //Find the text area.
        EditText editText = (EditText) findViewById(R.id.nameHere);
        //toString
        String message = editText.getText().toString();
        //Put method into Intent.
        intent.putExtra(EXTRA_MESSAGE, message);
        //Switch activities.
        startActivity(intent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_page, menu);
        return true;
    }
    
}
