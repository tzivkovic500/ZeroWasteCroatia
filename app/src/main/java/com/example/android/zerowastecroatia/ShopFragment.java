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
        tour.add(new Tour(R.drawable.agrokutic, R.string.agrokutic, R.string.food7, getString(R.string.loc7), getString(R.string.web7)));
        tour.add(new Tour(R.drawable.zabac, R.string.zabac, R.string.food8, getString(R.string.loc8), getString(R.string.web8)));
        tour.add(new Tour(R.drawable.kredenca_zdravlja, R.string.kredenca_zdravlja, R.string.food9, getString(R.string.loc9), getString(R.string.web9)));
        tour.add(new Tour(R.drawable.vrutak, R.string.vrutak, R.string.food10, getString(R.string.loc10), getString(R.string.web10)));
        tour.add(new Tour(R.drawable.zrno_zivota, R.string.zrno_zivota, R.string.food11, getString(R.string.loc11), getString(R.string.web11)));
        tour.add(new Tour(R.drawable.ljubav_prirode, R.string.ljubav_pirode, R.string.food13, getString(R.string.loc13), getString(R.string.web13)));
        tour.add(new Tour(R.drawable.refuzo, R.string.refuzo, R.string.food14, getString(R.string.loc14), getString(R.string.web14)));
        tour.add(new Tour(R.drawable.zdravi_ducan, R.string.zdravi_ducan, R.string.food15, getString(R.string.loc15), getString(R.string.web15)));
        tour.add(new Tour(R.drawable.witch_house, R.string.witch_house, R.string.food16, getString(R.string.loc16), getString(R.string.web16)));
        tour.add(new Tour(R.drawable.uberi_ovo, R.string.uberi_ovo, R.string.food17, getString(R.string.loc17), getString(R.string.web17)));
        tour.add(new Tour(R.drawable.humana_nova, R.string.humana_nova, R.string.food19, getString(R.string.loc19), getString(R.string.web19)));
        tour.add(new Tour(R.drawable.naj_caj, R.string.naj_caj, R.string.food22, getString(R.string.loc22), getString(R.string.web22)));





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


