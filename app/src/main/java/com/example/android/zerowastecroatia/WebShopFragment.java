package com.example.android.zerowastecroatia;

/**
 * Created by Tea on 23.8.2018..
 */
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;



public class WebShopFragment extends Fragment{
    public WebShopFragment() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.web_list, container, false);
        // // Create a list of  places to eat
        final ArrayList<WebTour> web_tour = new ArrayList<WebTour>();
        web_tour.add(new WebTour(R.drawable.silvan, R.string.silvan, getString(R.string.web12)));
        web_tour.add(new WebTour(R.drawable.mali_studio, R.string.mali_studio, getString(R.string.web18)));
        web_tour.add(new WebTour(R.drawable.freewa, R.string.freewa, getString(R.string.web20)));
        web_tour.add(new WebTour(R.drawable.bio_root, R.string.bio_root, getString(R.string.web21)));
        web_tour.add(new WebTour(R.drawable.sattva, R.string.sattva, getString(R.string.web23)));

        // Create an {@link TourAdapter}, whose data source is a list of {@link Tour}s. The
        // adapter knows how to create list items for each item in the list.
        WebTourAdapter adapter = new WebTourAdapter(getActivity(), web_tour, R.color.category_webshop);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // tour_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.wb_list);
        // Make the {@link ListView} use the {@link TourAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Tour} in the list.
        listView.setAdapter(adapter);
        return rootView;
    }
}
