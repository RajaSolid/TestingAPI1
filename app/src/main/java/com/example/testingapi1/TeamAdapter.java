package com.example.testingapi1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class TeamAdapter extends RecyclerView.Adapter<TeamAdapter.TeamViewHolder> {

    private List<Team> teams;

    public TeamAdapter(List<Team> teams) {
        this.teams = teams;
    }

    @NonNull
    @Override
    public TeamViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_team, parent, false);
        return new TeamViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TeamViewHolder holder, int position) {
        Team team = teams.get(position);
        holder.textTeamName.setText(team.getName());
        holder.textStadium.setText(team.getStadium());

        Glide.with(holder.itemView.getContext())
                .load(team.getBadgeUrl())
                .into(holder.imageBadge);
    }

    @Override
    public int getItemCount() {
        return teams.size();
    }

    public static class TeamViewHolder extends RecyclerView.ViewHolder {
        TextView textTeamName, textStadium;
        ImageView imageBadge;

        public TeamViewHolder(@NonNull View itemView) {
            super(itemView);
            textTeamName = itemView.findViewById(R.id.textTeamName);
            textStadium = itemView.findViewById(R.id.textStadium);
            imageBadge = itemView.findViewById(R.id.imageBadge);
        }
    }
}
