package com.example.task_6;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.task_6.databinding.CardTasarimBinding;

import java.util.List;

public class MarketAdapter extends RecyclerView.Adapter<MarketAdapter.CardTasarimTutucu> {
    private Context mContext;
    private List<Market> marketList;

    public MarketAdapter(Context mContext, List<Market> marketList) {
        this.mContext = mContext;
        this.marketList = marketList;
    }

    public MarketAdapter() {
    }

    public class CardTasarimTutucu extends RecyclerView.ViewHolder {
        private CardTasarimBinding tasarim;

        public CardTasarimTutucu(CardTasarimBinding tasarim) {
            super(tasarim.getRoot());
            this.tasarim = tasarim;
        }
    }

    @NonNull
    @Override
    public CardTasarimTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        CardTasarimBinding tasarim = CardTasarimBinding.inflate(layoutInflater, parent, false);
        return new CardTasarimTutucu(tasarim);
    }

    @Override
    public void onBindViewHolder(@NonNull CardTasarimTutucu holder, int position) {
        Market market = marketList.get(position);
        CardTasarimBinding t = holder.tasarim;

        t.imageViewGidaResmi.setImageResource(mContext.getResources().getIdentifier
                (market.getUrunResimAdi(), "drawable", mContext.getPackageName()));
        t.textViewGidaTuru.setText(market.getUrunAdi());
    }

    @Override
    public int getItemCount() {
        return marketList.size();
    }
}
