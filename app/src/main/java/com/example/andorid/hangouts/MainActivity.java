/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/

package com.example.andorid.hangouts;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.andorid.hangouts.R;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int quantity =0;
    int quantities=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        int price = quantity*5 + quantities*6;
        String priceMessage= "The Amount is $"+ price;
        priceMessage = priceMessage + "\nThank You!";
        displayMessage(priceMessage);
    }
    /**
     * This method is called when the + button is clicked.
     */
    public void increment(View view) {

        quantity = quantity + 1;
        displays(quantity);
    }

    public void decrement(View view) {

        quantity = quantity - 1;
        displays(quantity);
    }

    public void increments(View view) {

        quantities = quantities + 1;
        display(quantities);
    }

    public void decrements(View view) {

        quantities = quantities - 1;
        display(quantities);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    private void displays(int number) {
        TextView quantitiesTextView = (TextView) findViewById(R.id.quantities_text_view);
        quantitiesTextView.setText("" + number);
    }


    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
}