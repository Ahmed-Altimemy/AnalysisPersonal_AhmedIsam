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
import android.widget.TextView;
import android.widget.Toast;


public class AnalysisQuestionActivity extends AppCompatActivity {
    private Intent intent ;
    private ListView lvQuestion;
    private TextView txtQuestion;
    private TextView txtResult;
    private TextView txtAnalysisQuestionResult;
    private String Question="";
    private int idx=0;
    private int x = 0;
    private int result = 0;
    private ArrayAdapter adapter;
    AlertDialog.Builder builder;
    String[] Q1arr = {"•\tفي الصباح الباكر. ","•\tفي الظهيرة وبداية المساء"};
    String[] Q2arr = {"•\t بشكل سريع وخطوات طويلة. ","•\tبشكل سريع وخطوات قصيرة. ","•\tبسرعة قليلة مع رفع الرأس، والنظر إلى وجوه الناس. ","•\tبسرعة قليلة مع طأطأة الرأس نحو الأسفل. ","•\tبشكل بطيء جداً"};
    String[] Q3arr = {"•\t تقف طاوي اليدين. ","•\tتقف واليدان مكتوفتان. ","•\tتقف مع وضع اليدين على منطقة الخصر أو الورك، أو داخل الجَيب. ","•\tلمس الشخص المُخاطَب، أو دفعه. ","•\tتحريك اليدين على عدد من أجزاء جسمك، مثل: لمس الذقن، أو الأذنين، أو البطن، أو الشعر."};
    String[] Q4arr = {"•\t الجلوس مع ثني الركبتين جنباً إلى جنب. ","•\tالجلوس مع تقاطع القدمين؛ إحداهما فوق الأخرى. ","•\tالجلوس مع مدّ الرجلين بشكل مستقيم. ","•\tالجلوس مع ثني رجل واحدة تحتك."};
    String[] Q5arr = {"•\t ضحكة مُجلّية وممتنّة. ","•\tضحكة ولكن ليست بصوت مرتفع. ","•\tضحكة هادئة بينك وبين نفسك. ","•\tضحكة خجولة."};
    String[] Q6arr = {"•\t بشكل صاخب للفت أنظار الآخرين. ","•\tبشكل هادئ، مع الالتفات للبحث عن شخص تعرفه. ","•\tبشكل هادئ، مع محاولة عدم لفت أنظار الآخرين. "};
    String[] Q7arr = {"•\t الترحاب بالمقاطعة من أجل أخذ قسط من الراحة. ","•\tالشعور بالغيظ الشديد. ","•\tالشعور بحالة متفاوتة ما بين الحالتين السابقتين. "};
    String[] Q8arr = {"•\t اللون أحمر، أو البرتقالي. ","•\tاللون الأسود. ","•\tاللون الأصفر، أو الأزرق الفاتح. ","•\tاللون أخضر. ","•\tاللون الأزرق الغامق، أو الأرجواني. ","•\tاللون الأبيض. ","•\tاللون البُني، أو الرمادي. "};
    String[] Q9arr = {"•\t التمدد على الظهر. ","•\tالانكفاء على البطن والوجه باتجاه الأرض. ","•\tالاستلقاء على أحد الجانببن مع انحناء بسيط. ","•\tوضع الرأس على إحدى اليدين. ","•\tإخفاء الرأس أسفل الغِطاء. "};
    String[] Q10arr = {"•\t السقوط من مكان مرتفع. ","•\tالقتال أو المقاومة. ","•\tالبحث عن شيء، أو شخص. ","•\tالطيران، أو الطفو على الماء. ","•\tعدم الحلم بشيء عند النوم غالباً."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analysis_question);
        builder = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.AlertDialogCustom));

        // set Question Array
        x=1;
        txtQuestion=(TextView)findViewById(R.id.txtQuestion);
        txtResult=(TextView)findViewById(R.id.txtResult);
        txtAnalysisQuestionResult=(TextView)findViewById(R.id.txtAnalysisQuestionResult);

        txtQuestion.setText("السؤال الأول: في أي وقت تحس بأنك في أفضل حالاتك؟");
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Q1arr);
        lvQuestion=(ListView)findViewById(R.id.lvQuestion);
        lvQuestion.setAdapter(adapter);

        lvQuestion.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // TODO Auto-generated method stub
                switch (x)
                {
                    case 1:
                        idx = findIndex(Q1arr, adapter.getItem(position).toString());
                        Question = "السؤال الثاني: كيف تكون طريقتك المعتادة في السير على القدمين؟";
                        switch (idx)
                        {
                            case 0:
                                x++;
                                result+=2;
                                setListView(Question,Q2arr);
                                break;
                            case 1:
                                x++;
                                result+=4;
                                setListView(Question,Q2arr);
                                break;
                        }
                        break;
                    case 2:
                        x++;
                        idx=0;
                        idx = findIndex(Q2arr, adapter.getItem(position).toString());
                        Question = "السؤال الثالث: عند التحدث مع الآخرين، فعادةً ما:";
                        switch (idx)
                        {
                            case 0:
                                result+=6;
                                setListView(Question,Q3arr);
                                break;
                            case 1:
                                result+=4;
                                setListView(Question,Q3arr);
                                break;
                            case 2:
                                result+=7;
                                setListView(Question,Q3arr);
                                break;
                            case 3:
                                result+=2;
                                setListView(Question,Q3arr);
                                break;
                            case 4:
                                result+=1;
                                setListView(Question,Q3arr);
                                break;
                        }
                        break;
                    case 3:
                        x++;
                        idx=0;
                        idx = findIndex(Q3arr, adapter.getItem(position).toString()); //Q3
                        Question = "السؤال الرابع: عندما ترغب بالاسترخاء، فستكون طريقة الجلوس:"; //Q4
                        switch (idx)
                        {
                            case 0:
                                result+=4; //Q3
                                setListView(Question,Q4arr); //Q4
                                break;
                            case 1:
                                result+=2; //Q3
                                setListView(Question,Q4arr); //Q4
                                break;
                            case 2:
                                result+=5; //Q3
                                setListView(Question,Q4arr); //Q4
                                break;
                            case 3:
                                result+=7; //Q3
                                setListView(Question,Q4arr); //Q4
                                break;
                            case 4:
                                result+=6; //Q3
                                setListView(Question,Q4arr); //Q4
                                break;
                        }
                        break;
                    case 4:
                        x++;
                        idx=0;
                        idx = findIndex(Q4arr, adapter.getItem(position).toString()); //Q4
                        Question = "السؤال الخامس: عند سماع شيء مُسلٍّ، فإنّ طريقة الضحك تكون:"; //Q5
                        switch (idx)
                        {
                            case 0:
                                result+=4; //Q4
                                setListView(Question,Q5arr); //Q5
                                break;
                            case 1:
                                result+=6; //Q4
                                setListView(Question,Q5arr); //Q5
                                break;
                            case 2:
                                result+=2; //Q4
                                setListView(Question,Q5arr); //Q5
                                break;
                            case 3:
                                result+=1; //Q4
                                setListView(Question,Q5arr); //Q5
                                break;
                        }
                        break;
                    case 5:
                    x++;
                    idx=0;
                    idx = findIndex(Q5arr, adapter.getItem(position).toString()); //Q5
                    Question = " السؤال السادس: عند الدخول إلى حفلة اجتماعيّة، فإن طريقة الدخول تكون :"; //Q6
                    switch (idx)
                    {
                        case 0:
                            result+=6; //Q5
                            setListView(Question,Q6arr); //Q6
                            break;
                        case 1:
                            result+=4; //Q5
                            setListView(Question,Q6arr); //Q6
                            break;
                        case 2:
                            result+=3; //Q5
                            setListView(Question,Q6arr); //Q6
                            break;
                        case 3:
                            result+=5; //Q5
                            setListView(Question,Q6arr); //Q6
                            break;
                        case 4:
                            result+=2; //Q5
                            setListView(Question,Q6arr); //Q6
                            break;
                    }
                    break;
                    case 6:
                        x++;
                        idx=0;
                        idx = findIndex(Q6arr, adapter.getItem(position).toString()); //Q6
                        Question = "السؤال السابع: عند مقاطعة الآخرين للعمل أثناء حالة التركيز الشديد، فسوف تكون ردة الفعل:"; //Q7
                        switch (idx)
                        {
                            case 0:
                                result+=6; //Q6
                                setListView(Question,Q7arr); //Q7
                                break;
                            case 1:
                                result+=4; //Q6
                                setListView(Question,Q7arr); //Q7
                                break;
                            case 2:
                                result+=2; //Q6
                                setListView(Question,Q7arr); //Q7
                                break;
                        }
                        break;
                    case 7:
                        x++;
                        idx=0;
                        idx = findIndex(Q7arr, adapter.getItem(position).toString()); //Q7
                        Question = "السؤال الثامن: اللون المُفضّل هو:"; //Q8
                        switch (idx)
                        {
                            case 0:
                                result+=6; //Q7
                                setListView(Question,Q8arr); //Q8
                                break;
                            case 1:
                                result+=2; //Q7
                                setListView(Question,Q8arr); //Q8
                                break;
                            case 2:
                                result+=4; //Q7
                                setListView(Question,Q8arr); //Q8
                                break;
                        }
                        break;
                    case 8:
                        x++;
                        idx=0;
                        idx = findIndex(Q8arr, adapter.getItem(position).toString()); //Q8
                        Question = "السؤال التاسع: عند النوم على السرير أثناء فترة استعدادك للنوم، فإن طريقة الاستلقاء تكون:"; //Q9
                        switch (idx)
                        {
                            case 0:
                                result+=6; //Q8
                                setListView(Question,Q9arr); //Q9
                                break;
                            case 1:
                                result+=7; //Q8
                                setListView(Question,Q9arr); //Q9
                                break;
                            case 2:
                                result+=5; //Q8
                                setListView(Question,Q9arr); //Q9
                                break;
                            case 3:
                                result+=4; //Q8
                                setListView(Question,Q9arr); //Q9
                                break;
                            case 4:
                                result+=3; //Q8
                                setListView(Question,Q9arr); //Q9
                                break;
                            case 5:
                                result+=2; //Q8
                                setListView(Question,Q9arr); //Q9
                                break;
                            case 6:
                                result+=1; //Q8
                                setListView(Question,Q9arr); //Q9
                                break;
                        }
                        break;
                    case 9:
                        x++;
                        idx=0;
                        idx = findIndex(Q9arr, adapter.getItem(position).toString()); //Q9
                        Question = "السؤال العاشر: الحلم الذي يتكرّر معك، يكون حول:"; //Q10
                        switch (idx)
                        {
                            case 0:
                                result+=7; //Q9
                                setListView(Question,Q10arr); //Q10
                                break;
                            case 1:
                                result+=6; //Q9
                                setListView(Question,Q10arr); //Q10
                                break;
                            case 2:
                                result+=4; //Q9
                                setListView(Question,Q10arr); //Q10
                                break;
                            case 3:
                                result+=2; //Q9
                                setListView(Question,Q10arr); //Q10
                                break;
                            case 4:
                                result+=1; //Q9
                                setListView(Question,Q10arr); //Q10
                                break;
                        }
                        break;
                    case 10:
                        x++;
                        idx=0;
                        idx = findIndex(Q10arr, adapter.getItem(position).toString()); //Q10
                        switch (idx)
                        {
                            case 0:
                                result+=4; //Q10
                                break;
                            case 1:
                                result+=2; //Q10
                                break;
                            case 2:
                                result+=3; //Q10
                                break;
                            case 3:
                                result+=5; //Q10
                                break;
                            case 4:
                                result+=6; //Q10
                                break;
                            case 5:
                                result+=1; //Q10
                                break;
                        }
                        txtQuestion.setVisibility(View.INVISIBLE);
                        lvQuestion.setVisibility(View.INVISIBLE);
                        txtResult.setVisibility(View.VISIBLE);
                        txtResult.setText("Final Result = " + result);
                        txtAnalysisQuestionResult.setVisibility(View.VISIBLE);
                        if (result>60)
                        {
                            txtAnalysisQuestionResult.setText("شخصيّةً مُعتدّةً بذاتها ومستبدّةً، ومثيرة للإعجاب، ويرونها الاخرون قدوةً ليقتدوا بها ويكونوا مثلها، إلا أنها شخصيّة ليست محل ثقة، حيث يتردّد العديد من الأشخاص في الارتباط بها بشكل جدّي وعميق.");
                        }
                        else if (result>50 && result<61)
                        {
                            txtAnalysisQuestionResult.setText("شخصيّةً قياديّةً بالفطرة، وتتّخذ القرارات بشكل سريع وإن كانت غير صحيحة، وهي شخصيّة جريئة ومغامرة، ترغب بتجربة أي أمر ولو مرّةً واحدةً، تستمع بالمغامرات، ويستمتع الآخرون بصحبتها لأنها شخصيّة مصحوبة بالإثارة.");
                        }
                        else if (result>40 && result<51)
                        {
                            txtAnalysisQuestionResult.setText("شخصيّة حيويّة، وفاتنة، ومُفعَمة بالنشاط، وهي شخصيّة ممتعة ومشوّقة، تحب لفت الانتباه دائماً ولكن بشكل متّزن، كما أنها شخصيّة تساعد الناس وتبهجهم دائماً، وقد يرى الآخرون أنّ هذه الشخصيّة لطيفة، ومتسامحة، وتراعي مشاعر الآخرين.");
                        }
                        else if (result>30 && result<41)
                        {
                            txtAnalysisQuestionResult.setText("شخصيّة حسّاسة، وحذِرة، ودقيقة في عملها، يراها الآخرون بأنّها شخصيّة موهوبة، وذكيّة، ومتواضعة، ونابغة، لا تستطيع تكوين الصداقات بسرعة، ومع ذلك فهي وفيّة لأصدقائها، كما أنّ الأشخاص الذين يعرفون تلك الشخصيّة يعلمون أنّ ثقتها بأصدقائها لا تهتز بسهولة، وإن اهتزت أو فُقِدت فإنها تحتاج إلى وقت طويل لتعود.");
                        }
                        else if (result>20 && result<31)
                        {
                            txtAnalysisQuestionResult.setText("شخصيّة مجتهدة لكنّها متسرعة، وحذرة، ودقيقة جداً، وبطيئة، تسير على نمط ثابت في الحياة، لكن من الممكن أن تفاجئ الآخرين في حال قيامها بشيء عفويّ، إلا أنّ الآخرين يعتقدون أنها تحب اختبار كل الأمور بدقة قبل اتخاذ القرار؛ وذلك بسبب طبيعتها الحذرة.");
                        }
                        break;
                }
                Toast.makeText(getApplicationContext(),"result = " + result , Toast.LENGTH_LONG).show();
            }
        });
    }

    public void BackToChoose(View v)
    {
        builder.setMessage(R.string.dialog_message) .setTitle(R.string.dialog_title);
        builder.setMessage("Do you want back to Choose Analysis Type ?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finish();
                        intent = new Intent(AnalysisQuestionActivity.this,AnalysisChooseActivity.class);
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
        alert.setTitle("Back to Choose Analysis Type");
        alert.show();
    }

    // Linear-search function to find the index of an element
    public static int findIndex(String arr[], String idx)
    {
        // if array is Null
        if (arr == null) {
            return -1;
        }
        // find length of array
        int len = arr.length;
        int i = 0;
        while (i < len) {
            // if the i-th element is idx
            // then return the index
            if (arr[i] == idx) {
                return i;
            }
            else {
                i = i + 1;
            }
        }
        return -1;
    }

    public void setListView(String txt,String[] ArrayName)
    {
        txtQuestion.setText(txt);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,ArrayName);
        lvQuestion=(ListView)findViewById(R.id.lvQuestion);
        lvQuestion.setAdapter(adapter);
    }
}
