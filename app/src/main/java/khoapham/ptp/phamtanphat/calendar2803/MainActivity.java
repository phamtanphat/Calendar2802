package khoapham.ptp.phamtanphat.calendar2803;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calendar calendar = Calendar.getInstance();
        int ngay = calendar.get(Calendar.DATE);
        int thang = calendar.get(Calendar.MONTH);
        int gio = calendar.get(Calendar.HOUR_OF_DAY);

        calendar.set(ngay,thang,calendar.get(Calendar.YEAR));

//        Lay thoi gian hien tai
//        Date date = calendar.getTime();
        String time = new SimpleDateFormat("dd/MM/YYYY").format(Calendar.getInstance().getTime());

        Log.d("BBB", time + "");
    }
}
