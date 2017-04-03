package com.example.sande.listview8;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.widget.ImageView;
import android.widget.TextView;
import viralandroid.com.androiduserinterfacetutorial.R;


public class KnuteInfo extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.knute_info);

        Bundle text = getIntent().getExtras();
        final TextView textView = (TextView)findViewById(R.id.gjenstand);
        final TextView gjoremaal = (TextView)findViewById(R.id.gjoremaal);
        final ImageView imageView = (ImageView)findViewById(R.id.bildeAvGjenstand);

        //References to images
        final Drawable kongle = ContextCompat.getDrawable(this, R.drawable.kongle);
        final Drawable binders = ContextCompat.getDrawable(this, R.drawable.binders);
        final Drawable plaster = ContextCompat.getDrawable(this, R.drawable.plaster);
        final Drawable kvitering = ContextCompat.getDrawable(this, R.drawable.kvitering);
        final Drawable ruterLogo = ContextCompat.getDrawable(this, R.drawable.ruterLogo);
        final Drawable olkork = ContextCompat.getDrawable(this, R.drawable.olkork);
        final Drawable hjerteutklipp = ContextCompat.getDrawable(this, R.drawable.hjerteutklipp);
        final Drawable olKorkGull = ContextCompat.getDrawable(this, R.drawable.olKorkGull);
        final Drawable bussbillett = ContextCompat.getDrawable(this, R.drawable.bussbillett);
        final Drawable bitAvSitteunderlag = ContextCompat.getDrawable(this, R.drawable.bitAvSitteunderlag);
        final Drawable helsesosterSign = ContextCompat.getDrawable(this, R.drawable.helsesosterSign);
        final Drawable skoleLogo = ContextCompat.getDrawable(this, R.drawable.skoleLogo);
        final Drawable forsteBokstav = ContextCompat.getDrawable(this, R.drawable.forsteBokstav);
        final Drawable skilt = ContextCompat.getDrawable(this, R.drawable.skilt);
        final Drawable burgerEske = ContextCompat.getDrawable(this, R.drawable.burgerEske);
        final Drawable fjaer = ContextCompat.getDrawable(this, R.drawable.fjaer);
        final Drawable stinson = ContextCompat.getDrawable(this, R.drawable.stinson);
        final Drawable stoffbit = ContextCompat.getDrawable(this, R.drawable.stoffbit);
        final Drawable champagnekork = ContextCompat.getDrawable(this, R.drawable.champagnekork);
        final Drawable billettArmband = ContextCompat.getDrawable(this, R.drawable.billettArmband);
        final Drawable amnesty = ContextCompat.getDrawable(this, R.drawable.amnesty);
        final Drawable plastskje = ContextCompat.getDrawable(this, R.drawable.plastskje);
        final Drawable mobildeksel = ContextCompat.getDrawable(this, R.drawable.mobildeksel);
        final Drawable legokloss = ContextCompat.getDrawable(this, R.drawable.legokloss);
        final Drawable tampong = ContextCompat.getDrawable(this, R.drawable.tampong);
        final Drawable kritt = ContextCompat.getDrawable(this, R.drawable.kritt);
        final Drawable undertoy = ContextCompat.getDrawable(this, R.drawable.undertoy);
        final Drawable rodTrekant = ContextCompat.getDrawable(this, R.drawable.rodTrekant);
        final Drawable tequillaHatt = ContextCompat.getDrawable(this, R.drawable.tequillaHatt);
        final Drawable rose = ContextCompat.getDrawable(this, R.drawable.rose);
        final Drawable kjettingBit = ContextCompat.getDrawable(this, R.drawable.kjettingBit);
        final Drawable gStreng = ContextCompat.getDrawable(this, R.drawable.gStreng);
        final Drawable lokk = ContextCompat.getDrawable(this, R.drawable.lokk);
        final Drawable peace = ContextCompat.getDrawable(this, R.drawable.peace);
        final Drawable brodskive = ContextCompat.getDrawable(this, R.drawable.brodskive);
        final Drawable ispinne = ContextCompat.getDrawable(this, R.drawable.ispinne);
        final Drawable russekortSorr = ContextCompat.getDrawable(this, R.drawable.russekortSorr);
        final Drawable redBull = ContextCompat.getDrawable(this, R.drawable.redBull);
        final Drawable gummihanske = ContextCompat.getDrawable(this, R.drawable.gummihanske);
        final Drawable fastnokkel = ContextCompat.getDrawable(this, R.drawable.fastnokkel);
        final Drawable sammenklemtOlboks = ContextCompat.getDrawable(this, R.drawable.sammenklemtOlboks);
        final Drawable lappMedSvar = ContextCompat.getDrawable(this, R.drawable.lappMedSvar);
        final Drawable spritekork = ContextCompat.getDrawable(this, R.drawable.spritekork);
        final Drawable glowStick = ContextCompat.getDrawable(this, R.drawable.glowStick);
        final Drawable skismoring = ContextCompat.getDrawable(this, R.drawable.skismoring);
        final Drawable floyte = ContextCompat.getDrawable(this, R.drawable.floyte);
        final Drawable kryssordark = ContextCompat.getDrawable(this, R.drawable.kryssordark);
        final Drawable litenIsbjorn = ContextCompat.getDrawable(this, R.drawable.litenIsbjorn);
        final Drawable bildeDegOgFjortis = ContextCompat.getDrawable(this, R.drawable.bildeDegOgFjortis);
        final Drawable gronnEllerRodChilli = ContextCompat.getDrawable(this, R.drawable.gronnEllerRodChilli);
        final Drawable smokk = ContextCompat.getDrawable(this, R.drawable.smokk);
        final Drawable toOgEnHalvSeigmann = ContextCompat.getDrawable(this, R.drawable.toOgEnHalvSeigmann);
        final Drawable yesMan = ContextCompat.getDrawable(this, R.drawable.yesMan);
        final Drawable bandana = ContextCompat.getDrawable(this, R.drawable.bandana);
        final Drawable gronnSeigdame = ContextCompat.getDrawable(this, R.drawable.gronnSeigdame);
        final Drawable kvist = ContextCompat.getDrawable(this, R.drawable.kvist);
        final Drawable bananKlistremerke = ContextCompat.getDrawable(this, R.drawable.bananKlistremerke);
        final Drawable motLogo = ContextCompat.getDrawable(this, R.drawable.motLogo);
        final Drawable plastgaffelGull = ContextCompat.getDrawable(this, R.drawable.plastgaffelGull);
        final Drawable godteriFisk = ContextCompat.getDrawable(this, R.drawable.godteriFisk);
        final Drawable selfieMedMorEllerFar = ContextCompat.getDrawable(this, R.drawable.selfieMedMorEllerFar);
        final Drawable lekestolGull = ContextCompat.getDrawable(this, R.drawable.lekestolGull);
        final Drawable lesebriller = ContextCompat.getDrawable(this, R.drawable.lesebriller);
        final Drawable rodEllerHvitVinkork = ContextCompat.getDrawable(this, R.drawable.rodEllerHvitVinkork);
        final Drawable solbriller = ContextCompat.getDrawable(this, R.drawable.solbriller);
        final Drawable sminkekost = ContextCompat.getDrawable(this, R.drawable.sminkekost);
        final Drawable hubbaBubbaPapir = ContextCompat.getDrawable(this, R.drawable.hubbaBubbaPapir);
        final Drawable attenAattiEnLogo = ContextCompat.getDrawable(this, R.drawable.attenAattiEnLogo);
        final Drawable yinYang = ContextCompat.getDrawable(this, R.drawable.yinYang);
        final Drawable vaatserviett = ContextCompat.getDrawable(this, R.drawable.vaatserviett);
        final Drawable kam = ContextCompat.getDrawable(this, R.drawable.kam);
        final Drawable litenPrompepute = ContextCompat.getDrawable(this, R.drawable.litenPrompepute);
        final Drawable happyMealLeke = ContextCompat.getDrawable(this, R.drawable.happyMealLeke);
        final Drawable litenMikrofonEllerMegafon = ContextCompat.getDrawable(this, R.drawable.litenMikrofonEllerMegafon);
        final Drawable babysokk = ContextCompat.getDrawable(this, R.drawable.babysokk);
        final Drawable filterPaaRoyken = ContextCompat.getDrawable(this, R.drawable.filterPaaRoyken);
        final Drawable tusjkork = ContextCompat.getDrawable(this, R.drawable.tusjkork);
        final Drawable vaskelapp = ContextCompat.getDrawable(this, R.drawable.vaskelapp);
        final Drawable pappkopp = ContextCompat.getDrawable(this, R.drawable.pappkopp);
        final Drawable cocktailSverd = ContextCompat.getDrawable(this, R.drawable.cocktailSverd);
        final Drawable deodorantLokk = ContextCompat.getDrawable(this, R.drawable.deodorantLokk);
        final Drawable klovneNese = ContextCompat.getDrawable(this, R.drawable.klovneNese);
        final Drawable litenL = ContextCompat.getDrawable(this, R.drawable.litenL);
        final Drawable orepropp = ContextCompat.getDrawable(this, R.drawable.orepropp);
        final Drawable fargerikFjaer = ContextCompat.getDrawable(this, R.drawable.fargerikFjaer);
        final Drawable kondom = ContextCompat.getDrawable(this, R.drawable.kondom);
        final Drawable proteinbarPapir = ContextCompat.getDrawable(this, R.drawable.proteinbarPapir);
        final Drawable femtilapp = ContextCompat.getDrawable(this, R.drawable.femtilapp);
        final Drawable blyant = ContextCompat.getDrawable(this, R.drawable.blyant);
        final Drawable lekehund = ContextCompat.getDrawable(this, R.drawable.lekehund);
        final Drawable tomHalvliter = ContextCompat.getDrawable(this, R.drawable.tomHalvliter);
        final Drawable kinobillett = ContextCompat.getDrawable(this, R.drawable.kinobillett);
        final Drawable aageAleksandersen = ContextCompat.getDrawable(this, R.drawable.aageAleksandersen);
        final Drawable ylvisBilde = ContextCompat.getDrawable(this, R.drawable.ylvisBilde);
        final Drawable godteriGebiss = ContextCompat.getDrawable(this, R.drawable.godteriGebiss);
        final Drawable matpapir = ContextCompat.getDrawable(this, R.drawable.matpapir);
        final Drawable sjokoKongle = ContextCompat.getDrawable(this, R.drawable.sjokoKongle);
        final Drawable barbieEllerKen = ContextCompat.getDrawable(this, R.drawable.barbieEllerKen);
        final Drawable rodeKors = ContextCompat.getDrawable(this, R.drawable.rodeKors);
        final Drawable sokk = ContextCompat.getDrawable(this, R.drawable.sokk);
        final Drawable bildeAvWaldo = ContextCompat.getDrawable(this, R.drawable.bildeAvWaldo);
        Integer posisjon = text.getInt("id");

        //Switch checks id of list item that was clicked, and the new activity gets layout based on that Id.
        switch (posisjon){
            case 0:
                textView.setText(R.string.kongle);
                gjoremaal.setText(R.string.kongleBesk);
                imageView.setImageDrawable(kongle);
                break;

            case 1:
                textView.setText(R.string.binders);
                gjoremaal.setText(R.string.bindersBesk);
                imageView.setImageDrawable(binders);
                break;

            case 2:
                textView.setText(R.string.plaster);
                gjoremaal.setText(R.string.plasterBesk);
                imageView.setImageDrawable(plaster);
                break;

            case 3:
                textView.setText(R.string.kviteringen);
                gjoremaal.setText(R.string.kvitteringBesk);
                imageView.setImageDrawable(kvitering);
                break;

            case 4:
                textView.setText(R.string.ruter);
                gjoremaal.setText(R.string.ruterBesk);
                imageView.setImageDrawable(ruterLogo);
                break;

            case 5:
                textView.setText(R.string.olkork);
                gjoremaal.setText(R.string.olkorkBesk);
                imageView.setImageDrawable(olkork);
                break;

            case 6:
                textView.setText(R.string.hjerteutklipp);
                gjoremaal.setText(R.string.hjerteutklippBesk);
                imageView.setImageDrawable(hjerteutklipp);
                break;

            case 7:
                textView.setText(R.string.olkorkGull);
                gjoremaal.setText(R.string.olkorkGullBesk);
                imageView.setImageDrawable(olKorkGull);
                break;

            case 8:
                textView.setText(R.string.bussbillett);
                gjoremaal.setText(R.string.bussbillettBesk);
                imageView.setImageDrawable(bussbillett);
                break;

            case 9:
                textView.setText(R.string.sitteunderlag);
                gjoremaal.setText(R.string.sitteunderlagBesk);
                imageView.setImageDrawable(bitAvSitteunderlag);
                break;

            case 10:
                textView.setText(R.string.helsesoterSign);
                gjoremaal.setText(R.string.helsesosterSignBesk);
                imageView.setImageDrawable(helsesosterSign);
                break;

            case 11:
                textView.setText(R.string.skoleLogo);
                gjoremaal.setText(R.string.skoleLogoBesk);
                imageView.setImageDrawable(skoleLogo);
                break;

            case 12:
                textView.setText(R.string.forsteBokstav);
                gjoremaal.setText(R.string.forsteBokstavBesk);
                imageView.setImageDrawable(forsteBokstav);
                break;

            case 13:
                textView.setText(R.string.skilt);
                gjoremaal.setText(R.string.skiltBesk);
                imageView.setImageDrawable(skilt);
                break;

            case 14:
                textView.setText(R.string.burgerEske);
                gjoremaal.setText(R.string.burgerEskeBesk);
                imageView.setImageDrawable(burgerEske);
                break;

            case 15:
                textView.setText(R.string.fjaer);
                gjoremaal.setText(R.string.fjaerBesk);
                imageView.setImageDrawable(fjaer);
                break;

            case 16:
                textView.setText(R.string.stinson);
                gjoremaal.setText(R.string.stinsonBesk);
                imageView.setImageDrawable(stinson);
                break;

            case 17:
                textView.setText(R.string.stoffbit);
                gjoremaal.setText(R.string.stoffbitBesk);
                imageView.setImageDrawable(stoffbit);
                break;

            case 18:
                textView.setText(R.string.champagnekork);
                gjoremaal.setText(R.string.champagnekorkBesk);
                imageView.setImageDrawable(champagnekork);
                break;

            case 19:
                textView.setText(R.string.billettArmband);
                gjoremaal.setText(R.string.billettArmbandBesk);
                imageView.setImageDrawable(billettArmband);
                break;

            case 20:
                textView.setText(R.string.amnesty);
                gjoremaal.setText(R.string.amnestyBesk);
                imageView.setImageDrawable(amnesty);
                break;

            case 21:
                textView.setText(R.string.plastskje);
                gjoremaal.setText(R.string.plastskjeBesk);
                imageView.setImageDrawable(plastskje);
                break;

            case 22:
                textView.setText(R.string.mobildeksel);
                gjoremaal.setText(R.string.mobildekselBesk);
                imageView.setImageDrawable(mobildeksel);
                break;

            case 23:
                textView.setText(R.string.legokloss);
                gjoremaal.setText(R.string.legoklossBesk);
                imageView.setImageDrawable(legokloss);
                break;

            case 24:
                textView.setText(R.string.tampong);
                gjoremaal.setText(R.string.tampongBesk);
                imageView.setImageDrawable(tampong);
                break;

            case 25:
                textView.setText(R.string.kritt);
                gjoremaal.setText(R.string.krittBesk);
                imageView.setImageDrawable(kritt);
                break;

            case 26:
                textView.setText(R.string.undertoy);
                gjoremaal.setText(R.string.undertoyBesk);
                imageView.setImageDrawable(undertoy);
                break;

            case 27:
                textView.setText(R.string.rodTrekant);
                gjoremaal.setText(R.string.rodTrekantBesk);
                imageView.setImageDrawable(rodTrekant);
                break;

            case 28:
                textView.setText(R.string.tequilaHatt);
                gjoremaal.setText(R.string.tequilaHattBesk);
                imageView.setImageDrawable(tequillaHatt);
                break;

            case 29:
                textView.setText(R.string.rose);
                gjoremaal.setText(R.string.roseBesk);
                imageView.setImageDrawable(rose);
                break;

            case 30:
                textView.setText(R.string.kjettingBit);
                gjoremaal.setText(R.string.kjettingBitBesk);
                imageView.setImageDrawable(kjettingBit);
                break;

            case 31:
                textView.setText(R.string.gStreng);
                gjoremaal.setText(R.string.gStrengBesk);
                imageView.setImageDrawable(gStreng);
                break;

            case 32:
                textView.setText(R.string.lokk);
                gjoremaal.setText(R.string.lokkBesk);
                imageView.setImageDrawable(lokk);
                break;

            case 33:
                textView.setText(R.string.peace);
                gjoremaal.setText(R.string.peaceBesk);
                imageView.setImageDrawable(peace);
                break;

            case 34:
                textView.setText(R.string.brodskive);
                gjoremaal.setText(R.string.brodskiveBesk);
                imageView.setImageDrawable(brodskive);
                break;

            case 35:
                textView.setText(R.string.ispinne);
                gjoremaal.setText(R.string.ispinneBesk);
                imageView.setImageDrawable(ispinne);
                break;

            case 36:
                textView.setText(R.string.russekortTilSorr);
                gjoremaal.setText(R.string.russekortSorrBesk);
                imageView.setImageDrawable(russekortSorr);
                break;

            case 37:
                textView.setText(R.string.redBull);
                gjoremaal.setText(R.string.redbullBesk);
                imageView.setImageDrawable(redBull);
                break;

            case 38:
                textView.setText(R.string.gummihanske);
                gjoremaal.setText(R.string.gummihanskeBesk);
                imageView.setImageDrawable(gummihanske);
                break;

            case 39:
                textView.setText(R.string.fastnokkel);
                gjoremaal.setText(R.string.fastnokkelBesk);
                imageView.setImageDrawable(fastnokkel);
                break;

            case 40:
                textView.setText(R.string.sammenklemtOlboks);
                gjoremaal.setText(R.string.sammenklemtOlboksBesk);
                imageView.setImageDrawable(sammenklemtOlboks);
                break;

            case 41:
                textView.setText(R.string.lappMedSvar);
                gjoremaal.setText(R.string.lappMedSvarBesk);
                imageView.setImageDrawable(lappMedSvar);
                break;

            case 42:
                textView.setText(R.string.spriteKork);
                gjoremaal.setText(R.string.spriteKorkBesk);
                imageView.setImageDrawable(spritekork);
                break;

            case 43:
                textView.setText(R.string.glowStick);
                gjoremaal.setText(R.string.glowStickBesk);
                imageView.setImageDrawable(glowStick);
                break;

            case 44:
                textView.setText(R.string.skismoring);
                gjoremaal.setText(R.string.skismoringBesk);
                imageView.setImageDrawable(skismoring);
                break;

            case 45:
                textView.setText(R.string.floyte);
                gjoremaal.setText(R.string.floyteBesk);
                imageView.setImageDrawable(floyte);
                break;

            case 46:
                textView.setText(R.string.kryssordark);
                gjoremaal.setText(R.string.kryssordarkBesk);
                imageView.setImageDrawable(kryssordark);
                break;

            case 47:
                textView.setText(R.string.litenIsbjorn);
                gjoremaal.setText(R.string.litenIsbjornBesk);
                imageView.setImageDrawable(litenIsbjorn);
                break;

            case 48:
                textView.setText(R.string.bildeDegOgFjortis);
                gjoremaal.setText(R.string.bildeDegOgFjortisBesk);
                imageView.setImageDrawable(bildeDegOgFjortis);
                break;

            case 49:
                textView.setText(R.string.gronnEllerRodChilli);
                gjoremaal.setText(R.string.gronnEllerRodChilliBesk);
                imageView.setImageDrawable(gronnEllerRodChilli);
                break;

            case 50:
                textView.setText(R.string.smokk);
                gjoremaal.setText(R.string.smokkBesk);
                imageView.setImageDrawable(smokk);
                break;

            case 51:
                textView.setText(R.string.toOgEnHalv);
                gjoremaal.setText(R.string.toOgEnHalvBesk);
                imageView.setImageDrawable(toOgEnHalvSeigmann);
                break;

            case 52:
                textView.setText(R.string.yesMan);
                gjoremaal.setText(R.string.yesManBesk);
                imageView.setImageDrawable(yesMan);
                break;

            case 53:
                textView.setText(R.string.bandana);
                gjoremaal.setText(R.string.bandanaBesk);
                imageView.setImageDrawable(bandana);
                break;

            case 54:
                textView.setText(R.string.gronnSeigdame);
                gjoremaal.setText(R.string.gronnSeigdameBesk);
                imageView.setImageDrawable(gronnSeigdame);
                break;

            case 55:
                textView.setText(R.string.kvist);
                gjoremaal.setText(R.string.kvistBesk);
                imageView.setImageDrawable(kvist);
                break;

            case 56:
                textView.setText(R.string.bananKlistremerke);
                gjoremaal.setText(R.string.bananKlistremerkeBesk);
                imageView.setImageDrawable(bananKlistremerke);
                break;

            case 57:
                textView.setText(R.string.motLogo);
                gjoremaal.setText(R.string.motLogoBesk);
                imageView.setImageDrawable(motLogo);
                break;

            case 58:
                textView.setText(R.string.plastgaffelGull);
                gjoremaal.setText(R.string.plastgaffelGullBesk);
                imageView.setImageDrawable(plastgaffelGull);
                break;

            case 59:
                textView.setText(R.string.godteriFisk);
                gjoremaal.setText(R.string.godteriFiskBesk);
                imageView.setImageDrawable(godteriFisk);
                break;

            case 60:
                textView.setText(R.string.selfieMedMorEllerFar);
                gjoremaal.setText(R.string.selfieMedMorEllerFarBesk);
                imageView.setImageDrawable(selfieMedMorEllerFar);
                break;

            case 61:
                textView.setText(R.string.lekestolGull);
                gjoremaal.setText(R.string.lekestolGullBesk);
                imageView.setImageDrawable(lekestolGull);
                break;

            case 62:
                textView.setText(R.string.leseBriller);
                gjoremaal.setText(R.string.leseBrillerBesk);
                imageView.setImageDrawable(lesebriller);
                break;

            case 63:
                textView.setText(R.string.rodEllerHvitVinKork);
                gjoremaal.setText(R.string.rodEllerHvitVinKorkBesk);
                imageView.setImageDrawable(rodEllerHvitVinkork);
                break;

            case 64:
                textView.setText(R.string.solbriller);
                gjoremaal.setText(R.string.solbrillerBesk);
                imageView.setImageDrawable(solbriller);
                break;

            case 65:
                textView.setText(R.string.sminkekost);
                gjoremaal.setText(R.string.sminkekostBesk);
                imageView.setImageDrawable(sminkekost);
                break;

            case 66:
                textView.setText(R.string.hubbaBubbaPapir);
                gjoremaal.setText(R.string.hubbaBubbaPapirBesk);
                imageView.setImageDrawable(hubbaBubbaPapir);
                break;

            case 67:
                textView.setText(R.string.attenAattiEnLogo);
                gjoremaal.setText(R.string.attenAattiEnLogoBesk);
                imageView.setImageDrawable(attenAattiEnLogo);
                break;

            case 68:
                textView.setText(R.string.yinYang);
                gjoremaal.setText(R.string.yinYangBesk);
                imageView.setImageDrawable(yinYang);
                break;

            case 69:
                textView.setText(R.string.vaatserviett);
                gjoremaal.setText(R.string.vaatserviettBesk);
                imageView.setImageDrawable(vaatserviett);
                break;

            case 70:
                textView.setText(R.string.kam);
                gjoremaal.setText(R.string.kamBesk);
                imageView.setImageDrawable(kam);
                break;

            case 71:
                textView.setText(R.string.litenPrompepute);
                gjoremaal.setText(R.string.litenPrompeputeBesk);
                imageView.setImageDrawable(litenPrompepute);
                break;

            case 72:
                textView.setText(R.string.happyMealLeke);
                gjoremaal.setText(R.string.happyMealLekeBesk);
                imageView.setImageDrawable(happyMealLeke);
                break;

            case 73:
                textView.setText(R.string.litenMikrofonEllerMegafon);
                gjoremaal.setText(R.string.litenMikrofonEllerMegafonBesk);
                imageView.setImageDrawable(litenMikrofonEllerMegafon);
                break;

            case 74:
                textView.setText(R.string.babysokk);
                gjoremaal.setText(R.string.babysokkBesk);
                imageView.setImageDrawable(babysokk);
                break;

            case 75:
                textView.setText(R.string.filterPaaRoyken);
                gjoremaal.setText(R.string.filterPaaRoykenBesk);
                imageView.setImageDrawable(filterPaaRoyken);
                break;

            case 76:
                textView.setText(R.string.tusjkork);
                gjoremaal.setText(R.string.tusjkorkBesk);
                imageView.setImageDrawable(tusjkork);
                break;

            case 77:
                textView.setText(R.string.vaskelapp);
                gjoremaal.setText(R.string.vaskelappBesk);
                imageView.setImageDrawable(vaskelapp);
                break;

            case 78:
                textView.setText(R.string.pappkopp);
                gjoremaal.setText(R.string.pappkoppBesk);
                imageView.setImageDrawable(pappkopp);
                break;

            case 79:
                textView.setText(R.string.cocktailSverd);
                gjoremaal.setText(R.string.cocktailSverdBesk);
                imageView.setImageDrawable(cocktailSverd);
                break;

            case 80:
                textView.setText(R.string.deodorantLokk);
                gjoremaal.setText(R.string.deodorantLokkBesk);
                imageView.setImageDrawable(deodorantLokk);
                break;

            case 81:
                textView.setText(R.string.klovneNese);
                gjoremaal.setText(R.string.klovneNeseBesk);
                imageView.setImageDrawable(klovneNese);
                break;

            case 82:
                textView.setText(R.string.litenL);
                gjoremaal.setText(R.string.litenLBesk);
                imageView.setImageDrawable(litenL);
                break;

            case 83:
                textView.setText(R.string.orepropp);
                gjoremaal.setText(R.string.oreproppBesk);
                imageView.setImageDrawable(orepropp);
                break;

            case 84:
                textView.setText(R.string.fargerikFjaer);
                gjoremaal.setText(R.string.fargerikFjaerBesk);
                imageView.setImageDrawable(fargerikFjaer);
                break;

            case 85:
                textView.setText(R.string.kondom);
                gjoremaal.setText(R.string.kondomBesk);
                imageView.setImageDrawable(kondom);
                break;

            case 86:
                textView.setText(R.string.proteinbarPapir);
                gjoremaal.setText(R.string.proteinbarPapirBesk);
                imageView.setImageDrawable(proteinbarPapir);
                break;

            case 87:
                textView.setText(R.string.femtilapp);
                gjoremaal.setText(R.string.femtilappBesk);
                imageView.setImageDrawable(femtilapp);
                break;

            case 88:
                textView.setText(R.string.blyant);
                gjoremaal.setText(R.string.blyantBesk);
                imageView.setImageDrawable(blyant);
                break;

            case 89:
                textView.setText(R.string.lekehund);
                gjoremaal.setText(R.string.lekehundBesk);
                imageView.setImageDrawable(lekehund);
                break;

            case 90:
                textView.setText(R.string.tomHalvliter);
                gjoremaal.setText(R.string.tomHalvliterBesk);
                imageView.setImageDrawable(tomHalvliter);
                break;

            case 91:
                textView.setText(R.string.kinobillett);
                gjoremaal.setText(R.string.kinobillettBesk);
                imageView.setImageDrawable(kinobillett);
                break;

            case 92:
                textView.setText(R.string.aageAleksandersen);
                gjoremaal.setText(R.string.aageAleksandersenBesk);
                imageView.setImageDrawable(aageAleksandersen);
                break;

            case 93:
                textView.setText(R.string.ylvisBilde);
                gjoremaal.setText(R.string.ylvisBildeBesk);
                imageView.setImageDrawable(ylvisBilde);
                break;

            case 94:
                textView.setText(R.string.godteriGebiss);
                gjoremaal.setText(R.string.godteriGebissBesk);
                imageView.setImageDrawable(godteriGebiss);
                break;

            case 95:
                textView.setText(R.string.matpapir);
                gjoremaal.setText(R.string.matpapirBesk);
                imageView.setImageDrawable(matpapir);
                break;

            case 96:
                textView.setText(R.string.sjokoKongle);
                gjoremaal.setText(R.string.sjokoKongleBesk);
                imageView.setImageDrawable(sjokoKongle);
                break;

            case 97:
                textView.setText(R.string.barbieEllerKen);
                gjoremaal.setText(R.string.barbieEllerKenBesk);
                imageView.setImageDrawable(barbieEllerKen);
                break;

            case 98:
                textView.setText(R.string.rodeKors);
                gjoremaal.setText(R.string.rodeKorsBesk);
                imageView.setImageDrawable(rodeKors);
                break;

            case 99:
                textView.setText(R.string.sokk);
                gjoremaal.setText(R.string.sokkBesk);
                imageView.setImageDrawable(sokk);
                break;

            case 100:
                textView.setText(R.string.bildeAvWaldo);
                gjoremaal.setText(R.string.bildeAvWaldoBesk);
                imageView.setImageDrawable(bildeAvWaldo);
                break;
        }
    }
}