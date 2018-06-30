package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int correct = 0;
    int incorrect = 0;
    int total = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* This method is called when the Submit button is pressed */
    public void SubmitTest (View view){
        /* Check correct answer for question 1 */
        RadioButton answerQ1 = (RadioButton) findViewById(R.id.radio_1c);
        if (answerQ1.isChecked()) {
            correct = correct + 1;
        } else {
            incorrect = incorrect + 1;
        }

        /* Check correct answer for question 2 */
        CheckBox checkBox_2a = (CheckBox) findViewById(R.id.checkbox_2a);
        CheckBox checkBox_2b = (CheckBox) findViewById(R.id.checkbox_2b);
        CheckBox checkBox_2c = (CheckBox) findViewById(R.id.checkbox_2c);
        if ((checkBox_2a.isChecked() && checkBox_2c.isChecked()) && (!checkBox_2b.isChecked())){
            correct = correct + 1;
        } else {
            incorrect = incorrect + 1;
        }

        /* Check correct answer for question 3 */
        EditText editText_3 = (EditText) findViewById(R.id.text_answer);
        String answerQ3 = editText_3.getText().toString();
        if (answerQ3.equalsIgnoreCase("Vacuum tube")) {
            correct = correct + 1;
        } else {
            incorrect = incorrect + 1;
        }

        /* Check correct answer for question 4 */
        RadioButton answerQ4 = (RadioButton) findViewById(R.id.radio_4a);
        if (answerQ4.isChecked()) {
            correct = correct + 1;
        } else {
            incorrect = incorrect + 1;
        }

        /* Check correct answer for question 5 */
        CheckBox checkBox_5a = (CheckBox) findViewById(R.id.checkbox_5a);
        CheckBox checkBox_5b = (CheckBox) findViewById(R.id.checkbox_5b);
        CheckBox checkBox_5c = (CheckBox) findViewById(R.id.checkbox_5c);
        if ((checkBox_5a.isChecked() && checkBox_5b.isChecked()) && (!checkBox_5c.isChecked())){
            correct = correct + 1;
        } else {
            incorrect = incorrect + 1;
        }

        /* Display the score as a toast */
        Toast.makeText(MainActivity.this, "Total marks scored is " + correct +
                " out of " + "5", Toast.LENGTH_LONG).show();
        correct = 0;
    }

    /* This method is called when the Review Questions button is pressed */
    public void ResetTest (View view){
        /* Clears all selected radio buttons for Question 1 */
        RadioGroup radioGroupQ1 = (RadioGroup) findViewById(R.id.radiogroup_1);
        radioGroupQ1.clearCheck();

        /* Clears all selected radio buttons for Question 4 */
        RadioGroup radioGroupQ4 = (RadioGroup) findViewById(R.id.radiogroup_4);
        radioGroupQ4.clearCheck();

        /* Clears the selected checkboxes for Question 2 */
        CheckBox checkBox2A = (CheckBox) findViewById(R.id.checkbox_2a);
        checkBox2A.setChecked(false);

        CheckBox checkBox2B = (CheckBox) findViewById(R.id.checkbox_2b);
        checkBox2B.setChecked(false);

        CheckBox checkBox2C = (CheckBox) findViewById(R.id.checkbox_2c);
        checkBox2C.setChecked(false);

        /* Clears the selected checkboxes for Question 5 */
        CheckBox checkBox5A = (CheckBox) findViewById(R.id.checkbox_5a);
        checkBox5A.setChecked(false);

        CheckBox checkBox5B = (CheckBox) findViewById(R.id.checkbox_5b);
        checkBox5B.setChecked(false);

        CheckBox checkBox5C = (CheckBox) findViewById(R.id.checkbox_5c);
        checkBox5C.setChecked(false);

        /* Clears the EditText for Question 3 */
        EditText txtAnswer = (EditText) findViewById(R.id.text_answer);
        txtAnswer.getText().clear();

    }

    /* This method is called when the Submit button is pressed */
    public void ReviewAnswers (View view){

    }
}
