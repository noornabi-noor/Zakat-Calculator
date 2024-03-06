////package com.example.zakatcalculator;
////
////import static java.lang.Double.parseDouble;
////
////import androidx.appcompat.app.AppCompatActivity;
////
////import android.content.Intent;
////import android.os.Bundle;
////import android.view.View;
////import android.widget.Button;
////import android.widget.EditText;
////import android.widget.TextView;
////
////public class CalculatorActivity extends AppCompatActivity {
////
////    Button Calbutton,refreshBtn1,Prebtn;
////
////    TextView display;
////    EditText idcash,idBank,idGold,idSilver,idShare,idOthers,idHome,idOthersHome,idBusiness,idBusinessSave,idBorwGet,idPension,idOthersProfit,idAgri,idCredit,idFamily,idCar,idBusiBoro,idBoroOthers;
////
////    @Override
////    protected void onCreate(Bundle savedInstanceState) {
////        super.onCreate(savedInstanceState);
////        setContentView(R.layout.activity_calculator);
////
////        display=findViewById(R.id.display);
////
////        Prebtn = findViewById(R.id.Prebtn);
////        refreshBtn1=findViewById(R.id.refreshBtn1);
////        Calbutton=findViewById(R.id.Calbutton);
////
////        idcash = findViewById(R.id.idcash);
////        idBank = findViewById(R.id.idBank);
////        idGold = findViewById(R.id.idGold);
////        idSilver = findViewById(R.id.idSilver);
////        idShare = findViewById(R.id.idShare);
////        idOthers=findViewById(R.id.idOthers);
////        idHome = findViewById(R.id.idHome);
////        idOthersHome = findViewById(R.id.idOthersHome);
////        idBusiness= findViewById(R.id.idBusiness);
////        idBusinessSave = findViewById(R.id.idBusinessSave);
////        idBorwGet = findViewById(R.id.idBorwGet);
////        idPension=findViewById(R.id.idPension);
////        idOthersProfit = findViewById(R.id.idOthersProfit);
////        idAgri = findViewById(R.id.idAgri);
////        idCredit = findViewById(R.id.idCredit);
////        idFamily = findViewById(R.id.idFamily);
////        idCar = findViewById(R.id.idCar);
////        idBusiBoro=findViewById(R.id.idBusiBoro);
////        idBoroOthers = findViewById(R.id.idBoroOthers);
////
////
////        Prebtn.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View v) {
////                Intent myIntent = new Intent(CalculatorActivity.this, MainActivity.class);
////                startActivity(myIntent);
////                finish();
////            }
////        });
////
////        refreshBtn1.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View v) {
////                // Clear the EditText fields and TextView
////                display.setText("");
////                idcash.setText("");
////                idBank.setText("");
////                idGold.setText("");
////                idSilver.setText("");
////                idShare.setText("");
////                idOthers.setText("");
////                idHome.setText("");
////                idOthersHome.setText("");
////                idBusiness.setText("");
////                idBusinessSave.setText("");
////                idBorwGet.setText("");
////                idPension.setText("");
////                idOthersProfit.setText("");
////                idAgri.setText("");
////                idCredit.setText("");
////                idFamily.setText("");
////                idCar.setText("");
////                idBusiBoro.setText("");
////                idBoroOthers.setText("");
////
////            }
////        });
////
////        Calbutton.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View v) {
////                // Get values from EditText fields
////                double cash = parseDouble(idcash.getText().toString());
////                double gold = parseDouble(idGold.getText().toString());
////                double silver = parseDouble(idSilver.getText().toString());
////                double bank = parseDouble(idBank.getText().toString());
////                double share = parseDouble(idShare.getText().toString());
////                double others = parseDouble(idOthers.getText().toString());
////                double home = parseDouble(idHome.getText().toString());
////                double othersHome = parseDouble(idOthersHome.getText().toString());
////                double business = parseDouble(idBusiness.getText().toString());
////                double businessSave = parseDouble(idBusinessSave.getText().toString());
////                double boroGet = parseDouble(idBorwGet.getText().toString());
////                double pension = parseDouble(idPension.getText().toString());
////                double othersProfit = parseDouble(idOthersProfit.getText().toString());
////                double agri = parseDouble( idAgri.getText().toString());
////                double credit = parseDouble(idCredit.getText().toString());
////
////                double family = parseDouble(idFamily.getText().toString());
////                double car = parseDouble(idCar.getText().toString());
////                double businessBoro = parseDouble(idBusiBoro.getText().toString());
////                double othersBoro = parseDouble(idBoroOthers.getText().toString());
////
////
////                // Perform Zakat calculation logic
////                double zakatAmount = calculateZakat(cash, gold, silver, bank,share, others, home, othersHome, business, businessSave, boroGet, pension, othersProfit, agri, credit, family,car,businessBoro, othersBoro);
////
////                // Display the calculated Zakat amount
////                displayZakatAmount(zakatAmount);
////            }
////        });
////    }
////
////    private double parseDouble(String value) {
////        try {
////            return Double.parseDouble(value);
////        } catch (NumberFormatException e) {
////            return 0.0; // Handle invalid input gracefully
////        }
////    }
////
////    // Add your Zakat calculation logic here
////    private double calculateZakat(double cash, double gold, double silver,double bank,double share,double others,double home,double othersHome,double business,double businessSave,double boroGet,double pension,double othersProfit,double agri,double credit,double family,double car,double businessBoro,double othersBoro) {
////
////        double totalWealth = (cash + gold + silver + bank + share + others + home + othersHome + business + businessSave + boroGet + pension + othersProfit + agri) - (credit + family + car + businessBoro + othersBoro);
////        return 0.025 * totalWealth; // 2.5% of total wealth
////    }
////
////    // Display the calculated Zakat amount
////    private void displayZakatAmount(double zakatAmount) {
////        TextView display = findViewById(R.id.display);
////        display.setText("Calculated Zakat: " + zakatAmount);
////    }
////}
//
//package com.example.zakatcalculator;
//
//import static java.lang.Double.parseDouble;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.TextView;
//
//public class CalculatorActivity extends AppCompatActivity {
//
//    Button Calbutton, refreshBtn1, Prebtn;
//
//    TextView display;
//    EditText idcash, idBank, idGold, idSilver, idShare, idOthers, idHome, idOthersHome, idBusiness, idBusinessSave, idBorwGet, idPension, idOthersProfit, idAgri, idCredit, idFamily, idCar, idBusiBoro, idBoroOthers;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_calculator);
//
//        display = findViewById(R.id.display);
//
//        Prebtn = findViewById(R.id.Prebtn);
//        refreshBtn1 = findViewById(R.id.refreshBtn1);
//        Calbutton = findViewById(R.id.Calbutton);
//
//        idcash = findViewById(R.id.idcash);
//        idBank = findViewById(R.id.idBank);
//        idGold = findViewById(R.id.idGold);
//        idSilver = findViewById(R.id.idSilver);
//        idShare = findViewById(R.id.idShare);
//        idOthers = findViewById(R.id.idOthers);
//        idHome = findViewById(R.id.idHome);
//        idOthersHome = findViewById(R.id.idOthersHome);
//        idBusiness = findViewById(R.id.idBusiness);
//        idBusinessSave = findViewById(R.id.idBusinessSave);
//        idBorwGet = findViewById(R.id.idBorwGet);
//        idPension = findViewById(R.id.idPension);
//        idOthersProfit = findViewById(R.id.idOthersProfit);
//        idAgri = findViewById(R.id.idAgri);
//        idCredit = findViewById(R.id.idCredit);
//        idFamily = findViewById(R.id.idFamily);
//        idCar = findViewById(R.id.idCar);
//        idBusiBoro = findViewById(R.id.idBusiBoro);
//        idBoroOthers = findViewById(R.id.idBoroOthers);
//
//        Prebtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent myIntent = new Intent(CalculatorActivity.this, MainActivity.class);
//                startActivity(myIntent);
//                finish();
//            }
//        });
//
//        refreshBtn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Clear the EditText fields and TextView
//                clearFields();
//            }
//        });
//
//        Calbutton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Get values from EditText fields and perform calculations
//                calculateAndDisplayZakat();
//            }
//        });
//    }
//
//    // Clear the EditText fields and TextView
//    private void clearFields() {
//        display.setText("");
//        idcash.setText("");
//        idBank.setText("");
//        idGold.setText("");
//        idSilver.setText("");
//        idShare.setText("");
//        idOthers.setText("");
//        idHome.setText("");
//        idOthersHome.setText("");
//        idBusiness.setText("");
//        idBusinessSave.setText("");
//        idBorwGet.setText("");
//        idPension.setText("");
//        idOthersProfit.setText("");
//        idAgri.setText("");
//        idCredit.setText("");
//        idFamily.setText("");
//        idCar.setText("");
//        idBusiBoro.setText("");
//        idBoroOthers.setText("");
//    }
//
//    // Display the calculated Zakat amount along with total income and total debt
//    private void displayZakatAmount(double zakatAmount, double totalIncome, double totalDebt) {
//        display.setText("মোট আয়: " + totalIncome +
//                "\nমোট ঋণ: " + totalDebt +
//                "\nপ্রযোজ্য যাকাত: " + zakatAmount);
//    }
//
//    // Calculate Zakat and display the result
//    private void calculateAndDisplayZakat() {
//        // Get values from EditText fields
//        double cash = parseDouble(idcash.getText().toString());
//        double gold = parseDouble(idGold.getText().toString());
//        double silver = parseDouble(idSilver.getText().toString());
//        double bank = parseDouble(idBank.getText().toString());
//        double share = parseDouble(idShare.getText().toString());
//        double others = parseDouble(idOthers.getText().toString());
//        double home = parseDouble(idHome.getText().toString());
//        double othersHome = parseDouble(idOthersHome.getText().toString());
//        double business = parseDouble(idBusiness.getText().toString());
//        double businessSave = parseDouble(idBusinessSave.getText().toString());
//        double boroGet = parseDouble(idBorwGet.getText().toString());
//        double pension = parseDouble(idPension.getText().toString());
//        double othersProfit = parseDouble(idOthersProfit.getText().toString());
//        double agri = parseDouble(idAgri.getText().toString());
//        double credit = parseDouble(idCredit.getText().toString());
//        double family = parseDouble(idFamily.getText().toString());
//        double car = parseDouble(idCar.getText().toString());
//        double businessBoro = parseDouble(idBusiBoro.getText().toString());
//        double othersBoro = parseDouble(idBoroOthers.getText().toString());
//
//        // Calculate total income and total debt
//        double totalIncome = cash + gold + silver + bank + share + others + home + othersHome + business + businessSave + boroGet + pension + othersProfit + agri;
//        double totalDebt = credit + family + car + businessBoro + othersBoro;
//
//        // Perform Zakat calculation logic
//        double zakatAmount = calculateZakat(cash, gold, silver, bank, share, others, home, othersHome, business, businessSave, boroGet, pension, othersProfit, agri, credit, family, car, businessBoro, othersBoro);
//
//        // Display the calculated Zakat amount along with total income and total debt
//        displayZakatAmount(zakatAmount, totalIncome, totalDebt);
//    }
//
//
//    private double parseDouble(String value) {
//        try {
//            return Double.parseDouble(value);
//        } catch (NumberFormatException e) {
//            return 0.0; // Handle invalid input gracefully
//        }
//    }
//
//    // Add your Zakat calculation logic here
//    private double calculateZakat(double cash, double gold, double silver, double bank, double share, double others,
//                                  double home, double othersHome, double business, double businessSave,
//                                  double boroGet, double pension, double othersProfit, double agri, double credit,
//                                  double family, double car, double businessBoro, double othersBoro) {
//
//        double totalWealth = (cash + gold + silver + bank + share + others + home + othersHome + business +
//                businessSave + boroGet + pension + othersProfit + agri) - (credit + family + car + businessBoro + othersBoro);
//        return 0.025 * totalWealth; // 2.5% of total wealth
//    }
//
//
//}


package com.example.zakatcalculator;

import static java.lang.Double.parseDouble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    Button Calbutton, refreshBtn1, Prebtn;

    TextView display;
    EditText idcash, idBank, idGold, idSilver, idShare, idOthers, idHome, idOthersHome, idBusiness, idBusinessSave, idBorwGet, idPension, idOthersProfit, idAgri, idCredit, idFamily, idCar, idBusiBoro, idBoroOthers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        display = findViewById(R.id.display);

        Prebtn = findViewById(R.id.Prebtn);
        refreshBtn1 = findViewById(R.id.refreshBtn1);
        Calbutton = findViewById(R.id.Calbutton);

        idcash = findViewById(R.id.idcash);
        idBank = findViewById(R.id.idBank);
        idGold = findViewById(R.id.idGold);
        idSilver = findViewById(R.id.idSilver);
        idShare = findViewById(R.id.idShare);
        idOthers = findViewById(R.id.idOthers);
        idHome = findViewById(R.id.idHome);
        idOthersHome = findViewById(R.id.idOthersHome);
        idBusiness = findViewById(R.id.idBusiness);
        idBusinessSave = findViewById(R.id.idBusinessSave);
        idBorwGet = findViewById(R.id.idBorwGet);
        idPension = findViewById(R.id.idPension);
        idOthersProfit = findViewById(R.id.idOthersProfit);
        idAgri = findViewById(R.id.idAgri);
        idCredit = findViewById(R.id.idCredit);
        idFamily = findViewById(R.id.idFamily);
        idCar = findViewById(R.id.idCar);
        idBusiBoro = findViewById(R.id.idBusiBoro);
        idBoroOthers = findViewById(R.id.idBoroOthers);

        Prebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(CalculatorActivity.this, MainActivity.class);
                startActivity(myIntent);
                finish();
            }
        });

        refreshBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Clear the EditText fields and TextView
                clearFields();
            }
        });

        Calbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get values from EditText fields and perform calculations
                calculateAndDisplayZakat();
            }
        });
    }

    // Clear the EditText fields and TextView
    private void clearFields() {
        display.setText("");
        idcash.setText("");
        idBank.setText("");
        idGold.setText("");
        idSilver.setText("");
        idShare.setText("");
        idOthers.setText("");
        idHome.setText("");
        idOthersHome.setText("");
        idBusiness.setText("");
        idBusinessSave.setText("");
        idBorwGet.setText("");
        idPension.setText("");
        idOthersProfit.setText("");
        idAgri.setText("");
        idCredit.setText("");
        idFamily.setText("");
        idCar.setText("");
        idBusiBoro.setText("");
        idBoroOthers.setText("");
    }

    // Display the calculated Zakat amount along with total income and total debt
    private void displayZakatAmount(double zakatAmount, double totalIncome, double totalDebt) {
        display.setText("মোট আয়: " + totalIncome +
                "\nমোট ঋণ: " + totalDebt +
                "\nপ্রযোজ্য যাকাত: " + zakatAmount);
    }

    // Calculate Zakat and display the result
    private void calculateAndDisplayZakat() {
        // Get values from EditText fields
        double cash = parseDouble(idcash.getText().toString());
        double gold = parseDouble(idGold.getText().toString());
        double silver = parseDouble(idSilver.getText().toString());
        double bank = parseDouble(idBank.getText().toString());
        double share = parseDouble(idShare.getText().toString());
        double others = parseDouble(idOthers.getText().toString());
        double home = parseDouble(idHome.getText().toString());
        double othersHome = parseDouble(idOthersHome.getText().toString());
        double business = parseDouble(idBusiness.getText().toString());
        double businessSave = parseDouble(idBusinessSave.getText().toString());
        double boroGet = parseDouble(idBorwGet.getText().toString());
        double pension = parseDouble(idPension.getText().toString());
        double othersProfit = parseDouble(idOthersProfit.getText().toString());
        double agri = parseDouble(idAgri.getText().toString());
        double credit = parseDouble(idCredit.getText().toString());
        double family = parseDouble(idFamily.getText().toString());
        double car = parseDouble(idCar.getText().toString());
        double businessBoro = parseDouble(idBusiBoro.getText().toString());
        double othersBoro = parseDouble(idBoroOthers.getText().toString());

        // Calculate total income and total debt
        double totalIncome = cash + gold + silver + bank + share + others + home + othersHome + business + businessSave + boroGet + pension + othersProfit + agri;
        double totalDebt = credit + family + car + businessBoro + othersBoro;

        // Perform Zakat calculation logic
        double zakatAmount = calculateZakat(cash, gold, silver, bank, share, others, home, othersHome, business, businessSave, boroGet, pension, othersProfit, agri, credit, family, car, businessBoro, othersBoro);

        // Display the calculated Zakat amount along with total income and total debt
        displayZakatAmount(zakatAmount, totalIncome, totalDebt);
    }

    // Add your Zakat calculation logic here
    private double calculateZakat(double cash, double gold, double silver, double bank, double share, double others,
                                  double home, double othersHome, double business, double businessSave,
                                  double boroGet, double pension, double othersProfit, double agri, double credit,
                                  double family, double car, double businessBoro, double othersBoro) {

        double totalWealth = (cash + gold + silver + bank + share + others + home + othersHome + business +
                businessSave + boroGet + pension + othersProfit + agri) - (credit + family + car + businessBoro + othersBoro);
        return 0.025 * totalWealth; // 2.5% of total wealth
    }

    private double parseDouble(String value) {
        try {
            return Double.parseDouble(value);
        } catch (NumberFormatException e) {
            // Handle invalid input gracefully
            // You might want to show a message to the user or log the error
            return 0.0;
        }
    }
}
