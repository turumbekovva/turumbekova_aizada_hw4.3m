package com.example.turumbekova_aizada_hw43m.continent;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.turumbekova_aizada_hw43m.OnClick;
import com.example.turumbekova_aizada_hw43m.R;

import java.util.ArrayList;

public class ContinentFragment extends Fragment implements OnClick {

    private FragmentContinentBinding binding;
    private ArrayList<ContinentModel> continentList = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentContinentBinding.inflate(getLayoutInflater());
        return binding.getRoot();

        return inflater.inflate(R.layout.fragment__continent, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();

        continentAdapter continentAdapter = new ContinentAdapter(continentList, this);
        binding.recyclerView.setAdapter(continentAdapter);

    }

    private void loadData() {
        continentList.add(new ContinentModel("https://images.app.goo.gl/wyqKgJYfYBSpZfQe6","Eurasia"));
        continentList.add(new ContinentModel("","North America"));
        continentList.add(new ContinentModel("https://images.app.goo.gl/wyqKgJYfYBSpZfQe6","South America"));
        continentList.add(new ContinentModel("https://images.app.goo.gl/wyqKgJYfYBSpZfQe6","Africa"));
        continentList.add(new ContinentModel("https://images.app.goo.gl/wyqKgJYfYBSpZfQe6","Australia"));
    }

    @Override
    public void onClick(int position) {
        Bundle bundle = new Bundle();
        bundle.putInt("key", position);
        CountryFragment countryFragment = new CountryFragment();
        countryFragment.setArguments(bundle);
        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, countryFragment).addToBackStack(null).commit();
    }
}