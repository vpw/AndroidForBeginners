package com.example.android.birdsofindia.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.birdsofindia.BirdInfoActivity;
import com.example.android.birdsofindia.R;
import com.example.android.birdsofindia.models.BirdInfo;

import java.util.List;

/**
 * Created by vardhan on 27-05-2016.
 */
public class BirdsViewAdapter extends RecyclerView.Adapter<BirdsViewAdapter.BirdViewHolder> {

    private final List<BirdInfo> birds;
    private Context context;
    public static final String EXTRA_BIRD_SPEC = "com.example.android.birdsofindia.EXTRA_BIRD_SPEC";

    public BirdsViewAdapter(List<BirdInfo> birds) {
        this.birds = birds;
    }

    @Override
    public BirdViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.bird_info, parent, false);
        return new BirdViewHolder(view);
    }

    @Override
    public void onBindViewHolder(BirdViewHolder holder, int position) {
        ImageView imageViewBird = (ImageView) holder.itemView.findViewById(R.id.bird_image);
        TextView textViewBirdName = (TextView) holder.itemView.findViewById(R.id.bird_name);
        TextView textViewBirdSciName = (TextView) holder.itemView.findViewById(R.id.bird_sci_name);

        BirdInfo birdInfo = birds.get(position);
//        if (textViewContactName != null) {
        imageViewBird.setImageResource(birdInfo.imgId);
        textViewBirdName.setText(birdInfo.name);
        textViewBirdSciName.setText(birdInfo.sciName);

//        }
    }

    @Override
    public int getItemCount() {
        return birds.size();
    }

    public class BirdViewHolder extends RecyclerView.ViewHolder {

        public BirdViewHolder(View itemView) {

            super(itemView);
            context = itemView.getContext();
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int pos = getAdapterPosition();
                    Intent intent = new Intent(context, BirdInfoActivity.class);
                    intent.putExtra(EXTRA_BIRD_SPEC, pos);
                    context.startActivity(intent);
                }
            });

        }
    }
}
