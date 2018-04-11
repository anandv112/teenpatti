package affwl.com.exchange;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


public class BuyChipsAdapter extends RecyclerView.Adapter<BuyChipsAdapter.ViewHolder> {
    List<ChipInfo> infolist;
    public static class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView count,price,specification;
        public ViewHolder(View itemView) {
            super(itemView);
            count=itemView.findViewById(R.id.loader_buy_chips_count);
            price=itemView.findViewById(R.id.loader_buy_chips_amount);
            specification=itemView.findViewById(R.id.loader_buy_chips_specs);
        }
    }

    public BuyChipsAdapter(List<ChipInfo> infolist)
    {
        this.infolist=infolist;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.loader_buy_chips_item, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ChipInfo chipinfo = infolist.get(position);
        holder.count.setText(chipinfo.getCount());
        holder.price.setText(chipinfo.getPrice());
        holder.specification.setText(chipinfo.getSpecification());
    }

    @Override
    public int getItemCount() {
        return infolist.size();
    }
}