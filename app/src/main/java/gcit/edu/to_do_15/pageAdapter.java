package gcit.edu.to_do_15;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class pageAdapter extends FragmentPagerAdapter {
    int mNumoftabs;
    public pageAdapter(@NonNull FragmentManager fm,int behaviour){
        super(fm,behaviour);
        this.mNumoftabs=behaviour;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new BlankFragment();
            case 1: return new BlankFragment2();
            case 2: return new BlankFragment3();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return mNumoftabs;
    }
}
