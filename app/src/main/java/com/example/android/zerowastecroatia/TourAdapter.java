package com.example.android.zerowastecroatia;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import static android.support.v4.content.ContextCompat.startActivity;

/**
 * Created by Tea on 2.8.2018..
 */
public class TourAdapter extends ArrayAdapter<Tour> {
    /**
     * Resource ID for the background color
     */
    private int mColorResourceId;

    /**
     * Create a new {@link TourAdapter} object.
     *
     * @param context         is the current context (i.e. Activity) that the adapter is being created in.
     * @param tour            is the list of {@link Tour}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of tour
     */
    public TourAdapter(Context context, ArrayList<Tour> tour, int colorResourceId) {
        super(context, 0, tour);
        mColorResourceId = colorResourceId;
    }// Get the {@link Tour} object located at this position in the list

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        final Tour currentTour = getItem(position);
        // Method to expand and collapse info layout
        ImageView expand = listItemView.findViewById(R.id.info_button);
        LinearLayout goBack = listItemView.findViewById(R.id.zero_back);
        final FrameLayout expandedLayout = listItemView.findViewById(R.id.expanded_layout);
        final LinearLayout infoLayout = listItemView.findViewById(R.id.collapsed_layout);
        expand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                infoLayout.setVisibility(View.VISIBLE);
                expandedLayout.setVisibility(View.GONE);
            }
        });
        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                infoLayout.setVisibility(View.GONE);
                expandedLayout.setVisibility(View.VISIBLE);
            }
        });
        // Find the ImageView in the list_item.xml layout with the ID image_view.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.place_name);
        // Find the TextView in the list_item.xml layout with the ID info_text_view.
        TextView infoTextView = (TextView) listItemView.findViewById(R.id.place_info);
        // Find the location in the list_item.xml layout with the ID location.
        LinearLayout location = listItemView.findViewById(R.id.location);
        // Find the web in the list_item.xml layout with the ID web.
        LinearLayout website = listItemView.findViewById(R.id.website);
        imageView.setImageResource(currentTour.getImageResourceId());
        defaultTextView.setText(currentTour.getTextResourceId());
        infoTextView.setText(currentTour.getTextInfoId());
        // When location icon is clicked, shows location on google maps.
        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse(currentTour.getLocationId());
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(getContext(), mapIntent, Bundle.EMPTY);
            }
        });
        // When web icon is clicked, shows web page.
        website.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri iIntentUri = Uri.parse(currentTour.getUrlId());
                Intent i = new Intent(Intent.ACTION_VIEW, iIntentUri);
                startActivity(getContext(), i, Bundle.EMPTY);
            }
        });
        // Set the theme color for the list item.
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);
        return listItemView;
    }
}
