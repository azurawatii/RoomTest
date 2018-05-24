package com.example.taruc.roomtest;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by taruc on 24/5/2018.
 */

public class UserAdapter extends ArrayAdapter {

    List<User> users;


    public UserAdapter(@NonNull Context context, @LayoutRes int resource, @IdRes int textViewResourceId, @NonNull List<User> users) {
        super(context, resource, textViewResourceId, users);

        this.users = users;
    }
}
