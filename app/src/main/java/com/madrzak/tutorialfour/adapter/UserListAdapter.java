package com.madrzak.tutorialfour.adapter;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.madrzak.tutorialfour.R;
import com.madrzak.tutorialfour.model.UserModel;

import java.util.List;

/**
 * Created by Łukasz on 23/05/2017.
 */

public class UserListAdapter extends ArrayAdapter<UserModel> {

    private List<UserModel> users;
    private Context context;

    public UserListAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<UserModel> users) {
        super(context, resource, users);

        this.users = users;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = convertView;

        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(context);
            v = vi.inflate(R.layout.list_item_user, parent, false);
        }

        UserModel userModel = users.get(position);

        TextView tvName = (TextView) v.findViewById(R.id.tvName);
        TextView tvEmail = (TextView) v.findViewById(R.id.tvEmail);
        TextView tvAge = (TextView) v.findViewById(R.id.tvAge);

        tvName.setText(userModel.getName());
        tvEmail.setText(userModel.getEmail());
        tvAge.setText(userModel.getAge() + "");

        return v;

    }
}
