package com.devapps.igor.Screens.AdventureProgress;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.devapps.igor.DataObject.Adventure;
import com.devapps.igor.R;

public class AdventurePlayersFragment extends Fragment {
    private static final String ADVENTURE_ID = "ADVENTURE_ID";

    private String mAdventureId;
    private Adventure mAdventure;


    public AdventurePlayersFragment() {
        // Required empty public constructor
    }

    public static AdventurePlayersFragment newInstance(String adventureId) {
        AdventurePlayersFragment fragment = new AdventurePlayersFragment();
        Bundle args = new Bundle();
        args.putString(ADVENTURE_ID, adventureId);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mAdventureId = getArguments().getString(ADVENTURE_ID);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_adventure_players, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {


    }

}
