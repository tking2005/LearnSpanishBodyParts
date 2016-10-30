package nyc.c4q.tarynking.learnspanish;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by tarynking on 10/29/16.
 */

public class MyViewHolder extends RecyclerView.ViewHolder {

    private final View view;
    public TextView spanishWord;


    public MyViewHolder(ViewGroup parent) {
        super(inflateView(parent));
        view = itemView;
        spanishWord = (TextView) view.findViewById(R.id.spanish_word);
    }

    private static View inflateView(ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return inflater.inflate(R.layout.word_layout, parent, false);
    }

    public void bind(SpanishWord word) {
        spanishWord.setText(word.getSpanishWord());
    }

    public TextView getSpanishWord() {
        return spanishWord;
    }

}
