package com.example.toptabbed;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

//Fragments :-
/*
=> A Fragment represents a reusable portion of your app's UI. A fragment defines and manages its own layout,
   has its own lifecycle, and can handle its own input events.
=> Fragments cannot live on their own--they must be hosted by an activity or another fragment.
*/

// What is the difference between FragmentPagerAdapter and FragmentStatePagerAdapter?
/*
=> About FragmentPagerAdapter Google's guide says:
    -> This version of the pager is best for use when there are a handful of typically more static fragments to be paged through,
       such as a set of tabs. The fragment of each page the user visits will be kept in memory, though its view hierarchy may be
       destroyed when not visible. This can result in using a significant amount of memory since fragment instances can hold on
       to an arbitrary amount of state. For larger sets of pages, consider FragmentStatePagerAdapter.

=> And about FragmentStatePagerAdapter:
    -> This version of the pager is more useful when there are a large number of pages, working more like a list view.
       When pages are not visible to the user, their entire fragment may be destroyed, only keeping the saved state of
       that fragment. This allows the pager to hold on to much less memory associated with each visited page as compared
       to FragmentPagerAdapter at the cost of potentially more overhead when switching between pages.
*/
public class FragmentAdapter extends FragmentStateAdapter {
    public FragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        // FragmentManager :-
        /*
        => FragmentManager is the class responsible for performing actions on your app's fragments,
           such as adding, removing, or replacing them, and adding them to the back stack.
           -> You might never interact with FragmentManager directly if you're using the Jetpack Navigation library,
              as it works with the FragmentManager on your behalf.
           -> The FragmentManager manages the fragment back stack. At runtime, the FragmentManager can perform
              back stack operations like adding or removing fragments in response to user interactions.
           -> Each set of changes are committed together as a single unit called a FragmentTransaction.
           -> there is role of the FragmentManager in relation to your activities and fragments, managing the back
              stack with FragmentManager, and providing data and dependencies to your fragments.
        */

        //Lifecycle:-
        /*
        => Defines an object that has an Android Lifecycle. Fragment and FragmentActivity classes implement LifecycleOwner
           interface which has the getLifecycle method to access the Lifecycle. You can also implement LifecycleOwner in
           your own classes.
        => ON_CREATE, ON_START, ON_RESUME events in this class are dispatched after the LifecycleOwner's related method
           returns. ON_PAUSE, ON_STOP, ON_DESTROY events in this class are dispatched before the LifecycleOwner's related
           method is called. For instance, ON_START will be dispatched after onStart returns, ON_STOP will be dispatched
           before onStop is called. This gives you certain guarantees on which state the owner is in.
        */
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch (position)
        {
            case 1:
                return new secondfragment();
            case 2:
                return new thirdfragment();
        }
        return new firstfragment();
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
