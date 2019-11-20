package id.ac.poliban.mi.andre.aplikasikalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etAp = findViewById(R.id.etAp);
        EditText etAk = findViewById(R.id.etAk);
        Button btnTambah = findViewById(R.id.btnTambah);
        Button btnKurang = findViewById(R.id.btnKurang);
        Button btnKali = findViewById(R.id.btnKali);
        Button btnBagi = findViewById(R.id.btnBagi);
        Button btnBersih = findViewById(R.id.btnBersihkan);
        TextView tvHasil = findViewById(R.id.tvHasil);

//        if(getIntent().getExtras()==null & getIntent().getExtras().isEmpty())
//            return;
        if(etAp.getText()==null && etAk.getText()==null)
            return;

        btnTambah.setOnClickListener(v -> {
        Integer aPertama = Integer.parseInt(etAp.getText().toString());
        Integer aKedua = Integer.parseInt(etAk.getText().toString());
        int hasilnya = aPertama + aKedua;
        tvHasil.setText(Integer.toString(hasilnya));
        });

        btnKurang.setOnClickListener(v -> {
        Integer aPertama = Integer.parseInt(etAp.getText().toString());
        Integer aKedua = Integer.parseInt(etAk.getText().toString());
        int hasilnya = aPertama - aKedua;
        tvHasil.setText(Integer.toString(hasilnya));
        });

        btnKali.setOnClickListener(v -> {
        Integer aPertama = Integer.parseInt(etAp.getText().toString());
        Integer aKedua = Integer.parseInt(etAk.getText().toString());
        int hasilnya = aPertama*aKedua;
        tvHasil.setText(Integer.toString(hasilnya));
        });

        btnBagi.setOnClickListener(v -> {
        Double aPertama = Double.parseDouble(etAp.getText().toString());
        Double aKedua = Double.parseDouble(etAk.getText().toString());
        double hasilnya = aPertama/aKedua;
        tvHasil.setText(Double.toString(hasilnya));
        });

        btnBersih.setOnClickListener(v -> {
            etAk.setText("");
            etAp.setText("");
            etAp.requestFocus();
            tvHasil.setText("0");
        });

    }
}
