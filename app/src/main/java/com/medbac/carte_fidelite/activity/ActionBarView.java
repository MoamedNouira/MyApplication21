package com.medbac.carte_fidelite.activity;

/**
 * Created by Mohamed Nouira on 15/05/2015.
 */
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import activity.carte_fidelite.medbac.com.cartefidelite.R;

public class ActionBarView extends LinearLayout implements OnClickListener{
    private View 		mConvertView;

    private ImageButton 				mButtonHome;
    private TextView 					mTitle;

    private OnDispatchClickListener 	mListenerClick;

    public interface OnDispatchClickListener {
        public void onDispatchClick(int id);
    }

    public ActionBarView(Context context, AttributeSet attrs) {

        super(context,attrs);

        mConvertView 	= LayoutInflater.from(context).inflate(R.layout.action_bar, this);

        mButtonHome		= (ImageButton)mConvertView.findViewById(R.id.ab_home);
        mTitle  		= (TextView)mConvertView.findViewById(R.id.ab_title);

        mButtonHome.setOnClickListener(this);

    }




    public void setTitle(String _t)
    {
        mTitle.setText(_t);
    }

    public void onClick(View v) {
        mListenerClick.onDispatchClick(v.getId());
    }
    public void setOnDispatchClickListener(OnDispatchClickListener v) {
        mListenerClick = v;
    }

}

