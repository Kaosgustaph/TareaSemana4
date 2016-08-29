package arena.com.petagram.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import arena.com.petagram.Adapters.PerroAdaptador;
import arena.com.petagram.Pollo.Perro;
import arena.com.petagram.R;

/**
 * Created by PC-1 on 26/08/2016.
 */
public class RecyclerViewFragment extends Fragment {
RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    ArrayList<Perro> listaPerros;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v= inflater.inflate(R.layout.recyclerview_fragment, container, false);

        recyclerView = (RecyclerView) v.findViewById(R.id.recyclerview);
        linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);


        inicializarAdaptador();


        return v;
    }

    public void setListaPerros(ArrayList<Perro> listaPerros)
    {
        this.listaPerros= listaPerros;
    }

    public ArrayList<Perro> getListaPerros(){return this.listaPerros;}


    private void inicializarAdaptador() {

        PerroAdaptador adaptador = new PerroAdaptador(listaPerros, getActivity());
        recyclerView.setAdapter(adaptador);

    }



}
