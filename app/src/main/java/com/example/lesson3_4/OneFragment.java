package com.example.lesson3_4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class OneFragment extends Fragment implements onClick {
        private ArrayList<Model> hour;
        private CountryAdapter adapter;
        private RecyclerView recyclerView;

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            return inflater.inflate(R.layout.one_fragment, container, false);
        }
        @Override
        public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
            super.onViewCreated(view, savedInstanceState);
            loadData();
            recyclerView = view.findViewById(R.id.one_recycler);
            adapter = new CountryAdapter(hour,
                    this::onClick);
            recyclerView.setAdapter(adapter);
        }

        private void loadData() {
            hour = new ArrayList<>();
            hour.add(new Model("South Amerika", R.drawable.cna, 1));
            hour.add(new Model("Europe", R.drawable.csa, 2));
            hour.add(new Model("Asia", R.drawable.coc, 3));
            hour.add(new Model("Nourth Amerika", R.drawable.caf, 4));
            hour.add(new Model("Australia", R.drawable.cas, 5));
            hour.add(new Model("Africa", R.drawable.ceu, 6));
        }

        @Override
        public void onClick(Model model) {
            Bundle bundle = new Bundle();
            bundle.putInt("key", model.getKeyId());
            Fragment fragment = new TwoFragment();
            fragment.setArguments(bundle);
            requireActivity().getSupportFragmentManager().beginTransaction().
                    replace(R.id.container, fragment).addToBackStack(null).commit();

        }
}
