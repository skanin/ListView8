package com.example.sande.listview8;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import viralandroid.com.androiduserinterfacetutorial.R;


public class MainActivity  extends AppCompatActivity {
    public ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list);
        final String[] values = new String[]{"§01. Kongle", "§02. Binders",
                "§03. Plaster", "§04. Kvitering", "§05. 'Ruter'-logo", "§06. Ølkork", "§07. Hjerteutklipp av russekort",
                "§08. Ølkork i gull", "§09. Bussbillett", "§10. Bit av et sitteunderlag", "§11. Signatur fra helsesøster",
                "§12. Skolens logo", "§13. Første bokstav", "§14. Bit av skilt", "§15. Bit av burgereske", "§16. Fjær", "§17. Bilde av Barney Stinson",
                "§18. Stoffbit", "§10. Champagnekork i gull", "§20. Billettarmbånd", "§21. Amnesty-logo", "§22. Plastskje", "§23. Mobildeksel",
                "§24. Legokloss", "§25. Tampong", "§26. Kritt", "§27. Undertøy",  "§28. Rød Trekant", "§29. Hatt på Tequilla-kork", "§30. Rose",
                "§31. Bit av kjetting", "§32. G-streng/bokser", "§33. Lokk", "§34. Peace-merke", "§35. Brødskive", "§36. Ispinne", "§37. Russekortet til en SORR",
                "§38. RedBull boks", "§39. Gummihanske", "§40. Fastnøkkel", "§41. Sammentrengt ølboks", "§42. Lapp med svar", "§43. Spritekork",
                "§44. Glowstick", "§45. Skismøring", "§46. Fløyte", "§47. Kryssordark", "§48. Liten isbjørn", "§49. Bilde av deg og en fjortis", "§50. Grønn/rød chilli",
                "§51. Smokk", "§52. 2 og en halv seigmann", "§53. 'Yes man'-filmlogo", "§54. Bandana", "§55. Grønn seigdame", "§56. Kvist", "§57. Klistremerke fra banan",
                "§58. MOT-logo", "§59. Plastgaffel i gull", "§60. Godterifisk", "§61. Selfie med mor/far til medruss", "§62. Lekestol i gull", "§63. Lesebriller",
                "§64. Rød eller hvit vinkork", "§65. Solbriller", "§66. Sminkekost", "§67. Hubba Bubba papir", "§68. 1881-logo", "§69. Yin-Yang merke", "§70. Våtserviett",
                "§71. Kam", "§72. Liten prompepute", "§73. Happy Meal leke", "§74. Liten mikrofon/megafon", "§75. Babysokk", "§76. Filter på røyk", "§77. Tusjkork",
                "§78. Vaskelapp", "§79. Pappkopp", "§80. Cocktailsverd", "§81. Deodorant-lokk", "§82. Klovnenese", "§83. En liten 'L'",
                "§84. Ørepropper", "§85. Fargerik fjær", "§86. Kondom", "§87. Proteinbar-papir", "§88. Femtilapp", "§89. Blyant", "§90. Lekehund", "§91. Tom halvliter",
                "§92. Kinobillett", "§93. Bilde av Åge Aleksandersen", "§94. Bilde av Ylvis", "§95. Godteri-gebiss", "§96. Matpapir", "§97. Sjokoladedekket kongle",
                "§98. Barbie/ken-dukke ", "§99. 'Røde Kors'-logo", "§100. Sokk", "§101. Bilde av Waldo"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_activated_2, android.R.id.text1, values);

        listView.setAdapter(adapter);

        listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                view.setId(position);
                for (int i = 0; i <= 101; i++) {
                    if (position == i) {
                        Intent myIntent = new Intent(MainActivity.this, KnuteInfo.class);
                        view.setId(position);
                        Integer posisjon = view.getId();
                        myIntent.putExtra("id", posisjon);
                        startActivity(myIntent);
                    }
                }
            }
            });
    }
}