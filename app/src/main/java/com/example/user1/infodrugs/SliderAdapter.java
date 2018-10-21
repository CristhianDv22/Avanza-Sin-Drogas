package com.example.user1.infodrugs;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SliderAdapter extends PagerAdapter {

    private Context context;

    private LayoutInflater layoutInflater;

//    private TextView slideHeading, slideDescription;
//    private ImageView slide_imageView;


    public SliderAdapter(Context context) {

        this.context = context;

    }

    // img Array
    public int[] image_slide ={
            R.drawable.question,
            R.drawable.question,
            R.drawable.question,
            R.drawable.question,
            R.drawable.question,
            R.drawable.question,
            R.drawable.question,
            R.drawable.question,
            R.drawable.question,
            R.drawable.question,

    };

    // heading Array
    public String[] heading_slide ={
            "N°1",
            "N°2",
            "N°3",
            "N°4",
            "N°5",
            "N°6",
            "N°7",
            "N°8",
            "N°9",
            "N°10",
    };

    // description Array
    public String[] description_slide ={
            "¿Ha percibido cambios de conducta o comportamientos muy repentinos últimamente en su hijo(a)?",
            "Ha notado a su hijo(a) más agresivo cuando nunca no lo ha sido?",
            "Ha notado a su hijo más retraído cuando nunca no lo ha sido?",
            "Percibe usted alteraciones de sueño en su hijo(a), cuando no es una persona ocupada?",
            "Ha notado a su hijo(a) acelerado más de lo normal?",
            "Últimamente ha empezado a pedir y a exigir más dinero sin justa causa?",
            "¿Ha consumido usted SPA (Drogas Psicoactivas) alguna vez?",
            "¿Qué opinión  tiene usted de las drogas?",
            "¿Ha hablado usted con su hijo(a) sobre el tema de las drogas?",
            "¿Tiene usted conocimientos sobre los efectos y alteraciones de conducta de cada tipo de droga?"

    };




    @Override
    public int getCount() {

        return heading_slide.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout, container,false);
        container.addView(view);

        ImageView slide_imageView = view.findViewById(R.id.imageView1);
        TextView slideHeading = view.findViewById(R.id.tvHeading);
        TextView  slideDescription = view.findViewById(R.id.tvDescription);


        slide_imageView.setImageResource(image_slide[position]);
        slideHeading.setText(heading_slide[position]);
        slideDescription.setText(description_slide[position]);


        return view;
    }



    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((RelativeLayout)object);
    }

//    @Override
//    public void destroyItem(ViewGroup container, int position, Object object) {
//        View view = (View) object;
//        container.removeView(view);
//    }

}
