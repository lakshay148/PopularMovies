package com.truedev.popularmovies.Activities.Specific;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;

import com.truedev.popularmovies.Activities.General.BaseActivity;
import com.truedev.popularmovies.R;
import com.truedev.popularmovies.adapter.BaseRecyclerAdapter;
import com.truedev.popularmovies.model.general.GeneralObject;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by lakshaygirdhar on 21/3/16.
 */
public class MoviesListActivity extends BaseActivity {

    @Bind(R.id.rcvMovies)
    RecyclerView rcvMovies;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        getLayoutInflater().inflate(R.layout.movies_list, mContentFrame);

        ButterKnife.bind(this);

        ArrayList<Object> objects = new ArrayList<>();
        for(int i=0; i<5; i++){
            GeneralObject object = new GeneralObject("https://relaunch-live.s3.amazonaws.com/cms/media/images/1200x800/14726.jpg","Virat");
            objects.add(object);
        }

        rcvMovies.setLayoutManager(new GridLayoutManager(this, 2));
        BaseRecyclerAdapter adapter = new BaseRecyclerAdapter(this,objects);
        rcvMovies.setAdapter(adapter);
    }
}
