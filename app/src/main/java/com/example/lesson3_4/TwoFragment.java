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

public class TwoFragment extends Fragment implements onClick {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.two_fragment, container, false);
    }

    private ArrayList<Model> rew;
    private CountryAdapter adapter;
    private RecyclerView recyclerView;



    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        recyclerView = view.findViewById(R.id.two_recycler);
        adapter = new CountryAdapter(rew, this::onClick);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        rew = new ArrayList<>();
        Bundle bundle = getArguments();
        Integer val = bundle.getInt("key");
        switch (val) {
            case 1:
                rew.add(new Model("Сanada", R.drawable.ca));
                rew.add(new Model("Cuba", R.drawable.cu));
                rew.add(new Model("Bagamy", R.drawable.bs));
                rew.add(new Model("Mexico", R.drawable.mx));
                rew.add(new Model("USA", R.drawable.us));
                break;

            case 2:
                rew.add(new Model("Brazil", R.drawable.br));
                rew.add(new Model("Argentina", R.drawable.ar));
                rew.add(new Model("Uruguay", R.drawable.uy));
                rew.add(new Model("Peru", R.drawable.pe));
                rew.add(new Model("Bolivia", R.drawable.bo));
                break;

            case 3:
                rew.add(new Model("Australia", R.drawable.au));
                break;

            case 4:
                rew.add(new Model("Egypt", R.drawable.eg));
                rew.add(new Model("Sudan", R.drawable.sd));
                rew.add(new Model("Kenya", R.drawable.ke));
                rew.add(new Model("Nigerya", R.drawable.ng));
                rew.add(new Model("Angelo", R.drawable.ao));
                break;

            case 5:
                rew.add(new Model("Kyrgyzstan", R.drawable.kg));
                rew.add(new Model("Kazahstan", R.drawable.kz));
                rew.add(new Model("Tajikstan", R.drawable.tj));
                rew.add(new Model("Russia", R.drawable.ru));
                rew.add(new Model("Japan", R.drawable.jp));
                break;

            case 6:
                rew.add(new Model("Turkey", R.drawable.tr));
                rew.add(new Model("Ukraina", R.drawable.ua));
                rew.add(new Model("France", R.drawable.fr));
                rew.add(new Model("Horvatya", R.drawable.hr));
                rew.add(new Model("Russia", R.drawable.ru));
                break;

        }

    }

    @Override
    public void onClick(Model model) {

    }
}
