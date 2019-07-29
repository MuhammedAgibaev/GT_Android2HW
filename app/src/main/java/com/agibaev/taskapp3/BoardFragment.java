package com.agibaev.taskapp3;

import android.graphics.Color;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BoardFragment extends Fragment {

    public BoardFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_board, container, false);
        ImageView imageView = view.findViewById(R.id.imageView);
        TextView textTitle = view.findViewById(R.id.textTitle);
        TextView textDesc = view.findViewById(R.id.textDesc);
        LinearLayout background = view.findViewById(R.id.background);
        Button btnStart = view.findViewById(R.id.btnStart);
        int pos = getArguments().getInt("pos");

        switch (pos){
            case 0:
                btnStart.setVisibility(View.GONE);
                imageView.setImageResource(R.drawable.vision);
                textTitle.setText("VISION");
                textDesc.setText("Вижен (англ. Vision), также известный как Виктор Шейд " +
                        "(англ. Victor Shade) — персонаж, робот-андроид из комиксов " +
                        "издательства Marvel Comics, член Мстителей.");
                background.setBackgroundColor(Color.GREEN);
                break;
            case 1:
                btnStart.setVisibility(View.GONE);
                imageView.setImageResource(R.drawable.deadpool);
                textTitle.setText("DEADPOOL");
                textDesc.setText("Дэдпул ( Уэйд Уинстон Уилсон ) - вымышленный персонаж, " +
                        "появляющийся в американских комиксах, опубликованных Marvel Comics ");
                background.setBackgroundColor(Color.YELLOW);
                break;
            case 2:
                btnStart.setVisibility(View.VISIBLE);
                imageView.setImageResource(R.drawable.capitan);
                textTitle.setText("CAPTAIN AMERICA and IRON MAN");
                textDesc.setText("Железный Человек и Капитан Америка: Герои Юнайтед - это прямой " +
                        "анимационный фильм Marvel Animation");
                background.setBackgroundColor(Color.GREEN);
        }
        return view;

    }

}
