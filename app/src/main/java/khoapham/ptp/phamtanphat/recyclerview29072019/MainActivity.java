package khoapham.ptp.phamtanphat.recyclerview29072019;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Monan> monans;
    MonanAdapter monanAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        monans = new ArrayList<>();
        monans.add(new Monan("Cá kho",35000,R.drawable.cakho));
        monans.add(new Monan("Canh chua cá lóc",25000,R.drawable.canhchuacaloc));
        monans.add(new Monan("Chả cá ",15000,R.drawable.chacalavong));
        monans.add(new Monan("Chả giò",20000,R.drawable.chagio));
        monans.add(new Monan("Cơm sườn",25000,R.drawable.comsuon));

        monanAdapter = new MonanAdapter(monans);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(monanAdapter);


    }
}
