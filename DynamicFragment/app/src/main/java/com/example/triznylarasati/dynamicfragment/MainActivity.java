package com.example.triznylarasati.dynamicfragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //memanggil id-id widget
        final Button login_btn = (Button) findViewById(R.id.login_btn);
        loadFragment(new FragmentSatu(), null, null, null);

        login_btn.setOnClickListener(new View.OnClickListener() {

            //button login saat diklik
            @Override
            public void onClick(View v) {
                if(v == findViewById(R.id.login_btn)) {
                    //logika if saat tombol login
                    if(login_btn.getText().equals("Login")){
                    //get the component
                    EditText name_obj = (EditText) findViewById(R.id.nama_ins);
                    EditText pass_obj = (EditText) findViewById(R.id.pass_ins);
                    EditText email_obj = (EditText) findViewById(R.id.email_ins);
                    if (name_obj.getText().toString().length() == 0) {
                        name_obj.setError("Name is required!");
                    } else if (pass_obj.getText().toString().length() == 0){
                        pass_obj.setError("Password is required!");
                    } else if (email_obj.getText().toString().length() == 0) {
                        email_obj.setError("Email is required!");
                    } else if (!isValidEmail(email_obj.getText().toString())) {
                        email_obj.setError("Please use valid email address!");
                    } else {
                        //get the strings
                        String name = String.valueOf(name_obj.getText());
                        String password = String.valueOf(pass_obj.getText());
                        String email = String.valueOf(email_obj.getText());
                        //send it to load fragment method
                        loadFragment(new FragmentDua(), name, password, email);
                        login_btn.setText("Back");
                    }
                }
                //jika tombol back diklik, kembali ke fragment satu & berubah jadi tombol login lagi
                else if (login_btn.getText().equals("Back")) {
                    loadFragment(new FragmentSatu(), null, null, null);
                    login_btn.setText("Login");
                }
            }
        }
    });
}
    //method untuk meload fragment-fragment
    private void loadFragment(Fragment fragment, String a, String b, String c) {
        if (a == null && b == null && c == null) { //saat data-data kosong,
            // create a FragmentManager
            FragmentManager fm = getFragmentManager();
            // create a FragmentTransaction to begin the transaction and replace the Fragment
            FragmentTransaction ft = fm.beginTransaction();
            // replace the FrameLayout with new Fragment
            ft.replace(R.id.fragment_place, fragment);
            ft.commit(); // save the changes
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("name", a);
            bundle.putString("password", b);
            bundle.putString("email", c);
            fragment.setArguments(bundle);

            // create a FragmentManager
            FragmentManager fm = getFragmentManager();
            // create a FragmentTransaction to begin the transaction and replace the Fragment
            FragmentTransaction ft = fm.beginTransaction();
            // replace the FrameLayout with new Fragment
            ft.replace(R.id.fragment_place, fragment);
            ft.commit(); // save the changes
        }
    }
    private boolean isValidEmail(String target) {
        Log.i("INFO: ", String.valueOf(android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches()));
        return android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
    }
}