package com.raisproject.movie.adapter.fragment

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.raisproject.movie.ui.nowplaying.NowPlayingFragment
import com.raisproject.movie.ui.popular.PopularFragment
import com.raisproject.movie.ui.toprated.TopRatedFragment
import com.raisproject.movie.ui.upcoming.UpcomingFragment

class SectionsPagerAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return 4
    }

    override fun createFragment(position: Int): Fragment {
        var fragment: Fragment? = null
        when (position) {
            0 -> fragment = PopularFragment()
            1 -> fragment = TopRatedFragment()
            2 -> fragment = UpcomingFragment()
            3 -> fragment = NowPlayingFragment()
        }
        return fragment as Fragment
    }
}