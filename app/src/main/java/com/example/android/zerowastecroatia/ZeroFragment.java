package com.example.android.zerowastecroatia;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Tea on 2.8.2018..
 */

public class ZeroFragment extends Fragment {
    public ZeroFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_catalog, container, false);
        return rootView;

    }
}
