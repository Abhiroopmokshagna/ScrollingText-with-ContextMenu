package com.mokshagna.abhiroop.ScrollingTextHomeWork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView articleText = findViewById(R.id.article);
        registerForContextMenu(articleText);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_context,menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.context_edit:
                displayToast("Edit");
                return true;
            case R.id.context_share:
                displayToast("Share");
                return true;
            case R.id.context_delete:
                displayToast("Delete");
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }

    public void displayToast(String message){
        Toast.makeText(getApplicationContext(),"You Selected: "+message,Toast.LENGTH_SHORT).show();
    }
}
