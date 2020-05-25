
package com.example.sqlite;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    EditText Input;
    TextView Text;
    DataBaseHandler dataBaseHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Input = (EditText) findViewById(R.id.Input);
        Text = (TextView) findViewById(R.id.Text);
        dataBaseHandler = new DataBaseHandler(this, null, null, 1);
        printDatabase();

    }

    public void addButtonClicked(View view){
        Products products = new Products(Input.getText().toString());
        dataBaseHandler.addProduct(products);
        printDatabase();
    }

    public void deleteButtonClicked (View view){
        String inputText = (Input.getText().toString());
        dataBaseHandler.deleteProduct(inputText);
        printDatabase();

    }

    public void printDatabase() {
        String dbString = dataBaseHandler.databaseToString();
        Text.setText(dbString);
        Input.setText("");


    }

}