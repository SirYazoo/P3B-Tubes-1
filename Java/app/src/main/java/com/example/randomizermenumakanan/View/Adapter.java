package com.example.randomizermenumakanan.View;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.randomizermenumakanan.Model.IsiMenu;
import com.example.randomizermenumakanan.Presenter.MainPresenter;
import com.example.randomizermenumakanan.R;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends BaseAdapter {
    private List<IsiMenu> listMenu;
    private Context context;
    private MainPresenter mainPresenter;

    public Adapter(Context context, MainPresenter mainPresenter) {
        this.context = context;
        this.listMenu = new ArrayList<>();
        this.mainPresenter = mainPresenter;
    }

    public void update(List<IsiMenu> isiMenu) {
        this.listMenu.clear();
        this.listMenu.addAll(isiMenu);
        this.notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return this.listMenu.size();
    }

    @Override
    public Object getItem(int i) {
        return this.listMenu.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(this.context).inflate(R.layout.list_group, parent, false);
            viewHolder = new ViewHolder(convertView, this.mainPresenter);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.updateView((IsiMenu) this.getItem(i), i);
        return convertView;
    }

    private class ViewHolder implements View.OnClickListener {
        protected Button btnListMenu;
        protected ImageButton imgTrash;
        protected MainPresenter mainPresenter;
        protected int position;

        public ViewHolder(View convertView, MainPresenter mainPresenter) {
            this.btnListMenu = convertView.findViewById(R.id.btnListMenu);
            this.imgTrash = convertView.findViewById(R.id.imgTrash);
            this.mainPresenter = mainPresenter;
            this.btnListMenu.setOnClickListener(this);
            this.imgTrash.setOnClickListener(this);
            convertView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (v == this.imgTrash) {
                this.mainPresenter.deleteList(this.position);
            } else if (v == this.btnListMenu) {
//                this.mainPresenter.;
            }
        }

        public void updateView(IsiMenu isiMenu, int position) {
            this.btnListMenu.setText(isiMenu.getNama());
            this.position = position;
        }
    }
}
