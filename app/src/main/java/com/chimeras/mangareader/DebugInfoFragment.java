package com.chimeras.mangareader;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link DebugInfoFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link DebugInfoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DebugInfoFragment extends Fragment {
    static final String ARG_DEBUG_TEXT = "debug_text";

    private String debug_text;

    public DebugInfoFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param debug_text Debug text to display.
     * @return A new instance of fragment DebugInfoFragment.
     */
    public static DebugInfoFragment newInstance(String debug_text) {
        DebugInfoFragment fragment = new DebugInfoFragment();
        Bundle args = new Bundle();
        args.putString(ARG_DEBUG_TEXT, debug_text);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            debug_text = getArguments().getString(ARG_DEBUG_TEXT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View fragment =  inflater.inflate(R.layout.fragment_debug_info, container, false);

        TextView debug_view = (TextView) fragment.findViewById(R.id.debug_info_text);
        debug_view.setText(debug_text);

        return fragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

}
