package com.example.dcmlistview;

import java.util.ArrayList;

import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class MainActivity extends Activity {

	ListView lv;
	List<ListViewItem> items;
	CustomListViewAdapter adapter;

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        lv = (ListView) findViewById(R.id.listView);
        lv.setBackgroundResource(R.drawable.button);
        items  = new ArrayList<MainActivity.ListViewItem>();
        items.add(new ListViewItem()
        {{
        	ThumbnailResource = R.drawable.map;
        	Title = "Interactive Map";
        	//SubTitle = "Item1 Description";//
        }});
        items.add(new ListViewItem()
        {{
        	ThumbnailResource = R.drawable.clock;
        	Title = "Hours, Directions, Pricing";
        	//SubTitle = "Item2 Description";//
        }});
        items.add(new ListViewItem()
        {{
        	ThumbnailResource = R.drawable.paper_airplane;
        	Title = "Website";
        	//SubTitle = "Item2 Description";//
        }});
        
        adapter = new CustomListViewAdapter(this, items);
        lv.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    class ListViewItem
    {
    	public int ThumbnailResource;
    	public String Title;
    	public String SubTitle;
    }
}
