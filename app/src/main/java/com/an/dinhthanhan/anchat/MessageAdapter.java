package com.an.dinhthanhan.anchat;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.MessageViewHolder> {

    ArrayList<MessageObject> messageList;

    public MessageAdapter(ArrayList<MessageObject> messageList) {
        this.messageList = messageList;
    }

    @NonNull
    @Override
    public MessageAdapter.MessageViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View layoutView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_message, null, false);
        RecyclerView.LayoutParams lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutView.setLayoutParams(lp);

        MessageAdapter.MessageViewHolder rcv = new MessageAdapter.MessageViewHolder(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(@NonNull MessageAdapter.MessageViewHolder viewHolder, final int i) {
        viewHolder.mMessage.setText(messageList.get(i).getText());
        viewHolder.mSender.setText(messageList.get(i).getSenderId());
    }

    @Override
    public int getItemCount() {
        return messageList.size();
    }


    class MessageViewHolder extends RecyclerView.ViewHolder {
        TextView mMessage,
                 mSender;
        LinearLayout mLayout;

        MessageViewHolder(View view) {
            super(view);
            mLayout = view.findViewById(R.id.layout);

            mMessage = view.findViewById(R.id.message);
            mSender = view.findViewById(R.id.sender);
        }
    }
}

