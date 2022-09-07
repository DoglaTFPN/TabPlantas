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
    ListView lsdGatos;

    String nomeGato[]=
            {
                    "Gato da Quebrada",
                    "Nerdola otaku",
                    "Gato Pomba",
                    "Gato Romano"
            };
    String descricaoGato[]=
            {
            "O maior cheirador de pó de todos os tempos!!!",
            "Vive assistindo anime e chorando no telhado!!!",
            "Parece uma POMBA!!!",
            "estudou com maquiaveL1"
            };
    int imagemPlanta[]={
            R.drawable.almeiro
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        lsdGatos = view.findViewById(R.id.listaPlantas);

        //instanciando a classe adaptadora

        AdapterGatos adaperGatos = new AdapterGatos();

        //carregar a lista com o adaptador

        lsdGatos.setAdapter(adaperGatos);

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

            TextView txtNomeGato, txtDescricaoGato, txtNumGato;
            ImageView imgModeloGato;

            View v = getLayoutInflater().inflate(R.layout.modelogatos, null);



            txtNomeGato = v.findViewById(R.id.txtNomeGato);
            txtDescricaoGato = v.findViewById(R.id.txtDescricaoGato);
            txtNumGato = v.findViewById(R.id.txtNumGato);
            imgModeloGato = v.findViewById(R.id.imgModeloGato);

            txtNomeGato.setText(nomeGato[i]);
            txtDescricaoGato.setText(descricaoGato[i]);
            txtNumGato.setText(numGato[i]);
            imgModeloGato.setImageResource(imagemGato[i]);

            return v;

        }
    }
}