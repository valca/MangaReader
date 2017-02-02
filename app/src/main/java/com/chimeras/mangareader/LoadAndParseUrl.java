package com.chimeras.mangareader;

import android.app.Activity;
import android.os.AsyncTask;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by lcastillo on 30/01/2017.
 */

public class LoadAndParseUrl extends AsyncTask<Object, Void, String> {

    MainActivity activity;

    @Override
    protected String doInBackground(Object... params) {
        String debug_text = "";

        try {
            activity = (MainActivity) params[0];
            String url = (String) params[1];

            Document doc = Jsoup.connect(url).get();

            Elements mangas = doc.select("ul.manga-list div.cover-info p.title");

            for (Element manga:mangas) {
                debug_text += manga.text() + "\n";
            }
        } catch (IOException e) {
            return e.getMessage();
        }
        return debug_text;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);

        activity.displayDebugText(s);
    }
}

