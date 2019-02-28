package com.amd.personalanalysis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AnalysisResultActivity extends AppCompatActivity {
    private Button btnBackToAnalysisChoose;
    private TextView txtAnalysisResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analysis_color_result);
        String rgType= getIntent().getStringExtra("rgType");
        String rbText= getIntent().getStringExtra("rbText");
        btnBackToAnalysisChoose=(Button)findViewById(R.id.btnBackToAnalysisChoose);
        String[][] ColorResultArr = new String[2][10];
        ColorResultArr[0][0] = "أبيض";
        ColorResultArr[0][1] = "أصفر";
        ColorResultArr[0][2] = "أخضر";
        ColorResultArr[0][3] = "أحمر";
        ColorResultArr[0][4] = "أسود";
        ColorResultArr[0][5] = "أزرق";
        ColorResultArr[0][6] = "برتقالي";
        ColorResultArr[0][7] = "وردي";
        ColorResultArr[0][8] = "ذهبي";
        ColorResultArr[0][9] = "فضي";
        ColorResultArr[1][0] = "•\tتميل إلى فترة البراءة والطّفولة .\n" +
                "•\tتحبّ الفنّ وتحب أن تقع في الحبّ .\n" +
                "•\tصعب الإرضاء .\n" +
                "•\tثقتك بنفسك ضعيفة .\n" +
                "•\tتحبّ البساطة .\n" +
                "•\tتجذب النّاس إليك ويمكنك الانسجام والتكيّف مع أصدقاء متنوّعين .\n";
        ColorResultArr[1][1] = "•\tموضع ثقة الآخرين دائماً .\n" +
                "•\tتحبّ الترتيب وأن تشتري الأشياء الغريبة .\n" +
                "•\tعادة ما تصنع القرارات الصائبة .\n" +
                "•\tلديك حسٌّ قيادي قويّ .\n" +
                "•\tلا تحبّ الإزعاج وأنت محترم وواعي ومتنوّع .\n" +
                "•\tجميل وبريء .\n" +
                "•\tتحلم دائماً بعلاقة حب رومانسيّة .\n" +
                "•\tتحسن الاختيار في الوقت المناسب .\n" +
                "•\tتحبّ المناظر الطبيعية .\n";
        ColorResultArr[1][2] = "•\tتحب أن تكون شخصاُ محبوباً .\n" +
                "•\tطبعك معتدل لا تستثار بسهولة .\n" +
                "•\tتتأقلم بسرعة مع النّاس، فالخجل ليس من صفاتك .\n" +
                "•\tتكره التلوّث .\n" +
                "•\tمحبٌّ ومسالم وهادئ . \n" +
                "•\tتحب جمع الصور والألبومات .\n" +
                "•\tقائد بطبعك .\n" +
                "•\tمستمع جيّد يلوذ بك الجميع عند حاجتهم للنّصيحة .\n";
        ColorResultArr[1][3] = "•\tمبتهج ومتجدّد دائماً .\n" +
                "•\tتكون مزاجيّاً في معظم الأحيان .\n" +
                "•\tصعب الإرضاء .\n" +
                "•\tلطيف ومحبوب .\n" +
                "•\tدائم الشّكوى .\n" +
                "•\tتجيد التّعامل مع النّاسِ اللطفاء .\n";
        ColorResultArr[1][4] = "•\tيعكس اللون الأسود الكآبة لبعض النّاس .\n" +
                "•\tتملك ذوقاً رفيعاً .\n" +
                "•\tتحبّ التحدّي .\n";
        ColorResultArr[1][5] = "•\tلون الحقيقة والانسجام والعمل .\n" +
                "•\tتنزعج ممّن يتّصفون بالغباء .\n" +
                "•\tجذّاب لديك إحساس قوي تجاه الأشياء .\n" +
                "•\tصديق مخلص .\n" +
                "•\tمحافظ وحسّاس بالنّسبة لمشاعر الآخرين .\n";
        ColorResultArr[1][6] = "•\tتعرف كيف تتعامل مع الناس .\n" +
                "•\tتحبّ التنافس .\n" +
                "•\tتقدّر أصدقاءك جيّداً وتهتمّ بهم .\n" +
                "•\tمسؤول عن تصرّفاتك .\n" +
                "•\tرومانسي وقلبك دافئ .\n" +
                "•\tممتلئ بروح الابتكار والمغامرة .\n" +
                "•\tثقّتك بنفسك كبيرة ولا تحبّ الظهور .\n" +
                "•\tأحياناً تبالغ في تصرّفاتك وذلك لأنّك حسّاس جدّاً .\n" +
                "•\tمنظّم ومتحمّس ومرح واجتماعي .\n" +
                "•\tلديك أهدافٌ كثيرة وتسعى جاهداً لتحقيقها .\n";
        ColorResultArr[1][7] = "•\tلديك أفكار سلبيّة .\n" +
                "•\tتحبّ المساعدة والاهتمام بالآخرين .\n" +
                "•\tتحاول تقديم الأفضل دائماً .\n" +
                "•\tصعب التخلي عن مبادئك .\n";
        ColorResultArr[1][8] = "•\tمرح وصريح \n" +
                "•\tمن الصعب عليك إيجاد الشخص المناسب .\n" +
                "•\tتعرف الصواب من الخطأ .\n";
        ColorResultArr[1][9] = "•\tتحبّ أن تتحدّى نفسك .\n" +
                "•\tخيالي ومرح .\n" +
                "•\tمن الصّعب عليك الوثوق في شخص .\n" +
                "•\tتحبّ تجربة الأشياء الجديدة .\n" +
                "•\tدائما تسدي النصيحة الجيّدة عند الصداقة .\n" +
                "•\tمن السّهل التحدّث إليك .\n";

        String[][] HandResultArr = new String[2][5];
        HandResultArr[0][0] = "يد الأرض";
        HandResultArr[0][1] = "يد النار";
        HandResultArr[0][2] = "يد الماء";
        HandResultArr[0][3] = "يد الخشب";
        HandResultArr[0][4] = "يد المعدن";
        HandResultArr[1][0] = "التواضع هو من أبرز صفاتك وأنك مقرب جداَ من أفراد عائلتك. كما يدل على أنك تحرص على اتباع آداب السلوك أو \"الإتيكيت\" في التعامل مع الأشخاص المحيطين بك وفي كل المناسبات والظروف. فالأخلاق هي أساس العلاقات التي تجمعك وهؤلاء. ويشير هذا  الشكل أيضاً إلى أنك تقدم كل ما في استطاعتك لجعلهم يشعرون بالفرح والارتياح.";
        HandResultArr[1][1] = "أنك تتمتع بالكثير من الطاقة والطموح. كما تشير إلى أنك تتسم بوضوح الرؤية وبالقدرة على حل المشكلات من دون توتر أياً تكن الظروف والصعوبات. ويدل أيضاً على أنه ليس لديك عدد كبير من الأصدقاء لا سيما أنك تختارهم عادة بعناية واهتمام.";
        HandResultArr[1][2] = "أنك موهوب جداً ومغامر ومستعد دائماً لخوض التجارب من دون أن تفكر للحظة واحدة في أنها قد تكون صعبة أو مملة أو غير ذلك. ويشير هذا الشكل إلى أنك قادر على حفظ الأسرار وكتمانها ما يجعل الكثير من الأشخاص يثقون بك.";
        HandResultArr[1][3] = "أنك مرهف الإحساس وتتمتع بالقدرة على التعاون مع الأشخاص الذين تعيش في محيطهم حتى النهاية. كما يشير هذا إلى أنك شديد التعلق بمن تحبين والتسمك بأصدقائك والمقربين منك ومستعد دائماً للتضحية من أجلهم.";
        HandResultArr[1][4] = "أنت قائد بالفطرة ويمكنك التخطيط دائماً لمصلحة المجموعة. كما أنك تتمتع بموهبة توزيع المهمات وتنسيقها لتحقيق الأهداف التي تريد. ويكشف هذا الشكل أيضاً أنك تحب أن تحيط نفسك بأشخاص يمتلكون الصفات نفسها.";

        txtAnalysisResult=(TextView) findViewById(R.id.txtAnalysisResult);
        if (rgType.equals("rgHand")) {
            txtAnalysisResult.setText("تحليل شخصيتك من خلال شكل كف يدك :");
            for (int i = 0; i < HandResultArr.length; i++) {
                for (int j = 0; j < HandResultArr[i].length; j++) {
                    if (rbText.equals(HandResultArr[i][j]))
                    {
                        txtAnalysisResult.setText(HandResultArr[i+1][j]);
                    }
                }
            }
        }
        else if (rgType.equals("rgColor")) {
            txtAnalysisResult.setText("تحليل شخصيتك من خلال لونك المفضل :");
            for (int i = 0; i < ColorResultArr.length; i++) {
                for (int j = 0; j < ColorResultArr[i].length; j++) {
                    if (rbText.equals(ColorResultArr[i][j]))
                    {
                        txtAnalysisResult.setText(ColorResultArr[i+1][j]);
                    }
                }
            }
        }

    }
    public void BackToAnalysisChoose(View v)
    {
        Intent intent = new Intent(AnalysisResultActivity.this,AnalysisChooseActivity.class);
        startActivity(intent);
    }

}
