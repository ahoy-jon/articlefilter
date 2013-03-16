package fr.cedeela.alice;

import com.googlecode.androidannotations.annotations.Click;
import com.googlecode.androidannotations.annotations.EActivity;
import com.googlecode.androidannotations.annotations.ViewById;

import android.app.Activity;
import android.widget.EditText;
import android.widget.TextView;

@EActivity(R.layout.add_twitter_account)
public class AddTwitterAccount extends Activity {

    @ViewById(R.id.myInput)
    EditText myInput;
       
    @ViewById(R.id.myTextView)
    TextView textView;
        
    @Click
    void myButton() {
         String name = myInput.getText().toString();
    	 textView.setText("Hello "+name);
    }
}
