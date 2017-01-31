package com.chimeras.mangareader;

import android.os.AsyncTask;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * Created by lcastillo on 30/01/2017.
 */

public class LoadAndParseUrl extends AsyncTask<String, Void, String> {
    @Override
    protected String doInBackground(String... strings) {
        try {
            Document doc = Jsoup.connect(strings[0]).get();
        } catch (IOException e) {
            return e.getMessage();
        }
        return null;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
    }
}

