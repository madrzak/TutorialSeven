package com.madrzak.tutorialfour.fragment;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.madrzak.tutorialfour.R;
import com.madrzak.tutorialfour.adapter.UserListAdapter;
import com.madrzak.tutorialfour.model.UserModel;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {

    private ListView list;
    private List<UserModel> userModelList;
    private UserListAdapter listAdapter;


    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_first, container, false);

        list = (ListView) view.findViewById(R.id.list);

        userModelList = new ArrayList<>();

        UserModel lukasz = new UserModel("Lukasz", "lukasz@madrzak.com", 25);
        userModelList.add(lukasz);
        UserModel gandalf = new UserModel("Gandalf", "gandalf@wizard.com", 99);
        userModelList.add(gandalf);
        UserModel bilbo = new UserModel("Bilbo", "bilbo@hobbit.com", 67);
        userModelList.add(bilbo);
        UserModel legolas = new UserModel("Legolas", "legolas@elf.com", 123);
        userModelList.add(legolas);
        UserModel saruman = new UserModel("Saruman", "saruman@wizard.com", 100);
        userModelList.add(saruman);
        UserModel gollum = new UserModel("Gollum", "gollum@lonely.com", 90);
        userModelList.add(gollum);
        UserModel sam = new UserModel("Sam", "sam@hobbit.com", 28);
        userModelList.add(sam);
        UserModel frodo = new UserModel("Frodo", "frodo@hobbit.com", 27);
        userModelList.add(frodo);

        listAdapter = new UserListAdapter(getActivity(), R.layout.list_item_user, userModelList);
        list.setAdapter(listAdapter);


        return view;
    }

}
