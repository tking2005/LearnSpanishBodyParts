package nyc.c4q.tarynking.learnspanish;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import nyc.c4q.tarynking.learnspanish.bodyparts.Cabeza;
import nyc.c4q.tarynking.learnspanish.bodyparts.Cuello;
import nyc.c4q.tarynking.learnspanish.bodyparts.LaCara;
import nyc.c4q.tarynking.learnspanish.bodyparts.LaEspalda;
import nyc.c4q.tarynking.learnspanish.bodyparts.LasManos;

public class PictureView extends AppCompatActivity {
    public static final String BODY_PART_NAME = "extra.bodypart.name";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_fragment);
        String bodypart = getIntent().getStringExtra(BODY_PART_NAME);
        if(bodypart != null){
            switch (bodypart){
                case "Las Manos":
                    showLosManos();
                    break;
                case "La Cara":
                    showCara();
                    break;
                case "Cabeza":
                    showCara();
                    break;
                case "Cuello":
                    showCara();
                    break;
                case "Dedos De Las Manos":
                    showCara();
                    break;
                case "Garganta":
                    showCara();
                    break;
                case "La Barriga":
                    showCara();
                    break;
                case "La Boca":
                    showCara();
                    break;
                case "La Espalda":
                    showCara();
                    break;
                case "La Frente":
                    showCara();
                    break;
                case "La Lengua":
                    showCara();
                    break;
                case "Nariz":
                    showCara();
                    break;
                case "La Pierna":
                    showCara();
                    break;
                case "La Rodilla":
                    showCara();
                    break;
                case "La Oreja":
                    showCara();
                    break;
                case "Los Brazos":
                    showCara();
                    break;
                case "Los Dientes":
                    showCara();
                    break;

                default:
                    break;
            }

        }
    }

    private void showLosManos(){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.body_part_profile,new LasManos());
        fragmentTransaction.commit();
    }
    private void showCara(){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.body_part_profile,new LaCara());
        fragmentTransaction.commit();
    }

    private void showCabeza(){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.body_part_profile,new Cabeza());
        fragmentTransaction.commit();
    }

    private void showCuello(){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.body_part_profile,new Cuello());
        fragmentTransaction.commit();
    }

    private void showEspalda(){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.body_part_profile,new LaEspalda());
        fragmentTransaction.commit();
    }
}
