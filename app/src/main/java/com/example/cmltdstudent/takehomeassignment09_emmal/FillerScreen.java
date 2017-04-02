package com.example.cmltdstudent.takehomeassignment09_emmal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FillerScreen extends AppCompatActivity {

    private EditText studentName;
    private EditText ageNumber;
    private CheckBox graduatedBool;
    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference userRef = database.getReference("overview");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filler_screen);

        studentName = (EditText) findViewById(R.id.student_name);
        ageNumber = (EditText) findViewById(R.id.age_text);
        graduatedBool = (CheckBox) findViewById(R.id.graduated_box);
    }

    public void save (View view)
    {
        String name = studentName.getText().toString();
        int age = Integer.parseInt(ageNumber.getText().toString());
        boolean graduated = graduatedBool.isChecked();


        Student student = new Student(name, age, graduated);
        userRef.push().setValue(student);

        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
