package com.example.android.zerowastecroatia;

import android.content.Intent;
        import android.net.Uri;
        import android.os.Bundle;
        import android.support.v4.app.Fragment;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.Button;
        import android.widget.ImageButton;
/**
 * Created by Tea on 2.8.2018..
 */

public class AboutFragment extends Fragment {
    public AboutFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View aboutView = inflater.inflate(R.layout.activity_info, container, false);
        ImageButton facebookButton = aboutView.findViewById(R.id.facebook);
        facebookButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/ZeroWasteCroatia/"));
                startActivity(browserIntent);

            }
        });
        ImageButton instagramButton = aboutView.findViewById(R.id.instagram);
        instagramButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/zerowastecroatia1/"));
                startActivity(browserIntent);

            }
        });
        ImageButton callButton = aboutView.findViewById(R.id.call_button);
        callButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:0038591 506 4529"));
                {
                    startActivity(intent);
                }
            }
        });
        ImageButton emailButton = aboutView.findViewById(R.id.emailButton);
        emailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:zerowastecroatia1@gmail.com")); // only email apps should handle this
                {
                    startActivity(intent);
                }

            }
        });
        // email message with new place
        Button sendButton = aboutView.findViewById(R.id.sendButton);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:zerowastecroatia1@gmail.com")); // only email apps should handle this
                intent.putExtra(Intent.EXTRA_SUBJECT, "New Zero Waste place for list");
                intent.putExtra(Intent.EXTRA_TEXT, "Hi! You want to add New Zero Waste place? Fill this application:" + "\nPlace name:" + "\nPlace address:" + "\nweb/facebook:" + "\nType (food, cosmetics...):" + "\nThank you!" + "\nZero Waste Croatia Team");
                {
                    startActivity(intent);
                }
            }
        });
        return aboutView;
    }
}