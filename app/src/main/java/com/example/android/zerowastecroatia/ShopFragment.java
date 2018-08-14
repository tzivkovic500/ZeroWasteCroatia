package com.example.android.zerowastecroatia;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * Created by Tea on 2.8.2018..
 */

public class ShopFragment extends Fragment {
    public ShopFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);
        // // Create a list of  places to eat
        final ArrayList<Tour> tour = new ArrayList<Tour>();
        tour.add(new Tour(R.drawable.speceraj, R.string.speceraj, R.string.food1, getString(R.string.loc1), getString(R.string.web1)));
        tour.add(new Tour(R.drawable.greencajg, R.string.greencajg, R.string.food2, getString(R.string.loc2), getString(R.string.web2)));
        tour.add(new Tour(R.drawable.hiza, R.string.hiza, R.string.food3, getString(R.string.loc3), getString(R.string.web3)));
        tour.add(new Tour(R.drawable.mali_vrt, R.string.mali_vrt, R.string.food4, getString(R.string.loc4), getString(R.string.web4)));
        tour.add(new Tour(R.drawable.neo_cupedia, R.string.neo_cupedia, R.string.food5, getString(R.string.loc5), getString(R.string.web5)));
        tour.add(new Tour(R.drawable.garden, R.string.garden, R.string.food6, getString(R.string.loc6), getString(R.string.web6)));

        // Create an {@link TourAdapter}, whose data source is a list of {@link Tour}s. The
        // adapter knows how to create list items for each item in the list.
        TourAdapter adapter = new TourAdapter(getActivity(), tour, R.color.category_shop);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // tour_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        // Make the {@link ListView} use the {@link TourAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Tour} in the list.
        listView.setAdapter(adapter);
        return rootView;
    }
}


