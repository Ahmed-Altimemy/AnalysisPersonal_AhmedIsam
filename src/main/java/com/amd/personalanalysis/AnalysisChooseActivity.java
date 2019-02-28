package com.amd.personalanalysis;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class AnalysisChooseActivity extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener{

    String[] AnalysisArr = { "Choose Analysis Type","تحليل الشخصية من خلال الالوان","تحليل الشخصية من خلال شكل كف اليد","تحليل الشخصية من خلال اسئلة اختبار"};
    private Intent intent ;

    private ListView lvQuestion;
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analysis_choose);


        builder = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.AlertDialogCustom));

        Spinner spin = (Spinner) findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(this);

        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,AnalysisArr);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);
    }

    public void onClick(View v)
    {

        RadioButton rbHand1 = (RadioButton) findViewById(R.id.rbHand1);
        RadioButton rbHand2 = (RadioButton) findViewById(R.id.rbHand2);
        RadioButton rbHand3 = (RadioButton) findViewById(R.id.rbHand3);
        RadioButton rbHand4 = (RadioButton) findViewById(R.id.rbHand4);
        RadioButton rbHand5 = (RadioButton) findViewById(R.id.rbHand5);
        RadioButton rbWhite = (RadioButton) findViewById(R.id.rbWhite);
        RadioButton rbYellow = (RadioButton) findViewById(R.id.rbYellow);
        RadioButton rbGreen = (RadioButton) findViewById(R.id.rbGreen);
        RadioButton rbRed = (RadioButton) findViewById(R.id.rbRed);
        RadioButton rbBlack = (RadioButton) findViewById(R.id.rbBlack);
        RadioButton rbBlue = (RadioButton) findViewById(R.id.rbBlue);
        RadioButton rbOrange = (RadioButton) findViewById(R.id.rbOrange);
        RadioButton rbPink = (RadioButton) findViewById(R.id.rbPink);
        RadioButton rbGolden = (RadioButton) findViewById(R.id.rbGolden);
        RadioButton rbSilver = (RadioButton) findViewById(R.id.rbSilver);
        TextView txtColors = (TextView) findViewById(R.id.txtColors);


        String rgType = "";
        String rbText = "";
        boolean  rbHandChecked = false;
        switch(v.getId()) {
            case R.id.rbHand1:
                rbHandChecked = ((RadioButton) v).isChecked();
                if (rbHandChecked)
//              //if AboutActivate is selected
                rgType = "rgHand";
                rbText = rbHand1.getText().toString();
                intent = new Intent(AnalysisChooseActivity.this, AnalysisResultActivity.class);
                intent.putExtra("rgType", rgType);
                intent.putExtra("rbText", rbText);
                startActivity(intent);
                break;
            case R.id.rbHand2:
                rbHandChecked = ((RadioButton) v).isChecked();
                if (rbHandChecked)
//              //if AboutActivate is selected
                rgType = "rgHand";
                rbText = rbHand2.getText().toString();
                intent = new Intent(AnalysisChooseActivity.this, AnalysisResultActivity.class);
                intent.putExtra("rgType", rgType);
                intent.putExtra("rbText", rbText);
                startActivity(intent);
                break;
            case R.id.rbHand3:
                rbHandChecked = ((RadioButton) v).isChecked();
                if (rbHandChecked)
//              //if AboutActivate is selected
                    rgType = "rgHand";
                rbText = rbHand3.getText().toString();
                intent = new Intent(AnalysisChooseActivity.this, AnalysisResultActivity.class);
                intent.putExtra("rgType", rgType);
                intent.putExtra("rbText", rbText);
                startActivity(intent);
                break;
            case R.id.rbHand4:
                rbHandChecked = ((RadioButton) v).isChecked();
                if (rbHandChecked)
//              //if AboutActivate is selected
                    rgType = "rgHand";
                rbText = rbHand4.getText().toString();
                intent = new Intent(AnalysisChooseActivity.this, AnalysisResultActivity.class);
                intent.putExtra("rgType", rgType);
                intent.putExtra("rbText", rbText);
                startActivity(intent);
                break;
            case R.id.rbHand5:
                rbHandChecked = ((RadioButton) v).isChecked();
                if (rbHandChecked)
//              //if AboutActivate is selected
                    rgType = "rgHand";
                rbText = rbHand5.getText().toString();
                intent = new Intent(AnalysisChooseActivity.this, AnalysisResultActivity.class);
                intent.putExtra("rgType", rgType);
                intent.putExtra("rbText", rbText);
                startActivity(intent);
                break;
            case R.id.rbWhite:
                rbHandChecked = ((RadioButton) v).isChecked();
                if (rbHandChecked)
//              //if AboutActivate is selected
                    rgType = "rgColor";
                rbText = rbWhite.getText().toString();
                intent = new Intent(AnalysisChooseActivity.this, AnalysisResultActivity.class);
                intent.putExtra("rgType", rgType);
                intent.putExtra("rbText", rbText);
                startActivity(intent);
                break;
            case R.id.rbYellow:
                rbHandChecked = ((RadioButton) v).isChecked();
                if (rbHandChecked)
//              //if AboutActivate is selected
                    rgType = "rgColor";
                rbText = rbYellow.getText().toString();
                intent = new Intent(AnalysisChooseActivity.this, AnalysisResultActivity.class);
                intent.putExtra("rgType", rgType);
                intent.putExtra("rbText", rbText);
                startActivity(intent);
                break;
            case R.id.rbGreen:
                rbHandChecked = ((RadioButton) v).isChecked();
                if (rbHandChecked)
//              //if AboutActivate is selected
                    rgType = "rgColor";
                rbText = rbGreen.getText().toString();
                intent = new Intent(AnalysisChooseActivity.this, AnalysisResultActivity.class);
                intent.putExtra("rgType", rgType);
                intent.putExtra("rbText", rbText);
                startActivity(intent);
                break;
            case R.id.rbRed:
                rbHandChecked = ((RadioButton) v).isChecked();
                if (rbHandChecked)
//              //if AboutActivate is selected
                    rgType = "rgColor";
                rbText = rbRed.getText().toString();
                intent = new Intent(AnalysisChooseActivity.this, AnalysisResultActivity.class);
                intent.putExtra("rgType", rgType);
                intent.putExtra("rbText", rbText);
                startActivity(intent);
                break;
            case R.id.rbBlack:
                rbHandChecked = ((RadioButton) v).isChecked();
                if (rbHandChecked)
//              //if AboutActivate is selected
                    rgType = "rgColor";
                rbText = rbBlack.getText().toString();
                intent = new Intent(AnalysisChooseActivity.this, AnalysisResultActivity.class);
                intent.putExtra("rgType", rgType);
                intent.putExtra("rbText", rbText);
                startActivity(intent);
                break;
            case R.id.rbBlue:
                rbHandChecked = ((RadioButton) v).isChecked();
                if (rbHandChecked)
//              //if AboutActivate is selected
                    rgType = "rgColor";
                rbText = rbBlue.getText().toString();
                intent = new Intent(AnalysisChooseActivity.this, AnalysisResultActivity.class);
                intent.putExtra("rgType", rgType);
                intent.putExtra("rbText", rbText);
                startActivity(intent);
                break;
            case R.id.rbOrange:
                rbHandChecked = ((RadioButton) v).isChecked();
                if (rbHandChecked)
//              //if AboutActivate is selected
                    rgType = "rgColor";
                rbText = rbOrange.getText().toString();
                intent = new Intent(AnalysisChooseActivity.this, AnalysisResultActivity.class);
                intent.putExtra("rgType", rgType);
                intent.putExtra("rbText", rbText);
                startActivity(intent);
                break;
            case R.id.rbPink:
                rbHandChecked = ((RadioButton) v).isChecked();
                if (rbHandChecked)
//              //if AboutActivate is selected
                    rgType = "rgColor";
                rbText = rbPink.getText().toString();
                intent = new Intent(AnalysisChooseActivity.this, AnalysisResultActivity.class);
                intent.putExtra("rgType", rgType);
                intent.putExtra("rbText", rbText);
                startActivity(intent);
                break;
            case R.id.rbGolden:
                rbHandChecked = ((RadioButton) v).isChecked();
                if (rbHandChecked)
//              //if AboutActivate is selected
                    rgType = "rgColor";
                rbText = rbGolden.getText().toString();
                intent = new Intent(AnalysisChooseActivity.this, AnalysisResultActivity.class);
                intent.putExtra("rgType", rgType);
                intent.putExtra("rbText", rbText);
                startActivity(intent);
                break;
            case R.id.rbSilver:
                rbHandChecked = ((RadioButton) v).isChecked();
                if (rbHandChecked)
//              //if AboutActivate is selected
                    rgType = "rgColor";
                rbText = rbSilver.getText().toString();
                intent = new Intent(AnalysisChooseActivity.this, AnalysisResultActivity.class);
                intent.putExtra("rgType", rgType);
                intent.putExtra("rbText", rbText);
                startActivity(intent);
                break;
        }
    }

    public void Logout(View v)
    {
        //Uncomment the below code to Set the message and title from the strings.xml file
        builder.setMessage(R.string.dialog_message) .setTitle(R.string.dialog_title);
        //Setting message manually and performing action on button click
        builder.setMessage("Do you want to Logout ?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finish();
                        intent = new Intent(AnalysisChooseActivity.this,LoginActivity.class);
                        startActivity(intent);
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //  Action for 'NO' Button
                        dialog.cancel();
                    }
                });
        //Creating dialog box
        AlertDialog alert = builder.create();
        //Setting the title manually
        alert.setTitle("Logout");
        alert.show();
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        TextView txtColors=(TextView) findViewById(R.id.txtColors);
        RadioGroup rgColor=(RadioGroup) findViewById(R.id.rgColor);
        TextView txtHands=(TextView) findViewById(R.id.txtHands);
        RadioGroup rgHands=(RadioGroup) findViewById(R.id.rgHands);

        switch (AnalysisArr[position]) {
            case "Choose Analysis Type":
                txtColors.setVisibility(View.INVISIBLE);
                rgColor.setVisibility(View.INVISIBLE);
                txtHands.setVisibility(View.INVISIBLE);
                rgHands.setVisibility(View.INVISIBLE);
                break;
            case "تحليل الشخصية من خلال الالوان":
                txtColors.setVisibility(View.VISIBLE);
                txtColors.setText("ما هو لونك المفضل :");
                rgColor.setVisibility(View.VISIBLE);
                txtHands.setVisibility(View.INVISIBLE);
                rgHands.setVisibility(View.INVISIBLE);
                break;
            case "تحليل الشخصية من خلال شكل كف اليد":
                txtHands.setVisibility(View.VISIBLE);
                txtHands.setText("ما هو شكل كف يدك :");
                rgHands.setVisibility(View.VISIBLE);
                txtColors.setVisibility(View.INVISIBLE);
                rgColor.setVisibility(View.INVISIBLE);
                break;
            case "تحليل الشخصية من خلال اسئلة اختبار":
                intent = new Intent(AnalysisChooseActivity.this,AnalysisQuestionActivity.class);
                startActivity(intent);
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
