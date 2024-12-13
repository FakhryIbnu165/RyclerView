package com.example.recylerview;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private StudentAdapter studentAdapter;
    private List<Student> studentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Hardcoded list of students
        studentList = new ArrayList<>();
        studentList.add(new Student("2312500578", "Fakhry Ibnu Fadillah", "fakhryibnu165@gmail.com", "2005-05-10"));
        studentList.add(new Student("2312500516", "Pratama", "pratama17@gmail.com", "2005-010-10"));
        studentList.add(new Student("2311500555", "zahrif udin", "udin1010@yahoo.com", "2003-11-03"));
        studentList.add(new Student("2312500581", "putri sembiring", "putseb@yahoo.com", "2003-04-12"));
        studentList.add(new Student("2311500998", "arya bimo", "aryabimo@gmail.com", "1999-10-02"));

        studentAdapter = new StudentAdapter(studentList);
        recyclerView.setAdapter(studentAdapter);
    }
}