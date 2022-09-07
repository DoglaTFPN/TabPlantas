package br.com.myskout.tablayoutfragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class HomeFragment extends Fragment {
    ListView listView;

    String nomePlanta[]=
            {
                    "Almeirão-de-árvore",
                    "Azedinha",
                    "Beldroega",
                    "Bertalha",
                    "Capuchinha"
            };
    String resumoPlanta[]=
            {
            "Plantio. Conservação e usos. Receitas. Almeirão-de-árvore: ornamenta e alimenta.",
            "Plantio. Conservação e usos. Receita. Azedinha: salada pronta.",
            "Plantio. Conservação e usos. Receita. Beldroega: reconhecida desde 1500.",
            "Plantio. Conservação e usos. Receita. Bertalha: feiras livres e tradição.",
            "Plantio. Conservação e usos. Receita. Capuchinha: curiosidade do nome."
            };
    int imagemPlanta[]={
            R.drawable.almeiro,
            R.drawable.azedinha,
            R.drawable.beldroega,
            R.drawable.bertalha,
            R.drawable.capuchinha
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        listView = view.findViewById(R.id.listaPlantas);

        //instanciando a classe adaptadora

        AdapterGatos adaperGatos = new AdapterGatos();

        //carregar a lista com o adaptador

        listView.setAdapter(adaperGatos);

        return view;
    }
    //criando a minha classe adaptadora... ou inner class
    public class AdapterGatos extends BaseAdapter{

        @Override
        public int getCount() {
            return imagemPlanta.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            TextView txtNomePlanta, txtResumoPlanta;
            ImageView imgModeloPlanta;

            View v = getLayoutInflater().inflate(R.layout.modelogatos, null);



            txtNomePlanta = v.findViewById(R.id.txtNomePlanta);
            txtResumoPlanta = v.findViewById(R.id.txtResumoPlanta);
            imgModeloPlanta = v.findViewById(R.id.imgModeloPlanta);

            txtNomePlanta.setText(nomePlanta[i]);
            txtResumoPlanta.setText(resumoPlanta[i]);
            imgModeloPlanta.setImageResource(imagemPlanta[i]);

            return v;

        }
    }
}