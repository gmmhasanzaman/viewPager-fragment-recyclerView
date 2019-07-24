package com.example.viewpagerfragment;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.viewpagerfragment.Adapter.ContactAdapter;
import com.example.viewpagerfragment.Model.Contact;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ContactFragment extends Fragment {

    private RecyclerView recyclerView;
    private List<Contact> contactList;
    private ContactAdapter adapter;
    View view;


    public ContactFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_contact, container, false);

        recyclerView = view.findViewById(R.id.contactRVId);
        adapter = new ContactAdapter(getContext(),contactList);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        recyclerView.setAdapter(adapter);


        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        contactList = new ArrayList<>();
        contactList.add(new Contact("Hasan","01921681616",R.drawable.groceries));
        contactList.add(new Contact("Zaman","01921681616",R.drawable.cable));
        contactList.add(new Contact("Hasib","01921681616",R.drawable.calendar));
        contactList.add(new Contact("Maruf","01921681616",R.drawable.clothes));
        contactList.add(new Contact("Tushar","01921681616",R.drawable.fees));
        contactList.add(new Contact("Saiful","01921681616",R.drawable.drug));
        contactList.add(new Contact("Asif","01921681616",R.drawable.electricity));
        contactList.add(new Contact("Sadi","01921681616",R.drawable.entertainment));
        contactList.add(new Contact("Hasan","01921681616",R.drawable.groceries));
        contactList.add(new Contact("Zaman","01921681616",R.drawable.cable));
        contactList.add(new Contact("Hasib","01921681616",R.drawable.calendar));
        contactList.add(new Contact("Maruf","01921681616",R.drawable.clothes));
        contactList.add(new Contact("Tushar","01921681616",R.drawable.fees));
        contactList.add(new Contact("Saiful","01921681616",R.drawable.drug));
        contactList.add(new Contact("Asif","01921681616",R.drawable.electricity));
        contactList.add(new Contact("Sadi","01921681616",R.drawable.entertainment));

        contactList.add(new Contact("Hasan","01921681616",R.drawable.groceries));
        contactList.add(new Contact("Zaman","01921681616",R.drawable.cable));
        contactList.add(new Contact("Hasib","01921681616",R.drawable.calendar));
        contactList.add(new Contact("Maruf","01921681616",R.drawable.clothes));
        contactList.add(new Contact("Tushar","01921681616",R.drawable.fees));
        contactList.add(new Contact("Saiful","01921681616",R.drawable.drug));
        contactList.add(new Contact("Asif","01921681616",R.drawable.electricity));
        contactList.add(new Contact("Sadi","01921681616",R.drawable.entertainment));

        contactList.add(new Contact("Hasan","01921681616",R.drawable.groceries));
        contactList.add(new Contact("Zaman","01921681616",R.drawable.cable));
        contactList.add(new Contact("Hasib","01921681616",R.drawable.calendar));
        contactList.add(new Contact("Maruf","01921681616",R.drawable.clothes));
        contactList.add(new Contact("Tushar","01921681616",R.drawable.fees));
        contactList.add(new Contact("Saiful","01921681616",R.drawable.drug));
        contactList.add(new Contact("Asif","01921681616",R.drawable.electricity));
        contactList.add(new Contact("Sadi","01921681616",R.drawable.entertainment));
    }
}
