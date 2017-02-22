package com.example.user.nes;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class MainActivity extends ListActivity {

    static final String[] FRUITS = new String[] { " (English pronunciation: /ɑːˈmɑːn/; Arabic: عمّان\u200E\u200E) is the capital and most populous city of Jordan, and the country's economic, political and cultural centre.[3] Situated in north-central Jordan, Amman is the administrative centre of the Amman Governorate. The city has a population of 4,007,526 and a land area of 1,680 square kilometres (648.7 sq mi).[4] Today, Amman is considered to be among the most liberal and westernized Arab cities.[5] It is a major tourist destination in the region, particularly among Arab and European tourists.[6]\n" +
            "\n" +
            "The earliest evidence of settlement in the area is a Neolithic site known as 'Ain Ghazal. Its successor was known as \"Rabbath Ammon\", which was the capital of the Ammonites, then as \"Philadelphia\", and finally as Amman.[7] It was initially built on seven hills but now spans over 19 hills combining 27 districts,[7] which are administered by the Greater Amman Municipality headed by its mayor Aqel Biltaji.[8] Areas of Amman have either gained their names from the hills (Jabal) or valleys (Wadi) they lie on, such as Jabal Lweibdeh and Wadi Abdoun.[7] East Amman is predominantly filled with historic sites that frequently host cultural activities, while West Amman is more modern and serves as the economic center of the city.[9]\n" +
            "\n" +
            "Approximately 2 million visitors arrived in Amman in 2014, which ranked it as the 93rd most visited city in the world and the 5th most visited Arab city.[10] Amman has a relatively fast growing economy,[11] and it is ranked Beta− on the global city index.[12] Moreover, it was named one of the Middle East and North Africa's best cities according to economic, labor, environmental, and socio-cultural factors.[13] The city is among the most popular locations in the Arab world for multinational corporations to set up their regional offices, alongside Doha and only behind Dubai. It is expected that in the next 10 years these three cities will capture the largest share of multinational corporation activity in the region." ,
             };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // no more this
        // setContentView(R.layout.list_fruit);

        setListAdapter(new ArrayAdapter<String>(this, R.layout.list_fruit,FRUITS));

        ListView listView = getListView();
        listView.setTextFilterEnabled(true);

        listView.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // When clicked, show a toast with the TextView text
                Toast.makeText(getApplicationContext(),
                        ((TextView) view).getText(), Toast.LENGTH_SHORT).show();
            }
        });

    }

}