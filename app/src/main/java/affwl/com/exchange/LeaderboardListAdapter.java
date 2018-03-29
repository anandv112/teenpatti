package affwl.com.exchange;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.zip.Inflater;


public class LeaderboardListAdapter extends RecyclerView.Adapter<LeaderboardListAdapter.LeaderboardListHolder> {

private String [] data;
    public LeaderboardListAdapter (String[] data){

        this.data = data;

    }
    @Override
    public LeaderboardListHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.leaderboard_list_item, parent, false);
        return new LeaderboardListHolder(view);
    }

    @Override
    public void onBindViewHolder(LeaderboardListHolder holder, int position) {

        String title = data[position];
        holder.leader_username.setText(title);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class LeaderboardListHolder extends RecyclerView.ViewHolder{

        ImageView leader_userstatus,leader_userpic, leader_userchips;
        TextView leader_usernumber,leader_username, leader_useramount;

        public LeaderboardListHolder(View itemView) {
            super(itemView);

            leader_userstatus = itemView.findViewById(R.id.leaderboarduserstatus);
            leader_userpic = itemView.findViewById(R.id.leaderboarduserpic);
            leader_userchips = itemView.findViewById(R.id.leaderboardtotalchips);
            leader_usernumber = itemView.findViewById(R.id.leaderboardsrnumber);
            leader_username = itemView.findViewById(R.id.leaderboardusername);
            leader_useramount = itemView.findViewById(R.id.leaderboardbalance);

        }
    }
}
