package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class EditTweetActivity extends Activity {
    //(1)Here the Analyzer reported a warning about "Field has no usages". So I comment all the following unused parts
    //private ListView displayTweetsList;
    //private ArrayList<Tweet> tweetList = new ArrayList<Tweet>();
    //private ArrayAdapter<Tweet> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);
        Intent intentCase = getIntent();
        Bundle bundleCase;
        bundleCase = intentCase.getExtras();

        EditText editText = (EditText) findViewById(R.id.editText);
        editText.setText(bundleCase.getString("Tweet"));
    }
}
