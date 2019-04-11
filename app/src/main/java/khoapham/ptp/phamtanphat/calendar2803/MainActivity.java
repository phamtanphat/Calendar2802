package khoapham.ptp.phamtanphat.calendar2803;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    EditText edtSomin,edtSomax;
    Button btnDem;
    TextView txtNgay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtSomax = findViewById(R.id.edittextNgaymax);
        edtSomin = findViewById(R.id.edittextNgaymin);
        btnDem = findViewById(R.id.buttonDem);
        txtNgay = findViewById(R.id.textviewNgay);


    }
}
