package affwl.com.exchange;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;


public class BuyDiamondAdapter extends RecyclerView.Adapter<BuyDiamondAdapter.ViewHolder> {
    List<DiamondInfo> infolist;
    public static class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView count,price;
        public ViewHolder(View itemView) {
            super(itemView);
            count=itemView.findViewById(R.id.count);
            price=itemView.findViewById(R.id.price);
        }
    }

    public BuyDiamondAdapter(List<DiamondInfo> infolist)
    {
        this.infolist=infolist;
    }
    @Override
    public BuyDiamondAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.loader_buy_diamonds_item, parent, false);

        return new BuyDiamondAdapter.ViewHolder(itemView);
    }



    @Override
    public void onBindViewHolder(BuyDiamondAdapter.ViewHolder holder, int position) {
        DiamondInfo diamondInfo = infolist.get(position);
        holder.count.setText(diamondInfo.getCount());
        holder.price.setText(diamondInfo.getPrice());
    }

    @Override
    public int getItemCount() {
        return infolist.size();
    }
}