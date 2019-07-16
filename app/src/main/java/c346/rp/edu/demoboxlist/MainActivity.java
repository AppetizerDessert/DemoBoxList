package c346.rp.edu.demoboxlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvColour;
    ArrayList<Colour> alColourList;
    CustomAdapter caColour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvColour = findViewById(R.id.listViewColour);
        alColourList = new ArrayList<>();
        Colour clr1 = new Colour("Blue");
        Colour clr2 = new Colour("Orange");
        Colour clr3 = new Colour("Brown");

        alColourList.add(clr1);
        alColourList.add(clr2);
        alColourList.add(clr3);

        caColour = new CustomAdapter(this, R.layout.row, alColourList);
        lvColour.setAdapter(caColour);
    }
}
