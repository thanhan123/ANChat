package com.an.dinhthanhan.anchat;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class UserListAdapter implements RecyclerView.Adapter<UserListAdapter.UserListViewHolder> {

    ArrayList<UserObject> userList;

    public UserListAdapter(ArrayList<UserObject> userList) {
        this.userList = userList;
    }


    public class UserListViewHolder extends RecyclerView.ViewHolder {
        public UserListViewHolder(View view) {
            super(view);
        }
    }
}
