package com.example.android.zerowastecroatia;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import java.util.ArrayList;
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
        facebookButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0)
            {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/ZeroWasteCroatia/"));
                startActivity(browserIntent);

            }
        });
        ImageButton instagramButton = aboutView.findViewById(R.id.instagram);
        instagramButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0)
            {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.instagram.com/zerowastecroatia1/"));
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

        return aboutView;
    }
}
