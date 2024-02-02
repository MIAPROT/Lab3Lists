package org.leftbrained.listapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class EmployeeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee);
        RecyclerView rvEmployees = (RecyclerView) findViewById(R.id.rvEmployees);
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Tester1", "Team 1", R.drawable.avatar));
        employees.add(new Employee("Tester2", "Team 2", R.drawable.avatar));
        employees.add(new Employee("Tester3", "Team 3", R.drawable.avatar));
        EmployeeAdapter adapter = new EmployeeAdapter(employees);
        rvEmployees.setAdapter(adapter);
        rvEmployees.setLayoutManager(new LinearLayoutManager(this));
    }
}
