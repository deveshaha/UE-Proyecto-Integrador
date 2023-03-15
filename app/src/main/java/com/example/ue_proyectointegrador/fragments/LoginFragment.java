package com.example.ue_proyectointegrador.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ue_proyectointegrador.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class LoginFragment extends Fragment implements View.OnClickListener {
    EditText etEmail, etPassword;
    Button btnSignIn;
    Button btnRegister;
    FragmentManager fm;
    private FirebaseAuth fba;
    private FirebaseUser user;

    public LoginFragment() {
        // Required empty public constructor
    }


    public static LoginFragment newInstance() {
        LoginFragment fragment = new LoginFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_login, container, false);
       fm = getActivity().getSupportFragmentManager();
       etEmail = view.findViewById(R.id.etEmail);
       etPassword = view.findViewById(R.id.etPassword);
       btnSignIn = view.findViewById(R.id.btnSignIn);
       btnRegister = view.findViewById(R.id.btnRegister);
       btnSignIn.setOnClickListener(this);
         btnRegister.setOnClickListener(this);

       fba = FirebaseAuth.getInstance();
       user = fba.getCurrentUser();
       if (user == null ){
           btnSignIn.setEnabled(true);
           btnRegister.setEnabled(true);
       }else{
           etEmail.setText(user.getEmail());
           btnRegister.setEnabled(true);
           btnSignIn.setEnabled(true);
       }


        return view;
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnSignIn){
            login();
        } else if (v.getId() == R.id.btnRegister){
            register();

        }
    }

    private void register() {
        String email = etEmail.getText().toString().trim();
        String pass = etPassword.getText().toString().trim();

        if (email.isEmpty() || pass.isEmpty()){
            Snackbar.make(etEmail, R.string.no_data, Snackbar.LENGTH_LONG).show();
        }else if (pass.length() < 8 ){
            Snackbar.make(etPassword, R.string.txt_Pwd, Snackbar.LENGTH_LONG).show();
        }else {
           fba.createUserWithEmailAndPassword(email, pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
               @Override
               public void onComplete(@NonNull Task<AuthResult> task) {
                   if (task.isSuccessful()){
                       user = fba.getCurrentUser();
                       Snackbar.make(etEmail, R.string.msg_registerOk, Snackbar.LENGTH_LONG).show();
                       fm.popBackStack();
                       btnRegister.setEnabled(false);
                       btnSignIn.setEnabled(true);
                       etEmail.setText("");
                       etPassword.setText("");

                   }else{
                       Snackbar.make(etEmail, R.string.msg_registerNoOk, Snackbar.LENGTH_LONG).show();
                   }
               }
           });
        }
    }

    private void login() {
        String email = etEmail.getText().toString().trim();
        String pass = etPassword.getText().toString().trim();
        if (email.isEmpty() || pass.isEmpty()){
            Snackbar.make(etEmail, R.string.no_data, Snackbar.LENGTH_LONG).show();
        }else{
            fba.signInWithEmailAndPassword(email, pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()){
                        user = fba.getCurrentUser();
                        Toast.makeText(getContext(), R.string.login_ok, Toast.LENGTH_LONG).show();
                        fm.popBackStack();
                    }else{
                        Snackbar.make(etEmail, R.string.msg_userNoResgister, Snackbar.LENGTH_LONG).show();
                        btnSignIn.setEnabled(false);
                    }
                }
            });
        }
    }

}