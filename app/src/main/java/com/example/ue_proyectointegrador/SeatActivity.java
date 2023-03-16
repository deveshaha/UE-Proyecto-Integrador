package com.example.ue_proyectointegrador;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class SeatActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvNameCinema;
    TextView tvTitleMovie;
    EditText etDate;
    EditText etHour;
    ImageButton ibSeat1, ibSeat2, ibSeat3, ibSeat4, ibSeat5, ibSeat6;
    ImageButton ibSeat7, ibSeat8, ibSeat9, ibSeat10, ibSeat11, ibSeat12;
    ImageButton ibSeat13, ibSeat14, ibSeat15, ibSeat16, ibSeat17, ibSeat18;
    ImageButton ibSeat19, ibSeat20, ibSeat21, ibSeat22, ibSeat23, ibSeat24;
    ImageButton ibSeat25, ibSeat26, ibSeat27, ibSeat28, ibSeat29, ibSeat30;
    Button btnBuy;
    final Calendar calendar = Calendar.getInstance();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seat);
        reference();
        tvNameCinema.setText(getIntent().getStringExtra("cine"));
        tvTitleMovie.setText(getIntent().getStringExtra("movie"));
        String idMovie = getIntent().getStringExtra("sala");
        DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int day) {
                calendar.set(Calendar.YEAR, year);
                calendar.set(Calendar.MONTH, month);
                calendar.set(Calendar.DAY_OF_MONTH, day);
                upgradeDateTime();
            }
        };
        etDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new DatePickerDialog(SeatActivity.this, date, calendar.get(Calendar.YEAR),
                        calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });

        TimePickerDialog.OnTimeSetListener timeSetListener = (view, horas, min) -> {
            String hora = horas + ":" + min;
            etHour.setText(hora);
        };

        etHour.setOnClickListener(v -> {
            TimePickerDialog timePickerDialog =
                    new TimePickerDialog(this, timeSetListener, 0, 0, true);
            timePickerDialog.show();
        });
    }

    private void upgradeDateTime() {
        String format = "dd/MM/yy";
        SimpleDateFormat FormatDate = new SimpleDateFormat(format, Locale.forLanguageTag("es"));
        etDate.setText(FormatDate.format(calendar.getTime()));
    }

    private void reference() {
        tvNameCinema = findViewById(R.id.tvNameCinema);
        tvTitleMovie = findViewById(R.id.tvTitleMovie);
        etDate = findViewById(R.id.etDate);
        etHour = findViewById(R.id.etHour);
        ibSeat1 = findViewById(R.id.ibSeat1);
        ibSeat2 = findViewById(R.id.ibSeat2);
        ibSeat3 = findViewById(R.id.ibSeat3);
        ibSeat4 = findViewById(R.id.ibSeat4);
        ibSeat5 = findViewById(R.id.ibSeat5);
        ibSeat6 = findViewById(R.id.ibSeat6);
        ibSeat7 = findViewById(R.id.ibSeat7);
        ibSeat8 = findViewById(R.id.ibSeat8);
        ibSeat9 = findViewById(R.id.ibSeat9);
        ibSeat10 = findViewById(R.id.ibSeat10);
        ibSeat11 = findViewById(R.id.ibSeat11);
        ibSeat12 = findViewById(R.id.ibSeat12);
        ibSeat13 = findViewById(R.id.ibSeat13);
        ibSeat14 = findViewById(R.id.ibSeat14);
        ibSeat15 = findViewById(R.id.ibSeat15);
        ibSeat16 = findViewById(R.id.ibSeat16);
        ibSeat17 = findViewById(R.id.ibSeat17);
        ibSeat18 = findViewById(R.id.ibSeat18);
        ibSeat19 = findViewById(R.id.ibSeat19);
        ibSeat20 = findViewById(R.id.ibSeat20);
        ibSeat21 = findViewById(R.id.ibSeat21);
        ibSeat22 = findViewById(R.id.ibSeat22);
        ibSeat23 = findViewById(R.id.ibSeat23);
        ibSeat24 = findViewById(R.id.ibSeat24);
        ibSeat25 = findViewById(R.id.ibSeat25);
        ibSeat26 = findViewById(R.id.ibSeat26);
        ibSeat27 = findViewById(R.id.ibSeat27);
        ibSeat28 = findViewById(R.id.ibSeat28);
        ibSeat29 = findViewById(R.id.ibSeat29);
        ibSeat30 = findViewById(R.id.ibSeat30);
        btnBuy = findViewById(R.id.btnBuy);
        ibSeat1.setOnClickListener(this);
        ibSeat2.setOnClickListener(this);
        ibSeat3.setOnClickListener(this);
        ibSeat4.setOnClickListener(this);
        ibSeat5.setOnClickListener(this);
        ibSeat6.setOnClickListener(this);
        ibSeat7.setOnClickListener(this);
        ibSeat8.setOnClickListener(this);
        ibSeat9.setOnClickListener(this);
        ibSeat10.setOnClickListener(this);
        ibSeat11.setOnClickListener(this);
        ibSeat12.setOnClickListener(this);
        ibSeat13.setOnClickListener(this);
        ibSeat14.setOnClickListener(this);
        ibSeat15.setOnClickListener(this);
        ibSeat16.setOnClickListener(this);
        ibSeat17.setOnClickListener(this);
        ibSeat18.setOnClickListener(this);
        ibSeat19.setOnClickListener(this);
        ibSeat20.setOnClickListener(this);
        ibSeat21.setOnClickListener(this);
        ibSeat22.setOnClickListener(this);
        ibSeat23.setOnClickListener(this);
        ibSeat24.setOnClickListener(this);
        ibSeat25.setOnClickListener(this);
        ibSeat26.setOnClickListener(this);
        ibSeat27.setOnClickListener(this);
        ibSeat28.setOnClickListener(this);
        ibSeat29.setOnClickListener(this);
        ibSeat30.setOnClickListener(this);
        btnBuy.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        ImageButton ib = (ImageButton) v;
        int tickets[] = new int[30];
        if (ib.isSelected()) {
            ib.setSelected(false);
            for (int i = 0; i < tickets.length; i++) {
                tickets[i] = ib.getId();
            }
            btnBuy.setText("Comprar" + " " + tickets.length + " " + "entradas");
        } else {
            ib.setSelected(true);
        }
    }
}