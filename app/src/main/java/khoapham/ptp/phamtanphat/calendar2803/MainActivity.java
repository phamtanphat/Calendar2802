package khoapham.ptp.phamtanphat.calendar2803;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    EditText edtSomin,edtSomax;
    Button btnDem;
    TextView txtNgay;
    Calendar calendar1,calendar2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtSomax = findViewById(R.id.edittextNgaymax);
        edtSomin = findViewById(R.id.edittextNgaymin);
        btnDem = findViewById(R.id.buttonDem);
        txtNgay = findViewById(R.id.textviewNgay);
        calendar1 = Calendar.getInstance();
        calendar2 = Calendar.getInstance();

        edtSomin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        calendar1.set(year,month,dayOfMonth);
                        Log.d("BBB",calendar1.getTimeInMillis() + "");
                    }
                },2019,4,11 );
                datePickerDialog.show();

            }
        });
        edtSomax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        calendar2.set(year,month,dayOfMonth);

                    }
                },2019,4,11 );
                datePickerDialog.getDatePicker().setMinDate(calendar1.getTimeInMillis());
                datePickerDialog.show();

            }
        });

    }
}
