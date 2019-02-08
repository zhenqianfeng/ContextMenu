package com.concordia.cejv669.contextmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = findViewById(R.id.btn_1);
        Button b2 = findViewById(R.id.btn_2);

        registerForContextMenu(b1);
        registerForContextMenu(b2);


    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo)
    { super.onCreateContextMenu(menu, v, menuInfo);

        if (v.getId() == R.id.btn_1)
        {
            menu.setHeaderTitle("Two letter menu");
            menu.add(0, v.getId(), 0, "A");
            menu.add(1, v.getId(), 0, "B");
        }
        else
        {
            menu.setHeaderTitle("Two color menu");
            menu.add(0, v.getId(), 0, "Red");
            menu.add(1, v.getId(), 0, "Blue");
        };

//        menu.setHeaderTitle("Context Menu");
//        menu.add(0, v.getId(), 0, "Item 1");
//        menu.add(0, v.getId(), 0, "Item 2");

    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

    //    item.getGroupId() == 0

if (item.getItemId() == R.id.btn_1){
    if (item.getGroupId() == 0){
        Toast.makeText(getApplicationContext(), "You chose A", Toast.LENGTH_SHORT).show();
    }
    if (item.getGroupId() == 1){
        Toast.makeText(getApplicationContext(), "You chose B", Toast.LENGTH_SHORT).show();
    }
}
if (item.getItemId() == R.id.btn_2) {
    if (item.getGroupId() == 0){
        Toast.makeText(getApplicationContext(), "You chose Red", Toast.LENGTH_SHORT).show();
    }
    if (item.getGroupId() == 1){
        Toast.makeText(getApplicationContext(), "You chose Blue", Toast.LENGTH_SHORT).show();
    }

}

    /*    if (item.getTitle() == "Item 1")
    {             Toast.makeText(getApplicationContext(), "You Clicked on Item 1", Toast.LENGTH_SHORT).show();

    }
        else
            { if(item.getTitle() == "Item 2")
            {
                Toast.makeText(getApplicationContext(), "You Clicked on Item 2", Toast.LENGTH_SHORT).show();
            }
            else {
                return false;
            }
            }
        return true;
        */
    return true;
    }




}
