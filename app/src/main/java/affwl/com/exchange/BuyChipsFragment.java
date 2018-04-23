package affwl.com.exchange;


import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TabHost;

import java.util.ArrayList;
import java.util.List;

public class BuyChipsFragment extends DialogFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(DialogFragment.STYLE_NORMAL, R.style.MY_DIALOG);
    }

    @Override
    public void onStart() {
        super.onStart();
        Dialog d = getDialog();
        if (d!=null){
            int width = ViewGroup.LayoutParams.MATCH_PARENT;
            int height = ViewGroup.LayoutParams.MATCH_PARENT;
            d.getWindow().setLayout(width, height);
        }
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View root = inflater.inflate(R.layout.fragment_buy_chips, container, false);
        TabHost tabHost=root.findViewById(R.id.tabhost);
        tabHost.setup();
        TabHost.TabSpec spec=tabHost.newTabSpec("");
        spec.setContent(R.id.buy_chips);
        spec.setIndicator("buy chips");
        tabHost.addTab(spec);
        TabHost.TabSpec diamondspec=tabHost.newTabSpec("");
        diamondspec.setContent(R.id.buy_diamonds);
        diamondspec.setIndicator("buy diamonds");
        tabHost.addTab(diamondspec);
        TabHost.TabSpec managespec=tabHost.newTabSpec("");
        managespec.setContent(R.id.manage_chips);
        managespec.setIndicator("manage chips");
        tabHost.addTab(managespec);
        List<ChipInfo> infolist=new ArrayList<>();
        List<DiamondInfo> diamondlist=new ArrayList<>();
        RecyclerView recyclerView = root.findViewById(R.id.chiprecycler);
        RecyclerView diamondrecyclerview = root.findViewById(R.id.diamond_recycler);



        // set a LinearLayoutManager with default orientation
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(root.getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        LinearLayoutManager lm = new LinearLayoutManager(root.getContext());
        diamondrecyclerview.setLayoutManager(lm);
        String[] count = new String[]{};
        count = getResources().getStringArray(R.array.count_array);
        String[] price = getResources().getStringArray(R.array.price_array);
        String[] specification = getResources().getStringArray(R.array.specification_array);
        for (int i=0;i<count.length;i++)
        {
            infolist.add(new ChipInfo(count[i],price[i],specification[i]));
        }


        BuyChipsAdapter adapter = new BuyChipsAdapter(infolist);
        recyclerView.setAdapter(adapter);
        String[] diamond_count=getResources().getStringArray(R.array.diamond_count);
        String[] diamond_price=getResources().getStringArray(R.array.diamond_price);
        for (int i=0;i<diamond_count.length;i++)
        {
            diamondlist.add(new DiamondInfo(diamond_count[i],diamond_price[i]));
        }
        BuyDiamondAdapter diamondAdapter=new BuyDiamondAdapter(diamondlist);
        diamondrecyclerview.setAdapter(diamondAdapter);
        return root;
    }
}












//{
//        @Override
//        public void onCreate (Bundle savedInstanceState){
//        super.onCreate(savedInstanceState);
//        setStyle(DialogFragment.STYLE_NORMAL, R.style.MY_DIALOG);
//    }
//
//        @Override
//        public void onStart () {
//        super.onStart();
//        Dialog d = getDialog();
//        if (d != null) {
//            int width = ViewGroup.LayoutParams.MATCH_PARENT;
//            int height = ViewGroup.LayoutParams.MATCH_PARENT;
//            d.getWindow().setLayout(width, height);
//        }
//    }
//        @Override
//        public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle
//        savedInstanceState)
//        {
//            View root = inflater.inflate(R.three_two_one_leaderboard.fragment_buy_chips, container, false);
//            TabHost tabHost = root.findViewById(R.id.tabhost);
//            tabHost.setup();
//            TabHost.TabSpec spec = tabHost.newTabSpec("");
//            spec.setContent(R.id.buy_chips);
//            spec.setIndicator("buy chips");
//            tabHost.addTab(spec);
//            TabHost.TabSpec diamondspec = tabHost.newTabSpec("");
//            diamondspec.setContent(R.id.buy_diamonds);
//            diamondspec.setIndicator("buy diamonds");
//            tabHost.addTab(diamondspec);
//            TabHost.TabSpec managespec = tabHost.newTabSpec("");
//            managespec.setContent(R.id.manage_chips);
//            managespec.setIndicator("manage chips");
//            tabHost.addTab(managespec);
//            return root;
//        }
//    }
//
