package com.wikispaces.cmip_training_camp.bigup;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by root on 11/16/14.
 */
public class NavBarFragment extends Fragment {

    private Button mHomeButton;
    private Button mSendButton;
    private Button mLeaderBoardButton;
    private Button mProfileButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.nav_bar, container, false);
        mHomeButton = (Button) v.findViewById(R.id.btn_home);
        mLeaderBoardButton =(Button) v.findViewById(R.id.btn_leaderboard);
        mProfileButton = (Button) v.findViewById(R.id.btn_myprofile);
        mSendButton= (Button) v.findViewById(R.id.btn_send);

        mHomeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),MainActivity.class);
                startActivity(i);
            }
        });

        mLeaderBoardButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),LeaderboardActivity.class);
                startActivity(i);
            }
        });

        mSendButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),SendBigUpActivity.class);
                startActivity(i);
            }
        });

        mProfileButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),ProfileActivity.class);
                startActivity(i);
            }
        });

        return v;
    }
}
