package com.example.sande.listview8;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import viralandroid.com.androiduserinterfacetutorial.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import viralandroid.com.androiduserinterfacetutorial.R;

/*class CustomAdapter extends ArrayAdapter<String> {
    CustomAdapter(Context context, String[] navn) {
        super(context, R.layout.custom_row, navn);
    }
    public TextView textView;

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View customView = convertView;
        if (customView == null) {
            customView = inflater.inflate(R.layout.custom_row, parent, false);
        }

        TextView gjenstand_custom = (TextView) customView.findViewById(R.id.gjenstand_custom);

        switch (position) {
            case 0:
                gjenstand_custom.setText(R.string.kongle);
                break;

            case 1:
                gjenstand_custom.setText(R.string.binders);
                break;

            case 2:
                gjenstand_custom.setText(R.string.plaster);
                break;

            case 3:
                gjenstand_custom.setText(R.string.kviteringen);
                break;

            case 4:
                gjenstand_custom.setText(R.string.ruter);
                break;

            case 5:
                gjenstand_custom.setText(R.string.olkork);
                break;

            case 6:
                gjenstand_custom.setText(R.string.hjerteutklipp);
                break;

            case 7:
                gjenstand_custom.setText(R.string.olkorkGull);
                break;

            case 8:
                gjenstand_custom.setText(R.string.bussbillett);
                break;
        }
        return customView;
    }
}
*/