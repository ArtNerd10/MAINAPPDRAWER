package main.ghostofart.example.com.main;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity
{



    @Override
    protected void onCreate(final Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] Apps = {"1: Calculator", "2: Download Image ", "3: USIU App", "4: Guess The Celebrity", "5: Your Notes", "6: Spin The Bottle", "7: Timer", "8: Show/Hide Elements",
                "9: Brain Trainer","10: Import Photos","11: Flappy Bird ","12: Translate to French"};
        ListAdapter PetersAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, Apps);
        ListView PetersListView = (ListView)findViewById(R.id.PetersListView);
        PetersListView.setAdapter(PetersAdapter);

        PetersListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener()
                {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
                    {
                        //String Apps = String.valueOf(adapterView.getItemAtPosition(i));
                        //Intent goes here
                        if(Apps[i]==Apps[0])
                        {
                            Intent myIntent = new Intent();
                            myIntent.setComponent(new ComponentName("com.example.ghostofart.calculator", "com.example.ghostofart.calculator.MainActivity"));
                            startActivity(myIntent);
                        }
                        if(Apps[i]==Apps[1])
                        {
                            Intent myIntent = new Intent();
                            myIntent.setComponent(new ComponentName("com.example.ghostofart.downloadingimages", "com.example.ghostofart.downloadingimages.MainActivity"));
                            startActivity(myIntent);

                        }
                        if(Apps[i]==Apps[2])
                        {
                            Intent myIntent = new Intent();
                            myIntent.setComponent(new ComponentName("test.ghostofart.example.com.mytest", "test.ghostofart.example.com.mytest.Splash"));
                            startActivity(myIntent);
                        }
                        if(Apps[i]==Apps[3])
                        {
                            try{
                            Intent myIntent = new Intent();
                            myIntent.setComponent(new ComponentName("com.example.robpercival.guessthecelebrity", "com.example.robpercival.guessthecelebrity.MainActivity"));
                            startActivity(myIntent);
                        }catch(Exception e)
                        {
                            e.printStackTrace();
                            Log.i("STATE", savedInstanceState.toString());
                            Log.i("Failed", "Please Open 'Guess The Person' App from the App Drawer");
                        }
                        }
                        if(Apps[i]==Apps[4])
                        {
                            try {
                                Intent myIntent = new Intent();
                                myIntent.setComponent(new ComponentName("com.example.robpercival.notes", "com.example.robpercival.notes.MainActivity"));
                                startActivity(myIntent);
                            }catch(Exception e)
                            {
                                e.printStackTrace();
                                Log.i("STATE", savedInstanceState.toString());
                                Log.i("Failed", "Please Open 'Notes' App from the App Drawer");
                            }

                        }
                        if(Apps[i]==Apps[5])
                        {
                            Intent myIntent = new Intent();
                            myIntent.setComponent(new ComponentName("com.example.ghostofart.spinthebottle", "com.example.ghostofart.spinthebottle.BottleActivity"));
                            startActivity(myIntent);
                        }
                        if(Apps[i]==Apps[6])
                        {
                            Intent myIntent = new Intent();
                            myIntent.setComponent(new ComponentName("com.example.ghostofart.timer", "com.example.ghostofart.timer.MainActivity"));
                            startActivity(myIntent);
                        }
                        if(Apps[i]==Apps[7])
                        {
                            Intent myIntent = new Intent();
                            myIntent.setComponent(new ComponentName("test.ghostofart.example.com.showhide", "test.ghostofart.example.com.showhide.MainActivity"));
                            startActivity(myIntent);
                        }

                        if(Apps[i]==Apps[8])
                        {
                            Intent myIntent = new Intent();
                            myIntent.setComponent(new ComponentName("com.example.robpercival.braintrainer", "com.example.robpercival.braintrainer.MainActivity"));
                            startActivity(myIntent);
                        }
                        if(Apps[i]==Apps[9])
                        {
                            try{
                            Intent myIntent = new Intent();
                            myIntent.setComponent(new ComponentName("com.example.robpercival.photoimportdemo", "com.example.robpercival.photoimportdemo.MainActivity"));
                            startActivity(myIntent);
                        }catch(Exception e)
                        {
                            e.printStackTrace();
                            Log.i("STATE", savedInstanceState.toString());
                            Log.i("Failed", "Please Open 'Photo Importer' App from the App Drawer");
                        }
                        }
                        if(Apps[i]==Apps[10])
                        {
                            Intent myIntent = new Intent();
                            myIntent.setComponent(new ComponentName("com.robpercival.flappybird.android","com.robpercival.flappybird.android.AndroidLauncher"));
                            startActivity(myIntent);
                        }
                        if(Apps[i]==Apps[11])
                        {
                            try{
                            Intent myIntent = new Intent();
                            myIntent.setComponent(new ComponentName("com.example.robpercival.basicphrases", "com.example.robpercival.basicphrases.MainActivity"));
                            startActivity(myIntent);
                        }catch(Exception e)
                        {
                            e.printStackTrace();
                            Log.i("STATE", savedInstanceState.toString());
                            Log.i("Failed", "Please Open 'Basic Phrases' App from the App Drawer");
                        }
                        }
                        /*if(Apps[i]==Apps[14])
                        {
                            Intent myIntent = new Intent();
                            myIntent.setComponent(new ComponentName("", ""));
                            startActivity(myIntent);
                        }*/

                    }
                }
        );
    }
}
