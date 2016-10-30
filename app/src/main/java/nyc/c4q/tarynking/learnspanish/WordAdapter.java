package nyc.c4q.tarynking.learnspanish;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.List;

/**
 * Created by tarynking on 10/29/16.
 */

public class WordAdapter extends RecyclerView.Adapter {

    private List<SpanishWord> spanishWordList = Arrays.asList(
            new SpanishWord("Cabeza"),
            new SpanishWord("Cuello"),
            new SpanishWord("Dedos De Los Manos"),
            new SpanishWord("Garganta"),
            new SpanishWord("La Barriga"),
            new SpanishWord("La Boca"),
            new SpanishWord("La Cara"),
            new SpanishWord("La Espalda"),
            new SpanishWord("La Frente"),
            new SpanishWord("La Lengua"),
            new SpanishWord("La Nariz"),
            new SpanishWord("La Oreja"),
            new SpanishWord("La Pierna"),
            new SpanishWord("La Rodilla"),
            new SpanishWord("Los Brazos"),
            new SpanishWord("Los Dedos"),
            new SpanishWord("Los Dientes"),
            new SpanishWord("Los Hombres"),
            new SpanishWord("Los Labios"),
            new SpanishWord("Los Manos"),
            new SpanishWord("Los Ojos"),
            new SpanishWord("Los Pies"),
            new SpanishWord("Pelo")

    );


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        MyViewHolder viewHolder = (MyViewHolder) holder;
        SpanishWord spanishWord = spanishWordList.get(position);
        String linkName = spanishWordList.get(position).getSpanishWord();
        viewHolder.bind(spanishWord);
        viewHolder.spanishWord.setOnClickListener(buildEmployeeClickListener(spanishWordList.get(position)));
        viewHolder.spanishWord.setOnClickListener(navigateToEmployeeViewListener(linkName));
    }



    private View.OnClickListener buildEmployeeClickListener(SpanishWord spanishWord) {
        if (spanishWord != null){
            return navigateToEmployeeViewListener(spanishWord.getSpanishWord());
        }
        return defaultClickListener();
    }

    private View.OnClickListener navigateToEmployeeViewListener(final String name) {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), PictureView.class);
                intent.putExtra(PictureView.BODY_PART_NAME, name);
                view.getContext().startActivity(intent);
            }
        };
    }

    private View.OnClickListener defaultClickListener() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Do Nothing
            }
        };
    }


    @Override
    public int getItemCount() {
        return spanishWordList.size();
    }


}
