package com.example.btechnotes;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import org.jetbrains.annotations.NotNull;

public class FragmentAdapter56 extends FragmentStateAdapter {
    public FragmentAdapter56(@NonNull @NotNull FragmentManager fragmentManager, @NonNull @NotNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @NotNull
    @Override
    public Fragment createFragment(int position) {

        switch (position)
        {
            case 1:
                return new sem6();
        }
        return new sem5();
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
