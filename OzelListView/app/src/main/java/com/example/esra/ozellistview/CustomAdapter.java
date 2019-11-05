package com.example.esra.ozellistview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import static com.example.esra.ozellistview.R.id.isimsoyisim;
import static com.example.esra.ozellistview.R.id.simge;

/**
 * Created by Esra on 14.07.2019.
 */

class CustomAdapter extends BaseAdapter {
    private LayoutInflater userInflater;
    private List<User> userList;

    public CustomAdapter(Activity activity, List<User> userList) {
        userInflater = (LayoutInflater) activity.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);
        this.userList = userList;

    }

    @Override
    public int getCount() {
        return userList.size();
    }

    @Override

    public Object getItem(int position) {
        return userList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View lineView;
        lineView = userInflater.inflate(R.layout.satir_layout, null);
        ImageView resim = (ImageView) lineView.findViewById(simge);
        TextView isim = (TextView) lineView.findViewById(R.id.isimsoyisim);
        User user = userList.get(position);

        isim.setText((CharSequence) user.getIsim());
        if (user.isKadinMi()) {
            resim.setImageResource(R.drawable.woman);
        } else {
            resim.setImageResource(R.drawable.man);
        }

        return lineView;
    }
}
