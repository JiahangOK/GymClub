package edu.bjtu.gymclub.gymclub;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class sportFragment extends Fragment {
    private View view;
    private TabLayout my_table;
    private ViewPager viewPager;

    //放进集合
    private List<String> tas=new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sport, container, false);
        initView(view);
        return view;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        tas.add("index");
        tas.add("run");
        tas.add("walk");
        tas.add("ride");


        //设置适配器  注意：getChildFragmentManager
        viewPager.setAdapter(new MyAdapter(getChildFragmentManager()));

        //建立关联
        my_table.setupWithViewPager(viewPager);

        //一次加载所有的页面
        viewPager.setOffscreenPageLimit(tas.size());
    }

    //获得控件
    private void initView(View view) {
        my_table = (TabLayout) view.findViewById(R.id.tabLayout);
        my_table.setTabGravity(TabLayout.GRAVITY_FILL);
        my_table.setTabMode(TabLayout.MODE_FIXED);
        viewPager = (ViewPager) view.findViewById(R.id.viewPager);
    }

    //写一个适配器
    class MyAdapter extends FragmentPagerAdapter {

        //得到页面的title,会添加到tabLayout控件上
        @Override
        public CharSequence getPageTitle(int position) {
            return tas.get(position);
        }

        @Override
        public Fragment getItem(int position) {
            Fragment f=null;
            //进行判断
            switch (position){
                case 0:
                    f=new indexFragment();
                    break;
                case 1:
                    f=new runFragment();
                    break;
                case 2:
                    f=new walkFragment();
                    break;
                case 3:
                    f=new rideFragment();
                    break;
            }
            return f;
        }

        //view的页数
        @Override
        public int getCount() {
            return tas.size();
        }

        public MyAdapter(FragmentManager fm) {
            super(fm);
        }
    }

}
