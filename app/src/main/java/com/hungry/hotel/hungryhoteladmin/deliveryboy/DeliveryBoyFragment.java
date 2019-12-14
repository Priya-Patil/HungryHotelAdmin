package com.hungry.hotel.hungryhoteladmin.deliveryboy;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import com.hungry.hotel.hungryhoteladmin.R;


public class DeliveryBoyFragment extends Fragment {

    public DeliveryBoyFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DeliveryBoyFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DeliveryBoyFragment newInstance(String param1, String param2) {
        DeliveryBoyFragment fragment = new DeliveryBoyFragment();
        Bundle args = new Bundle();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        setupToolbar();
        return inflater.inflate(R.layout.fragment_delivery_boy, container, false);
    }

    private void setupToolbar() {
        ((AppCompatActivity) getActivity()).getSupportActionBar().show();
        Toolbar toolbar = getActivity().findViewById(R.id.toolbar);
        toolbar.setTitle("Delivery Boy");
        toolbar.setTitleTextColor(getActivity().getResources().getColor(R.color.black));
        AutoCompleteTextView actvSearchMenu = toolbar.findViewById(R.id.actvSearchMenu);
        ImageButton ibFilter = toolbar.findViewById(R.id.ibFilter);
        ImageButton ibSearch = toolbar.findViewById(R.id.ibSearch);
        actvSearchMenu.setVisibility(View.GONE);
        ibSearch.setVisibility(View.GONE);
        ibFilter.setVisibility(View.GONE);
    }

}
